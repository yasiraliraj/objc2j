package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.Preprocessor;
import ru.andremoniy.objctojavacnv.antlr.output.ObjcmLexer;
import ru.andremoniy.objctojavacnv.antlr.output.ObjcmParser;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

import static ru.andremoniy.objctojavacnv.Utils.transformObject;
import static ru.andremoniy.objctojavacnv.Utils.transformType;

/**
 * User: Andremoniy
 * Date: 12.06.12
 * Time: 1:14
 */

// package ru.andremoniy.objctojavacnv.antlr.output;

public class ConverterM {

    public static final Logger log = LoggerFactory.getLogger(ConverterM.class);

    private static final List<String> RESTRICTED_METHODS = Arrays.asList("release", "retain", /*"autorelease", */"dealloc"/*, "init"*/);
    private static final Map<Integer, String> OPS_NUMBER = new HashMap<Integer, String>() {{
        put(ObjcmLexer.L_MINUS, "minus");
        put(ObjcmLexer.L_PLUS, "plus");
        put(ObjcmLexer.L_DIV, "divide");
        put(ObjcmLexer.ASTERISK, "multiple");
        put(ObjcmLexer.L_PERC, "percent");
        put(ObjcmLexer.L_MORE, "more");
        put(ObjcmLexer.L_MORE_EQ, "moreEquals");
        put(ObjcmLexer.L_LESS, "less");
        put(ObjcmLexer.L_LESS_EQ, "lessEquals");
        put(ObjcmLexer.L_EQ_EQ, "equals");
        put(ObjcmLexer.L_NEQ, "notEquals");
        put(ObjcmLexer.L_EQ, "set");
        put(ObjcmLexer.L_PLUS_EQ, "setPlus");
        put(ObjcmLexer.L_MINUS_EQ, "setMinus");
        put(ObjcmLexer.L_DIV_EQ, "setDivide");
        put(ObjcmLexer.L_MULT_EQ, "setMultiple");
        put(ObjcmLexer.L_AND, "and");
        put(ObjcmLexer.L_AND_AND, "andAnd");
        put(ObjcmLexer.L_OR, "or");
        put(ObjcmLexer.L_OR_OR, "orOr");
        put(ObjcmLexer.L_AND_EQ, "setAnd");
        put(ObjcmLexer.L_OR_EQ, "setOr");
        put(ObjcmLexer.L_XOR, "xor");
        put(ObjcmLexer.L_XOR_EQ, "setXor");
    }};

    private static final List<List<Integer>> OPERATIONS_ORDER = new ArrayList<List<Integer>>() {{
        add(new ArrayList<Integer>());
        add(Arrays.asList(ObjcmLexer.L_OR_OR));
        add(Arrays.asList(ObjcmLexer.L_AND_AND));
        add(Arrays.asList(ObjcmLexer.L_OR));
        add(Arrays.asList(ObjcmLexer.L_XOR));
        add(Arrays.asList(ObjcmLexer.L_AND));
        add(Arrays.asList(ObjcmLexer.L_EQ_EQ, ObjcmLexer.L_NEQ));
        add(Arrays.asList(ObjcmLexer.L_LESS, ObjcmLexer.L_MORE, ObjcmLexer.L_LEFT_EQ, ObjcmLexer.L_MORE_EQ));
        add(Arrays.asList(ObjcmLexer.L_LEFT, ObjcmLexer.L_RIGHT));
        add(Arrays.asList(ObjcmLexer.L_PLUS, ObjcmLexer.L_MINUS));
        add(Arrays.asList(ObjcmLexer.ASTERISK, ObjcmLexer.L_DIV, ObjcmLexer.L_PERC));
    }};
    private static final List<Integer> EXPR_ORDER = Arrays.asList(
            ObjcmLexer.EXPR_OR_OR, ObjcmLexer.EXPR_AND_AND, ObjcmLexer.EXPR_OR, ObjcmLexer.EXPR_XOR, ObjcmLexer.EXPR_AND, ObjcmLexer.EXPR_EQ,
            ObjcmLexer.EXPR_COND, ObjcmLexer.EXPR_MOV, ObjcmLexer.EXPR_ADD, ObjcmLexer.EXPR_MULT, ObjcmLexer.EXPR_TYPE);

    public static StringBuilder convert_m(String fileName, Context ctx, StringBuilder addSb) throws IOException, RecognitionException {
        Context.m_counter++;
        log.info(Context.m_counter + " m files processed");

        File pmfile = new File(fileName + "p");
        File mfile = pmfile.exists() ? pmfile : new File(fileName);

        final boolean categoryClass = mfile.getName().contains("+");
        final String categoryName = categoryClass ? mfile.getName().substring(mfile.getName().indexOf("+") + 1, mfile.getName().lastIndexOf(".")) : null;
        if (!categoryClass) {
            ctx.renew();
        }

        // new file with java code
        String className1 = mfile.getName().substring(0, mfile.getName().lastIndexOf("."));
        File mjfile = new File(mfile.getParent() + File.separator + className1 + ".java");
        mjfile.createNewFile();

        String packageName = mfile.getParent().substring(mfile.getParent().lastIndexOf("src") + 4).replace(File.separator, ".");

        StringBuilder objCcode = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(mfile);
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("utf-8"));
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                objCcode.append(line).append("\n");
            }
        }

        String input = objCcode.toString();
        input = input.replace("///", "//");

        log.info("Preprocessing... ");
        input = Preprocessor.replace(input, ctx, fileName);
        log.info("ok");

        CharStream cs = new ANTLRStringStream(input);
        ObjcmLexer lexer = new ObjcmLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        ObjcmParser parser = new ObjcmParser(tokens);

        ObjcmParser.code_return result = parser.code();

        CurrentContext cc = new CurrentContext(ctx, className1, false);

        StringBuilder sb = new StringBuilder();

        if (!categoryClass) {
            sb.append("package ").append(packageName).append(";\n\n");

            // process imports sections
            sb.append("import ru.andremoniy.jcocoa.*;\n");
            sb.append("import java.util.List;\n");
            sb.append("import java.util.Arrays;\n");
            sb.append("import java.util.ArrayList;\n");
            sb.append("import static ru.andremoniy.jcocoa.MathEx.*;\n");
            sb.append("import static ru.andremoniy.jcocoa.Utils.*;\n");
            sb.append("import static ru.andremoniy.jcocoa.NSException.*;\n");
            sb.append("import static ru.andremoniy.jcocoa.Constants.*;\n");

        }

        if (addSb == null) {
            addSb = new StringBuilder();
        }
        Utils.addOriginalImports(input, ctx, addSb);

        StringBuilder catSb = new StringBuilder();

        if (!categoryClass) {
            sb.append(addSb);
            // идем по всем категориям в поиска import-ов

            Set<String> categoriesList = ctx.categories.get(mfile.getName().substring(0, mfile.getName().indexOf(".")));
            if (categoriesList != null) {
                for (String category : categoriesList) {
                    catSb.append(convert_m(category, ctx, addSb));
                }
            }
        }

        if (!categoryClass) {
            if (cc.ctx.localCategories.isEmpty()) {
                cc.ctx.categoryList = "null";
            } else {
                cc.ctx.categoryList = "";
                for (String category : cc.ctx.localCategories) {
                    if (!cc.ctx.categoryList.isEmpty()) cc.ctx.categoryList += ",";
                    cc.ctx.categoryList += "\"" + category + "\"";
                }
                cc.ctx.categoryList = "Arrays.asList(" + cc.ctx.categoryList + ")";
            }

            sb.append("\n");
        }
        // sb - это будет основной билдер класса. Туда будем по необходимости дописывать import-ы

        CommonTree tree = (CommonTree) result.getTree();
        CommonTree implementationTree = tree.getType() == ObjcmLexer.IMPLEMENTATION ? tree : (CommonTree) ((CommonTree) result.getTree()).getFirstChildWithType(ObjcmLexer.IMPLEMENTATION);
        if (implementationTree == null) return sb;

        StringBuilder sb2 = new StringBuilder(); // билдер класса
        if (!categoryClass) {
            m_process_implementation1(sb2, implementationTree, className1);
        }

        if (tree == implementationTree) {
            m_process_implementation2(sb2, tree, cc, categoryName);
        } else {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                switch (childTree.token.getType()) {
                    case ObjcmLexer.OPERATOR:
                        m_process_operator(sb2, childTree, cc, categoryName);
                        break;
                    case ObjcmLexer.FIELD:
                        m_process_field(sb2, childTree, cc);
                        break;
                    case ObjcmLexer.INTERFACE:
                        m_process_interface(sb2, childTree, cc);
                        break;
                    case ObjcmLexer.IMPLEMENTATION:
                        m_process_implementation2(sb2, childTree, cc, categoryName);
                        break;
                }
            }
        }

        if (categoryClass) return sb2;

        Utils.addAdditionalImports(sb, ctx);

        if (!cc.ctx.containsInit) {
            addInitMethod(sb2, className1);
        }
        if (!cc.ctx.containsAutoRelease) {
            addAutoReleaseMethod(sb2, className1);
        }

        sb2.append(catSb);

        sb2.append("}\n"); // end of class

        sb.append(sb2); // соединяем шапку с классом

        String javaCode = sb.toString();
        javaCode = javaCode.replaceAll(";(\\s|\n|\r)*;+", ";");

        // избавляемся от конструкций вида "this = null"
        javaCode = javaCode.replaceAll("this\\s*=\\s*null", "");
        // избавляемся от конструкций вида "this = ..."
        javaCode = javaCode.replaceAll("this\\s*=\\s*", "");

        try (FileOutputStream fos = new FileOutputStream(mjfile);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(javaCode.getBytes("utf-8"));
        }

        return sb;
    }

    private static void m_process_interface(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        CommonTree nameTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.NAME);
        String interfaceName = Utils.getText(nameTree);
        boolean sameInterface = interfaceName.equals(cc.className);
        if (!sameInterface) {
            sb.append("public static interface ").append(interfaceName).append(" {\n");
        }
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                // Это статическое поле или метод
                case ObjcmLexer.METHOD:
                    if (sameInterface) break;
                    m_process_method(sb, childTree, new CurrentContext(cc.ctx, interfaceName, false), false, null);
                    break;
            }
        }
        if (!sameInterface) {
            sb.append("}\n");
        }
    }

    private static void m_process_operator(StringBuilder sb, CommonTree tree, CurrentContext cc, String categoryName) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                // Это статическое поле или метод
                case ObjcmLexer.M_TYPE_START:
                    m_process_type_start(sb, childTree, cc);
                    break;
                case ObjcmLexer.INTERFACE:
                    m_process_interface(sb, childTree, cc);
                    break;
                case ObjcmLexer.STATIC:
                    m_process_static(sb, childTree, cc);
                    break;
                default:
                    if (childTree.getChildCount() == 0) {
                        sb.append(childTree.getText());
                    }
                    break;
            }
        }
    }

    private static void m_process_type_start(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        StringBuilder lsb = new StringBuilder();
        boolean isStatic = false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                // Это статическое поле или метод
                case ObjcmLexer.TYPE:
                    StringBuilder sb1 = new StringBuilder();
                    readChildren(sb1, childTree, cc.gem(false));
                    lsb.append(transformType(sb1.toString(), cc));
                    lsb.append(" ");
                    break;
                case ObjcmLexer.NAME:
                    readChildren(lsb, childTree, cc.gem(false));
                    break;
                case ObjcmLexer.FIELD:
                    lsb.append("=");
                    lsb.append(m_process_field_value((CommonTree) childTree.getFirstChildWithType(ObjcmLexer.VALUE), cc));
                    break;
                default:
                    if (child.toString().equals("static")) isStatic = true;
                    lsb.append(Utils.getText(childTree));
                    lsb.append(" ");
                    break;
            }
        }

        if (!isStatic && !lsb.toString().trim().isEmpty()) {
            sb.append("public static ");
        }

        sb.append(lsb);
        sb.append(";");
    }

    private static void m_process_static(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        boolean isField = false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE:
                    StringBuilder sb1 = new StringBuilder();
                    readChildren(sb1, childTree, cc.gem(true));
                    sb.append(" public ");
                    sb.append(transformType(sb1.toString(), cc));
                    sb.append(" ");
                    break;
                case ObjcmLexer.NAME:
                    readChildren(sb, childTree, cc.gem(true));
                    break;
                case ObjcmLexer.FIELD:
                    isField = true;
                    CommonTree value = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.VALUE);
                    if (value != null) {
                        sb.append("=");
                        sb.append(m_process_field_value(value, cc));
                    }
                    break;
                // Это статическое поле или метод
                case ObjcmLexer.METHOD:
                    m_process_params(sb, childTree, cc);
                    CommonTree blockTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.BLOCK);
                    if (blockTree != null) {
                        m_process_block(sb, blockTree, cc.gem(false));
                    } else {
                        m_process_params(sb, childTree, cc);
                    }
                    break;
                default:
                    sb.append(Utils.getText(childTree));
                    sb.append(" ");
                    break;
            }
        }
        sb.append("\n\n");
        if (isField) {
            sb.append(";\n");
        }
    }

    private static void m_process_params(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        StringBuilder lsb = new StringBuilder();
        lsb.append("(");
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.PARAM:
                    String type = Utils.getText((CommonTree) childTree.getFirstChildWithType(ObjcmLexer.TYPE)).trim();
                    String name = Utils.getText((CommonTree) childTree.getFirstChildWithType(ObjcmLexer.NAME)).trim();
                    if (lsb.length() > 1) lsb.append(", ");
                    lsb.append(transformType(type, cc)).append(" ").append(name);
                    break;
            }
        }
        lsb.append(")");

        sb.append(lsb);
    }

    private static void readChildren(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        if (tree.getChildren() == null) {
            String trObj = transformObject(tree.toString(), cc);
            sb.append(trObj);
            if (!trObj.equals("this")) {
                sb.append(" ");
            }
            return;
        }
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            readChildren(sb, childTree, cc);
        }
    }

    private static void m_process_implementation1(StringBuilder sb, CommonTree tree, String _className) {
        String className = tree.getFirstChildWithType(ObjcmLexer.NAME).getChild(0).toString();

        if (className.equals(_className)) {
            sb.append("public class ").append(className).append(" extends I").append(className).append(" {\n");
        }
    }

    private static void addAutoReleaseMethod(StringBuilder sb, String className) {
        sb.append("\n");
        sb.append("\tpublic ").append(className).append(" autorelease() {\n");
        sb.append("\t\treturn this; // TODO \n");
        sb.append("\t}\n\n");
    }

    private static void addInitMethod(StringBuilder sb, String className) {
        sb.append("\n");
        sb.append("\tpublic ").append(className).append(" init() {\n");
        sb.append("\t\treturn this;\n");
        sb.append("\t}\n\n");
    }

    private static void m_process_implementation2(StringBuilder sb, CommonTree tree, CurrentContext cc, String categoryName) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.FIELD:
                    m_process_field2(sb, childTree, cc);
                    break;
                case ObjcmLexer.METHOD:
                    m_process_method(sb, childTree, cc, false, categoryName);
                    break;
                case ObjcmLexer.STATIC_METHOD:
                    m_process_method(sb, childTree, cc, true, categoryName);
                    break;
                case ObjcmLexer.STATIC:
                    m_process_static(sb, childTree, cc);
                    break;
                case ObjcmLexer.TYPEDEF_STRUCT:
                    m_process_typedef_struct(sb, childTree, cc);
                    break;
            }
        }
    }

    private static void m_process_typedef_struct(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        CommonTree nameTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.NAME);
        String name = nameTree.getChild(0).toString();

        sb.append("public static class ").append(name).append(" {\n");

        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;

            switch (childTree.getType()) {
                case ObjcmLexer.STRUCT_FIELD:
                    CommonTree typeTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.TYPE);
                    StringBuilder typeSb = new StringBuilder();
                    readChildren(typeSb, typeTree, cc);

                    CommonTree fieldNameTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.NAME);
                    StringBuilder fieldNameSb = new StringBuilder();
                    readChildren(fieldNameSb, fieldNameTree, cc);

                    sb.append("public ").append(transformType(typeSb.toString(), cc)).append(" ").append(fieldNameSb.toString()).append(";\n");
                    break;
            }
        }

        sb.append("}\n\n");
    }

    private static void m_process_method(StringBuilder sb, CommonTree tree, CurrentContext cc, boolean static_flag, String categoryName) {
        String modifier = "";
        String type = "";
        String name = "";
        Map<String, String> params = new LinkedHashMap<>();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.MODIFIER:
                    modifier = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.TYPE:
                    type = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.PARAM:
                    m_process_param(params, childTree, cc);
                    break;
            }
        }

        if (name.equals("init") && params.isEmpty()) cc.ctx.containsInit = true;
        if (name.equals("autoRelease") && params.isEmpty()) cc.ctx.containsAutoRelease = true;

        String modifier_sb = modifier.length() > 0 ? (modifier.equals("-") ? "" : "static") : "";
        if (static_flag) modifier_sb = "static";

        sb.append("public ").append(modifier_sb).append(" ").append(transformType(type, cc)).append(" ").append(categoryName != null ? "_" + categoryName + "_" : "").append(name).append("(");

        // обратный переход,т.к. static мог бысть установлен не только из static_flag
        if (modifier_sb.equals("static")) static_flag = true;
        boolean f = true;
        for (String pName : params.keySet()) {
            if (!f) {
                sb.append(", ");
            } else {
                f = false;
            }
            sb.append(params.get(pName)).append(" ").append(pName);
        }
        sb.append(") ");
        CommonTree blockTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.BLOCK);
        if (blockTree != null) {
            m_process_block(sb, blockTree, cc.gem(static_flag, name));
        } else {
            sb.append("{};\n");
        }
        sb.append("\n\n");
    }

    private static void m_process_block(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        List children = tree.getChildren();
        boolean wasReturn = false;
        boolean fieldAccess = false;
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                /*********************************/
                /** new block with expressions **/
                /*******************************/
                case ObjcmLexer.CLASSICAL_EXPR_2:
                    process_classical_expr(sb, childTree, cc, true, false);
                    break;
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, cc, false, false);
                    break;
                case ObjcmLexer.EXPR_FULL:
                    process_expr_full(sb, childTree, cc, true);
                    break;
                case ObjcmLexer.FOR_IN_STMT:
                    sb.append(" : ");
                    m_process_block(sb, childTree, cc);
                    break;
                case ObjcmLexer.STATIC_START:
                    m_process_static_start(sb, childTree, cc);
                    break;
                case ObjcmLexer.WHILE_STMT:
                    m_process_while_stmt(sb, childTree, cc);
                    break;
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, cc);
                    break;
                case ObjcmLexer.BLOCK:
                    m_process_block(sb, childTree, cc);
                    wasReturn = false;
                    break;
                case ObjcmLexer.SWITCH:
                    m_process_switch(sb, childTree, cc);
                    break;
                case ObjcmLexer.BR_STMT:
                    if (childTree.getChildren() != null) {
                        m_process_br_stmt(sb, childTree, cc);
                    }
                    break;
                case ObjcmLexer.IF_STMT:
                    m_process_if_stmt(sb, childTree, cc);
                    break;
                case ObjcmLexer.SELECTOR:
                    m_process_selector(sb, childTree, cc);
                    break;
                case ObjcmLexer.BREAK:
                    cc.isBreak = true;
                    if (!cc.skipBreak) {
                        sb.append("break;\n");
                    }
                    break;
                case ObjcmLexer.RETURN_STMT:
                    cc.isBreak = true;
                    sb.append("return ");
                    StringBuilder rsb = new StringBuilder();
                    m_process_block(rsb, childTree, cc);
                    sb.append(rsb);
                    break;
                case ObjcmLexer.THROW_STMT:
                    sb.append("throw new RuntimeException(\"empty\");\n");
                    break;
                case ObjcmLexer.FIELD_ACCESS:
                    StringBuilder fasb = new StringBuilder();
                    m_process_block(fasb, childTree, cc);
                    if (!fieldAccess) {
                        sb.append(".");
                    } else {
                        sb.append("\"");
                    }
                    sb.append(fasb);
                    if (fieldAccess) {
                        sb.append("\")");
                    }
                    fieldAccess = false;
                    break;
                default:
                    if (testBrackets(children, i, childrenSize, child)) break;
                    StringBuilder lsb = new StringBuilder();
                    if (childTree.getChildCount() == 0) {
                        lsb.append(transformObject(childTree.getText(), cc));
                    } else {
                        m_process_block(lsb, childTree, cc);
                    }
                    if (lsb.toString().equals("case")) {
                        wasReturn = false;
                    }
                    switch (lsb.toString()) {
                        case "@try":
                            lsb = new StringBuilder("try");
                            break;
                        case "@catch":
                            lsb = new StringBuilder("catch");
                            break;
                        case "@finally":
                            lsb = new StringBuilder("finally");
                            break;
/*
                        case "@throw":
                            lsb = new StringBuilder("throw");
                            break;
*/
                        case "_cmd":
                            lsb = new StringBuilder("\"" + cc.methodName + "\"");
                            break;
                    }

                    // в objective-c разрешены "break" после "return" в блоках "case"
                    // необходимо это предусмотреть
                    String prepared = lsb.toString().replaceAll(";", " ;");
                    if (wasReturn && prepared.equals("break") || prepared.startsWith("break ")) {
                        // skip
                    } else {
                        sb.append(lsb).append(" ");
                    }
                    wasReturn = prepared.equals("return") || prepared.startsWith("return ");

                    break;
            }
        }
    }

    private static void process_expr_full(StringBuilder sb, CommonTree tree, CurrentContext cc, boolean leftAssign) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                process_classical_expr(sb, childTree, cc, leftAssign, false);
            } else if (childTree.getType() == ObjcmLexer.COMMA) {
                sb.append(", ");
            }
        }
    }

    private static void process_expr_assign(StringBuilder sb, CommonTree tree, CurrentContext cc, boolean doWrap) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                process_classical_expr(sb, childTree, cc, false, false);
            } else {
                if (childTree.getType() == ObjcmLexer.ASSIGN) {
                    if (doWrap) continue;
                }
                // добавляем знаки приравнивания
                readChildren(sb, childTree, cc);
            }
        }
    }

    private static void process_classical_expr(StringBuilder sb, CommonTree tree, CurrentContext cc, boolean leftAssign, boolean isIncompletePrefix) {
        boolean isIf3 = tree.getFirstChildWithType(ObjcmLexer.EXPR_QUESTION) != null;
        boolean isAssign = leftAssign || recursiveSearchExists(tree, ObjcmLexer.EXPR_ASSIGN);

        boolean doWrap = false;
        if (tree.getFirstChildWithType(ObjcmLexer.EXPR_ASSIGN) != null) {
            // проверим, если первый найденный ClassicalExpr содержит FieldAccess, то оборачиваем все выражение:
            CommonTree sef = tree;
            if (tree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                sef = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SIMPLE_EXPR);
            } else {
                sef = (CommonTree) tree.getChild(0);
            }
            boolean isLeftSimple = !(recursiveSearchExists(sef, ObjcmLexer.FIELD_ACCESS));
            if (!isLeftSimple) {
                CommonTree assignOperator = recursiveSearchTree((CommonTree) tree.getFirstChildWithType(ObjcmLexer.EXPR_ASSIGN), ObjcmLexer.ASSIGN);
                sb.append(OPS_NUMBER.get(assignOperator.getChild(0).getType())).append("(");
                doWrap = true;
            }
        }
        int ororCounter = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;

            switch (childTree.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    // только внутри скобок
                    process_classical_expr(sb, childTree, cc, isAssign, false);
                    break;
                case ObjcmLexer.EXPR_ASSIGN:
                    if (doWrap) {
                        sb.append(", ");
                    }
                    process_expr_assign(sb, childTree, cc, doWrap);
                    if (doWrap) {
                        sb.append(")");
                    }
                    break;
                case ObjcmLexer.SIMPLE_EXPR:
                    if (isIf3 && ororCounter == 0) {
                        sb.append("logic(");
                    }
                    CurrentContext cc2 = cc.gem();
                    cc2.skipObjField = doWrap;  // флаг того, что не нужно превращать модификаторы доступа в функцию objc_field
                    process_expr(sb, childTree, cc2, 0, isAssign, isIncompletePrefix);
                    if (isIf3 && ororCounter == 0) {
                        sb.append(")");
                    }
                    ororCounter++;
                    break;
                case ObjcmLexer.L_QUESTION:
                    sb.append("? ");
                    break;
                case ObjcmLexer.COLON:
                    sb.append(": ");
                    break;
                default:
                    // TODO:
                    // читаем скобки
                    readChildren(sb, childTree, cc);
                    break;
            }
        }
    }

    private static boolean recursiveSearchExists(CommonTree tree, int type) {
        if (tree.getChildCount() == 0) return false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == type) return true;
            if (childTree.getChildCount() > 0) {
                boolean result = recursiveSearchExists(childTree, type);
                if (result) return true;
            }
        }
        return false;
    }

    private static CommonTree recursiveSearchTree(CommonTree tree, int type) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == type) return childTree;
            if (childTree.getChildCount() > 0) {
                CommonTree result = recursiveSearchTree(childTree, type);
                if (result != null) return result;
            }
        }
        return null;
    }

    private static void process_expr(StringBuilder sb, CommonTree tree, CurrentContext cc, int deep, boolean leftAssign, boolean isIncompletePrefix) {
        List<Integer> operations = OPERATIONS_ORDER.get(deep);
        int exprType = EXPR_ORDER.get(deep);
        List<Integer> operationsOrder = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == ObjcmLexer.ASTERISK && leftAssign) {
                continue;
            }
            if (operations.contains(childTree.getType())) {
                operationsOrder.add(childTree.getType());
            }
        }
        int exprCounter = 0;
        int operationsCounter = 0;
        int operationsLength = operationsOrder.size();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == exprType) {
                if (operationsLength > 0 && exprCounter < operationsLength) {
                    sb.append("_").append(OPS_NUMBER.get(operationsOrder.get(exprCounter))).append("(");
                }

                if (deep == EXPR_ORDER.size() - 1) {
                    process_expr_type(sb, childTree, cc, isIncompletePrefix);
                } else {
                    process_expr(sb, childTree, cc, deep + 1, leftAssign, isIncompletePrefix);
                }

                if (operationsLength > 0) {
                    operationsCounter++;
                    sb.append(", ");
                }
                exprCounter++;
            } else if (childTree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                process_classical_expr(sb, childTree, cc, false, false);
                if (operationsLength > 0) {
                    operationsCounter = 0;
                    sb.append(")");
                }
            }
        }
    }

    private static void process_expr_type(StringBuilder sb, CommonTree tree, CurrentContext cc, boolean isIncompletePrefix) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.TYPE_CONVERTION:
                    sb.append("(");
                    readChildren(sb, childTree, cc);
                    sb.append(")");
                    if (isIncompletePrefix) return;
                    break;
                case ObjcmLexer.EXPR_NOT:
                    boolean isRealNot = childTree.getFirstChildWithType(ObjcmLexer.L_NOT) != null;
                    if (isRealNot) {
                        sb.append("_not(");
                    }
                    process_expr_not(sb, childTree, cc);
                    if (isRealNot) {
                        sb.append(")");
                    }
                    break;
                case ObjcmLexer.ASTERISK:
                case ObjcmLexer.L_AND:
                    // эту хрень пропускаем
                    break;
                default:
                    readChildren(sb, childTree, cc);
                    break;
            }
        }
    }

    private static void process_expr_not(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        // test for Field_access:
        int fieldAccessCounter = 0;
        if (tree.getFirstChildWithType(ObjcmLexer.FIELD_ACCESS) != null) {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if (childTree.getType() == ObjcmLexer.FIELD_ACCESS) {
                    fieldAccessCounter++;
                    if (!cc.skipObjField) {
                        sb.append("obcj_field(");
                    }
                }
            }
        }
        int fieldAccessCounter2 = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, cc, false, false);
                    break;
                case ObjcmLexer.L_NOT:
                    break;
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, cc);
                    break;
                case ObjcmLexer.SELECTOR:
                    m_process_selector(sb, childTree, cc);
                    break;
                case ObjcmLexer.FIELD_ACCESS:
                    fieldAccessCounter2++;
                    sb.append(", \"");
                    StringBuilder sbfa = new StringBuilder();
                    readChildren(sbfa, childTree, cc);
                    sb.append(sbfa.toString().trim());
                    sb.append("\"");
                    if (fieldAccessCounter2 > 0 && !cc.skipObjField) {
                        sb.append(")");
                    }
                    break;
                case ObjcmLexer.FUNCTION:
                    CurrentContext cc2 = cc.gem(cc.staticFlag);
                    cc2.transformClassNames = true;
                    process_classical_expr(sb, childTree, cc2, false, false);
                    //readChildren(sb, childTree, cc2);
                    break;
                default:
                    readChildren(sb, childTree, cc);
                    break;
            }
        }
    }

    private static void m_process_static_start(StringBuilder sb, CommonTree tree, CurrentContext cc) {
//        boolean wasInitialized = tree.getFirstChildWithType(ObjcmLexer.SET_INTERNAL) != null;
        boolean wasInitialized = true; // TODO:
        StringBuilder isb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            // пропускаем только слово "static"
            if (childTree.getType() == ObjcmLexer.STATIC_PREFIX) continue;

            StringBuilder lsb = new StringBuilder();
            readChildren(lsb, childTree, cc);
            isb.append(lsb);
        }
        String line = isb.toString();
        if (!wasInitialized) {
            // добавим null инициализацию
            line = line.substring(0, line.lastIndexOf(";")) + " = null;\n";
        }
        sb.append(line);
    }

    private static void m_process_while_stmt(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        CommonTree exprTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.WHILE_EXPR);
        StringBuilder exprsb = new StringBuilder();
        m_process_block(exprsb, exprTree, cc);

        CommonTree bodyTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.IF_BLOCK);
        StringBuilder bodysb = new StringBuilder();
        m_process_block(bodysb, bodyTree, cc);

        sb.append("while (logic(").append(exprsb).append("))\n");
        sb.append(bodysb);
    }

    private static void m_process_selector(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        CommonTree selectorValueTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SELECTOR_VALUE);
        StringBuilder selectorValueSb = new StringBuilder();
        m_process_block(selectorValueSb, selectorValueTree, cc);

        sb.append("_selector_(\"").append(selectorValueSb).append("\")");
    }

    private static void m_process_if_stmt(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        CommonTree exprTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.IF_EXPR);
        StringBuilder exprsb = new StringBuilder();
        m_process_block(exprsb, exprTree, cc);

        CommonTree blockTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.IF_BLOCK);
        StringBuilder blocksb = new StringBuilder();
        m_process_block(blocksb, blockTree, cc);

        // logic - такой метод, который всегда возращает булевский тип
        sb.append("if (logic(").append(exprsb).append(")) ");
        sb.append(blocksb);
    }

    private static void m_process_switch(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        // 1. сначала проанализируем: какого типа объект используется для ветвления
        // если это обычный enum, то конструируем обычный switch
        // если это объект иного типа, то делаем обертку "getEnum(...)"

        CommonTree switchExprTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SWITCH_EXPRESSION);
        StringBuilder esb = new StringBuilder();
        m_process_block(esb, switchExprTree, cc);
        boolean useGetEnum = !esb.toString().trim().startsWith("this.");

        CommonTree switchBodyTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SWITCH_BODY);

        // начинаем конструировать switch
//        sb.append("switch (");
        sb.append("{\n");
        String switchUuid = UUID.randomUUID().toString().replace("-", "_");
        sb.append("\tEnum i_").append(switchUuid).append(" = ");
        if (useGetEnum) sb.append("getEnum(");
        sb.append(esb);
        if (useGetEnum) sb.append(")");
        sb.append(";\n");

        StringBuilder bodySB;
        StringBuilder defaultBody = new StringBuilder();

        // здесь LinkedHashMap, потому что нам важно сохранить порядок
        // в котором шли case-ы и default внутри оригинального switch
        Map<String, StringBuilder> switchMap = new LinkedHashMap<>();
        Map<String, Boolean> switchMapBreak = new LinkedHashMap<>();

        for (Object child : switchBodyTree.getChildren()) {
            CommonTree childTree = (CommonTree) child;

            switch (childTree.getType()) {
                case ObjcmLexer.CASE_STMT:
                    CommonTree caseExprTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.CASE_EXPR);
                    StringBuilder cesb = new StringBuilder();
                    readChildren(cesb, caseExprTree, cc);
                    bodySB = new StringBuilder();
                    CommonTree caseBodyTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.CASE_BODY);
                    CurrentContext bcc = cc.gem(cc.staticFlag);
                    bcc.skipBreak = true;
                    if (caseBodyTree != null) {
                        m_process_block(bodySB, caseBodyTree, bcc);
                    }
                    switchMap.put(cesb.toString(), bodySB);
                    switchMapBreak.put(cesb.toString(), bcc.isBreak);
                    break;
                case ObjcmLexer.DEFAULT_STMT:
                    CommonTree blockTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.DEFAULT_BODY);
                    if (blockTree != null) {
                        CurrentContext bcc2 = cc.gem(cc.staticFlag);
                        bcc2.skipBreak = true;
                        m_process_block(defaultBody, blockTree, bcc2);
                        switchMap.put(null, defaultBody);
                        switchMapBreak.put(null, bcc2.isBreak);
                    }
                    break;
                default:
                    // все, что не CASE и не DEFAULT нужно перенести наверх перед switch-ом
                    readChildren(sb, childTree, cc);
                    break;
            }
        }

        List<String> keysArray = new ArrayList<>(switchMap.keySet());
        int caseNum = 0;
        for (String caseStmt : switchMap.keySet()) {
            if (caseNum > 0) sb.append("else ");
            if (caseStmt != null) {
                sb.append("if (i_").append(switchUuid).append(".equals(").append(caseStmt).append("))");
            }
            sb.append(" {\n");
            StringBuilder currentBlock = switchMap.get(caseStmt);
            if (!currentBlock.toString().trim().isEmpty()) {
                sb.append(currentBlock);
            }
            if (!switchMapBreak.get(caseStmt)) {
                for (int i = keysArray.indexOf(caseStmt) + 1; i < keysArray.size(); i++) {
                    StringBuilder caseCode = switchMap.get(keysArray.get(i));
                    if (!caseCode.toString().trim().isEmpty()) {
                        sb.append("\n\n");
                        sb.append(caseCode);
                    }
                    if (switchMapBreak.containsKey(keysArray.get(i))) break;
                }
            }
            sb.append("}\n");
            caseNum++;
        }
        sb.append("}\n");
    }

    private static boolean testBrackets(List children, int i, int childrenSize, Object child) {
        if (child.toString().equals("[")) {
            if (i < childrenSize - 1) {
                if (((CommonTree) children.get(i + 1)).getToken().getType() == ObjcmLexer.METHOD_CALL) {
                    return true;
                }
            }
        }
        if (child.toString().equals("]")) {
            if (i > 0) {
                if (((CommonTree) children.get(i - 1)).getToken().getType() == ObjcmLexer.METHOD_CALL) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean m_process_object(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        boolean typeConv = false;
        boolean wasMethodCall = false;
        List children = tree.getChildren();
        String typeConvertionNext = "";
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.METHOD_CALL:
                    wasMethodCall = m_process_method_call(sb, childTree, cc);
                    break;
                case ObjcmLexer.BR_STMT:
                    m_process_br_stmt(sb, childTree, cc);
                    break;
                case ObjcmLexer.TYPE_CONVERTION_MAY_BE:
                    typeConvertionNext = "((" + Utils.transformType(childTree.getChild(0).toString(), cc) + ")";
                    break;
                case ObjcmLexer.TYPE_CONVERTION_TRUE:
                    sb.append(typeConvertionNext);
                    typeConv = true;
                    typeConvertionNext = "";
                    break;
                default:
                    if (testBrackets(children, i, childrenSize, child)) break;
                    sb.append(transformObject(child.toString(), cc));
                    break;
            }
        }
        if (typeConv) sb.append(")");
        return wasMethodCall;
    }

    private static void m_process_br_stmt(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, cc);
                    break;
                case ObjcmLexer.BR_STMT:
                    m_process_br_stmt(sb, childTree, cc);
                    break;
                default:
                    sb.append(transformObject(child.toString(), cc));
                    break;
            }
        }
    }

    private static void m_process_message(StringBuilder sb, CommonTree tree, CurrentContext cc, boolean isIncompletePrefix) {
        List children = tree.getChildren();
        boolean prevId = false;
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, cc, false, isIncompletePrefix);
                    break;
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, cc);
                    break;
                case ObjcmLexer.BR_STMT:
                    m_process_br_stmt(sb, childTree, cc);
                    break;
                case ObjcmLexer.PREFIX:
                    break;
                case ObjcmLexer.SELECTOR:
                    m_process_selector(sb, childTree, cc);
                    break;
                default:
                    if (i == 0 && child.toString().equals("[")) continue;
                    if (i == childrenSize - 1 && child.toString().equals("]")) continue;
                    // ситуация типа blabla... prefix
                    if (!children.get(childrenSize - 1).toString().equals(")") && i > 0 && i == childrenSize - 2 && prevId && child.toString().matches("\\s+")) {
                        return;
                    }
                    String obj = transformObject(child.toString(), cc);
                    // заменяем имя класса на "имя_класса.class"
                    if (cc.ctx.imports.keySet().contains(obj)) {
                        obj += ".class";
                    }
                    sb.append(obj);
                    prevId = child.toString().matches("[a-zA-Z_\\d\\.]*");
                    break;
            }
        }
    }

    private static boolean m_process_method_call(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        boolean wasMethodCall = false;
        boolean instanceCreation = false;
        String object = "";
        String message = "";
        String methodName = "";
        loop:
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.OBJECT:
                    StringBuilder lsb2 = new StringBuilder();
                    wasMethodCall = m_process_object(lsb2, childTree, cc);
                    //lsb.append(lsb2.toString().trim());
                    object = lsb2.toString().trim();
                    //if (object.equals("this")) object += ".";
                    break;
                case ObjcmLexer.METHOD_NAME:
                    String name = childTree.getChild(0).toString();
                    if (RESTRICTED_METHODS.contains(name)) {
                        break loop;
                    }
                    if (name.equals("alloc")) {
                        instanceCreation = true;
                    } else {
                        methodName = Utils.transformMethodName(name);
                        wasMethodCall = true;
                    }
                    break;
                case ObjcmLexer.MSG_LIST:
                    StringBuilder lsb = new StringBuilder();
                    m_process_msg_list(lsb, childTree, cc);
                    message = lsb.toString();
                    break;
            }
        }

        if (wasMethodCall) {
            if (object.isEmpty()) {
                throw new RuntimeException("empty object for method call");
            }
            if (methodName.isEmpty()) {
                sb.append(object);
            } else {
                if (methodName.equals("isKindOfClass") || methodName.equals("isSubclassOfClass")) {
                    sb.append(object).append(" instanceof ").append(message.replace(".class", ""));
                } else if (object.startsWith("NS")/* || object.equals("this")*/ || cc.ctx.imports.containsKey(object) /*|| methodName.equals("respondsToSelector")*/) {
                    sb.append(object).append(".").append(methodName).append("(").append(message).append(")");
                } else {
                    sb.append("objc_msgSend(");
                    sb.append(fixObject(object, cc.ctx)).append(",").append("\"").append(methodName).append("\"");
                    sb.append(", ");

                    // список категорий
                    sb.append(cc.ctx.categoryList);

                    if (!message.isEmpty()) sb.append(", ").append(message);
                    sb.append(")");
                }
            }
        } else if (instanceCreation) {
            sb.append("new ").append(object).append("()");
        }

        return wasMethodCall || instanceCreation;
    }

    private static String fixObject(String object, Context ctx) {
        switch (object) {
            case "super":
                return "this";
            case "String":
                return "String.class";
        }
        if (ctx.imports.keySet().contains(object)) {
            return object + ".class";
        }
        return object;
    }

    private static void m_process_msg_list(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        int msgCount = 0;
        List children = tree.getChildren();
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.METHOD_MSG:
                    boolean isIncompletePrefix = i < childrenSize - 1 && ((CommonTree) children.get(i + 1)).getFirstChildWithType(ObjcmLexer.INCOMPLETE_PREFIX) != null;
                    CommonTree messageTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.MESSAGE);
                    if (messageTree != null) {
                        if (msgCount > 0) sb.append(", ");
                        CurrentContext cc2 = cc.gem(cc.staticFlag);
                        cc2.transformClassNames = true;
                        m_process_message(sb, messageTree, cc2, isIncompletePrefix);
                        msgCount++;
                    }
                    break;
            }
        }
    }


    private static void m_process_param(Map<String, String> params, CommonTree tree, CurrentContext cc) {
        String type = "";
        String name = "";
        String generic = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE:
                    type = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString();
                    break;
            }
        }

        params.put(name, transformType(type, cc));
    }

    private static void m_process_field2(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        String modifier = "";
        String type = "";
        String name = "";
        String value = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.MODIFIER:
                    modifier = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.TYPE:
                    type = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.VALUE:
                    value = m_process_field_value(childTree, cc);
                    break;
            }
        }

        sb.append("public ").append((modifier.length() > 0 ? modifier + " " : "")).append(transformType(type, cc)).append(" ").append(name);
        if (value.length() > 0) {
            sb.append(" = ").append(value);
        }
        sb.append(";\n");
    }

    private static void m_process_field(StringBuilder sb, CommonTree tree, CurrentContext cc) {
        String type = "";
        String name = "";
        String value = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE:
                    type = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.VALUE:
                    value = m_process_field_value(childTree, cc);
                    break;
            }
        }

        sb.append("public static ").append(transformType(type, cc)).append(" ").append(name);
        if (value.length() > 0) {
            sb.append(" = ").append(value);
        }
        sb.append(";\n");
    }

    private static String m_process_field_value(CommonTree tree, CurrentContext cc) {
        StringBuilder sb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            sb.append(transformObject(childTree.toString(), cc.gem(false)));
        }
        return sb.toString();
    }

}
