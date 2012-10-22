package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.Preprocessor;
import ru.andremoniy.objctojavacnv.antlr.output.ObjchLexer;
import ru.andremoniy.objctojavacnv.antlr.output.ObjchParser;
import ru.andremoniy.objctojavacnv.context.ProjectContext;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 9:32
 */
public class ConverterH {

    public static final Logger log = LoggerFactory.getLogger(ConverterH.class);

    private static final int UNDEFINED_TYPEDEF = 0;
    private static final int RENAME_TYPEDEF = 1;
    private static final int ENUM_TYPEDEF = 2;
    private static final int STRUCT_TYPEDEF = 3;

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static StringBuilder convert_h(String fileName, ProjectContext projectContext, StringBuilder originalImportsSb, StringBuilder importsSb) throws IOException, RecognitionException {
        File phfile = new File(fileName + "p");
        File hfile = phfile.exists() ? phfile : new File(fileName);

        final boolean categoryClass = hfile.getName().contains("+");
        final String categoryName = categoryClass ? hfile.getName().substring(hfile.getName().indexOf("+") + 1, hfile.getName().lastIndexOf(".")) : null;

        // new file with java code
        String className = "I" + hfile.getName().substring(0, hfile.getName().lastIndexOf("."))/* + "_h"*/;
        File hjfile = new File(hfile.getParent() + File.separator + className + ".java");
        hjfile.createNewFile();

        projectContext.newClass(className, categoryName);

        String packageName = hfile.getParent().substring(hfile.getParent().lastIndexOf("src") + 4).replace(File.separator, ".");

        StringBuilder objCcode = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(hfile);
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("utf-8"));
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                objCcode.append(line).append("\n");
            }
        }

        String input = objCcode.toString();
        input = input.replace("///", "//");

        input = Preprocessor.replace(input, projectContext, fileName);

        CharStream cs = new ANTLRStringStream(input);
        ObjchLexer lexer = new ObjchLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        ObjchParser parser = new ObjchParser(tokens);

        ObjchParser.code_return result = parser.code();

        StringBuilder sb = new StringBuilder();

        if (originalImportsSb == null) {
            originalImportsSb = new StringBuilder();
        }
        Utils.addOriginalImports(input, projectContext, originalImportsSb);

        if (!categoryClass) {
            sb.append("package ").append(packageName).append(";\n\n");

            // todo: process imports sections
            sb.append("import ru.andremoniy.jcocoa.*;\n");
            sb.append(originalImportsSb);
        }

        if (result.getTree() == null) return sb; // не ошибка, просто в файле одни комментарии
        CommonTree tree = (CommonTree) result.getTree();

        StringBuilder sb2 = new StringBuilder();

        CommonTree interfaceTree = tree.getType() == ObjchParser.INTERFACE ? tree : (CommonTree) tree.getFirstChildWithType(ObjchParser.INTERFACE);

        if (!categoryClass) {
            if (interfaceTree == null) {
                sb2.append("public abstract class ").append(className).append(" {\n");
            } else {
                h_process_interface1(sb2, interfaceTree, projectContext);
            }
        }

        process_header_body(sb2, tree, projectContext);

        if (importsSb == null) {
            importsSb = new StringBuilder();
        }
        Utils.addAdditionalImports(importsSb, projectContext);

        if (!categoryClass) {
            Set<String> categoriesList = projectContext.categories.get(hfile.getName().substring(0, hfile.getName().indexOf(".")));
            if (categoriesList != null) {
                for (String category : categoriesList) {
                    sb2.append("\n\n");
                    sb2.append("\t// from category: ").append(category).append("\n\n");
                    sb2.append(convert_h(category, projectContext, originalImportsSb, importsSb));
                }
            }

            sb2.append("}\n"); // end of class

            sb.append(importsSb);
        }

        sb.append(sb2);

        if (!categoryClass) {
            try (FileOutputStream fos = new FileOutputStream(hjfile);
                 BufferedOutputStream bos = new BufferedOutputStream(fos)) {

                bos.write(sb.toString().getBytes("utf-8"));
            }
        }

        return sb;

    }

    private static void process_header_body(StringBuilder sb2, CommonTree tree, ProjectContext projectContext) {
        if (tree.getType() == ObjchParser.INTERFACE) {
            h_process_interface2(sb2, tree, projectContext);
        } else {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                switch (childTree.token.getType()) {
                    case ObjchParser.TYPEDEF:
                        h_process_typedef(sb2, childTree, projectContext);
                        break;
                    case ObjchParser.INTERFACE:
                        h_process_interface2(sb2, childTree, projectContext);
                        break;
                    case ObjchParser.EXTERN:
                        h_process_extern(sb2, childTree, projectContext);
                        break;
                    case ObjchParser.ENUM:
                        List<String[]> enumElements = h_parse_enum(childTree);
                        CommonTree enumNameTree = (CommonTree) childTree.getFirstChildWithType(ObjchParser.NAME);
                        if (enumNameTree != null) {
                            String enumName = enumNameTree.getChild(0).getText();
                            finish_enum(sb2, projectContext, enumName, enumElements);
                        } else {
                            for (String[] enumElement : enumElements) {
                                sb2.append("public static Integer ").append(enumElement[0]).append(" = ").append(enumElement[1]).append(";\n");
                            }
                        }
                        break;
                }
            }
        }
    }

    private static void h_process_extern(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.FIELD_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }

        sb.append("\t").append("public static ").append(Utils.transformType(type, projectCtx.classCtx)).append(" ").append(name).append(";\n");
    }

    private static void h_process_method(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        String modifier = "";
        Map<String, String> params = new LinkedHashMap<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.MODIFIER:
                    modifier = ((CommonTree) child).getChild(0).toString();
                    if (modifier.equals("+")) return; // static методы не описываем в интерфейсе!
                    break;
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.METHOD_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.METHOD_PARAMS:
                    h_process_method_params(params, (CommonTree) child, projectCtx);
                    break;
            }
        }
        String transType = Utils.transformType(type, projectCtx.classCtx);
        sb.append("\t").append("public ").append(transType).append(" ").append(projectCtx.classCtx.categoryName != null ? "_" + projectCtx.classCtx.categoryName + "_" : "").append(name).append("(");
        boolean f = true;
        for (String pName : params.keySet()) {
            if (!f) {
                sb.append(", ");
            } else {
                f = false;
            }
            sb.append(params.get(pName)).append(" ").append(pName);
        }
        sb.append(") { return ").append(transType.equals("void") ? "" : (transType.equals("boolean") ? "false" : "null")).append(";\n};\n");
    }

    private static void h_process_method_params(Map<String, String> params, CommonTree tree, ProjectContext projectContext) {
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.METHOD_PARAM:
                    h_process_method_param(params, (CommonTree) child, projectContext);
                    break;
            }
        }
    }

    private static void h_process_method_param(Map<String, String> params, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.PARAM_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }
        params.put(name, Utils.transformType(type, projectCtx.classCtx));
    }

    private static void h_process_interface1(StringBuilder sb, CommonTree tree, ProjectContext context) {
        String interfaceName = "";
        String superclassName = "";
        String category = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.CATEGORY:
                    category = ((CommonTree) child).getChild(0).toString();
                    // TODO: use category
                    break;
                case ObjchParser.INTERFACE_NAME:
                    interfaceName = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.SUPERCLASS_NAME:
                    superclassName = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }

        if (superclassName.length() > 0) {
            // добавим import этого класса:
            String superClassPath = context.imports.get(superclassName);
            if (superClassPath != null) {
                sb.append("import ").append(superClassPath).append(";\n\n");
            }
        }

        sb.append("public abstract class I").append(interfaceName)./*append("_h").*/append(superclassName.length() > 0 ? (" extends " + superclassName) : "").append(" {\n");

    }

    private static void h_process_interface2(StringBuilder sb, CommonTree tree, ProjectContext projectContext) {
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.FIELDS:
                    h_process_fields(sb, (CommonTree) child, projectContext);
                    break;
                case ObjchParser.METHOD:
                    h_process_method(sb, (CommonTree) child, projectContext);
                    break;
            }
        }

    }

    private static void h_process_fields(StringBuilder sb, CommonTree tree, ProjectContext projectContext) {
        sb.append("\n");
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.FIELD:
                    h_process_field(sb, (CommonTree) child, projectContext);
                    break;
            }
        }
        sb.append("\n");
    }

    private static void h_process_field(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        List<String> fieldNameList = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.FIELD_NAME:
                    fieldNameList.add(((CommonTree) child).getChild(0).toString());
                    break;
            }
        }
        sb.append("\t").append("protected ").append(Utils.transformType(type, projectCtx.classCtx)).append(" ");
        boolean f = true;
        for (String fieldName : fieldNameList) {
            if (!f) {
                sb.append(", ");
            }
            f = false;
            sb.append(fieldName);
        }
        sb.append(";\n");
    }

    private static void h_process_typedef(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        String name = "";
        String oldName = "";
        int typedef_type = UNDEFINED_TYPEDEF;
        List<String[]> enumElements = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPEDEF_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.TYPEDEF_ELEMENT:
                    enumElements.add(new String[]{((CommonTree) child).getChild(0).toString()});
                    break;
                case ObjchParser.OLD_NAME:
                    oldName = ((CommonTree) child).getChild(0).toString();
                    typedef_type = RENAME_TYPEDEF;
                    break;
                case ObjchParser.ENUM:
                    enumElements = h_parse_enum((CommonTree) child);
                    typedef_type = ENUM_TYPEDEF;
                    break;
                case ObjchParser.STRUCT:
                    enumElements = h_parse_struct((CommonTree) child, projectCtx);
                    typedef_type = STRUCT_TYPEDEF;
                    break;
            }
        }
        sb.append("\n");
        if (typedef_type == ENUM_TYPEDEF) {
            finish_enum(sb, projectCtx, name, enumElements);
        } else if (typedef_type == RENAME_TYPEDEF) {
            sb.append("\tpublic static class ").append(name).append(" extends ").append(oldName).append(" { }");
        } else if (typedef_type == STRUCT_TYPEDEF) {
            sb.append("\tpublic static class ").append(name).append(" {\n");
            for (String[] field : enumElements) {
                sb.append("\t\t").append(field[0]);
            }
            sb.append("\t}\n");
        }
    }

    private static void finish_enum(StringBuilder sb, ProjectContext projectContext, String name, List<String[]> enumElements) {

        sb.append("\tpublic enum ").append(name).append(" {\n");
        for (int i = 0, enumElementsSize = enumElements.size(); i < enumElementsSize; i++) {
            String element = enumElements.get(i)[0];
            sb.append("\t\t").append(element);
            projectContext.staticFields.put(element, projectContext.classCtx.className + "." + name);
            if (i < enumElementsSize - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("\t").append("}\n");

        List<String> enums = projectContext.headerEnums.get(projectContext.classCtx.className);
        if (enums == null) {
            enums = new ArrayList<>();
            projectContext.headerEnums.put(projectContext.classCtx.className, enums);
        }
        enums.add(name);
    }

    private static List<String[]> h_parse_struct(CommonTree tree, ProjectContext projectCtx) {
        List<String[]> fields = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.FIELD:
                    fields.add(new String[]{h_parse_field((CommonTree) child, projectCtx)});
                    break;
            }
        }
        return fields;
    }

    private static String h_parse_field(CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.FIELD_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }
        return Utils.transformType(type, projectCtx.classCtx) + " " + name + ";\n";
    }

    private static List<String[]> h_parse_enum(CommonTree tree) {
        List<String[]> enumElements = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjchParser.TYPEDEF_ELEMENT:
                    String id = childTree.getChild(0).toString();
                    String value = null;
                    Tree nameTree = childTree.getFirstChildWithType(ObjchLexer.VALUE);
                    if (nameTree != null) {
                        value = nameTree.getChild(0).getText();
                    }
                    enumElements.add(new String[]{id, value});
                    break;
            }
        }
        return enumElements;
    }
}
