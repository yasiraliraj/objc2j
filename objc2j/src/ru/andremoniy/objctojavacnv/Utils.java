package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import ru.andremoniy.objctojavacnv.antlr.Preprocessor;
import ru.andremoniy.objctojavacnv.antlr.output.PreprocessorParser;

import java.util.*;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 9:33
 */
public class Utils {

    private static final List<String> implementedCocoa = Arrays.asList("NSEvent");

    static String transformObject(String obj, CurrentContext cc) {
        switch (obj) {
            case "nil":
            case "Nil":
                return "null";
            case "self":
                if (cc.staticFlag) {
                    return cc.className + (cc.transformClassNames ? ".class" : "");
                } else {
                    return "this";
                }
            case "YES":
                return "true";
            case "NO":
                return "false";
            case "static":
                return "";
//            case "NSAssert":
//                return "assert";
            case "MAX":
                return "Math.max";
            case "_CGFloatFloor":
                return "(int)Math.floor";
            case "fmodf":
                return "MathEx.fmodf";
            case ";":
                return ";\n";
        }
        if (obj.startsWith("@\"")) obj = obj.substring(1);
        obj = transformType(obj, cc);
        if (cc.transformClassNames && cc.ctx.imports.containsKey(obj.trim())) {
            obj = obj + ".class";
        }
        return obj;
    }

    static String transformMethodName(String name) {
        switch (name) {
/*
            case "addObject":
                return "add";
            case "removeObjectAtIndex":
                return "remove";
            case "count":
                return "size";
*/
            case "isEqualToString":
                return "equals";
            case "class":
                return "";
        }
        return name;
    }

    static String transformType(String type, CurrentContext cc) {
        if (type.matches("void\\s*\\*")) return "Object";
        // отрезаем *
        if (type.endsWith("*")) type = type.substring(0, type.length() - 1);

        switch (type) {
//            case "SEL":
//                return "java.lang.reflect.Method";
            case "signed":
            case "unsigned":
                return "Integer";
            case "id":
                return "NSObject";
            case "NSString":
                return "String";
            case "BOOL":
                return "Boolean";
            case "NSUInteger":
            case "NSInteger":
                return "Integer";
            case "IBAction":
                return "void";
            case "CGFloat":
                return "Double";
            case "float":
                return "double";
/*            case "NSArray":
                return "List";
            case "NSMutableArray":
                return "ArrayList";*/
        }

//        if (type.equals(className)) return className + "_m";

        if (cc.ctx != null) {
            if (!cc.ctx.localProcessedImports.contains(type) && !cc.ctx.addImports.contains(type)) {
                cc.ctx.addImports.add(type);
            } else if (type.startsWith("NS")) {
                cc.ctx.addImports.add(type);
            }

        }

        return type;
    }

    public static void addAdditionalImports(StringBuilder sb, Context ctx) {
        Set<String> nsImports = new HashSet<>();
        for (String addImport : ctx.addImports) {
            String classPath = ctx.imports.get(addImport);
            if (classPath != null) {
                if (!classPath.contains("+")) {
                    sb.append("import ").append(classPath).append(";\n");
                    sb.append("import static ").append(classPath).append(".*;\n");
                    addNSHeaderImport(sb, classPath);
                }
                addStaticFromHeaderImports(ctx, sb, classPath.substring(classPath.lastIndexOf(".") + 1));
            } else if (addImport.startsWith("NS")) {
                if (!nsImports.contains(addImport) && implementedCocoa.contains(addImport)) {
                    sb.append("import static ru.andremoniy.jcocoa.I").append(addImport).append(".*;\n");
//                    sb.append("import ru.andremoniy.jcocoa.I").append(addImport).append(".*;\n");
                    nsImports.add(addImport);
                }
            }
        }
        sb.append("\n");
    }

    private static void addNSHeaderImport(StringBuilder sb, String classPath) {
        String importClassName = classPath.substring(classPath.lastIndexOf(".") + 1);
        if (importClassName.startsWith("NS")) {
            String interfaceName = classPath.substring(0, classPath.lastIndexOf(".")) + ".I" + importClassName;
            sb.append("import ").append(interfaceName).append(";\n");
            sb.append("import static ").append(interfaceName).append(".*;\n");
        }
    }

    public static void addStaticFromHeaderImports(Context ctx, StringBuilder sb, String className) {
        List<String> enums = ctx.headerEnums.get("I" + className);
        if (enums != null) {
            String headerPath = ctx.imports.get(className);
            headerPath = headerPath.substring(0, headerPath.length() - className.length()) + "I" + className;
            if (headerPath.contains("+")) {
                headerPath = headerPath.substring(0, headerPath.indexOf("+"));
            }
            for (String _enum : enums) {
                sb.append("import static ").append(headerPath).append(".").append(_enum).append(".*;\n");
            }
        }
    }

    public static String getText(CommonTree tree) {
        if (tree == null) return "";
        if (tree.getChildCount() == 0) return tree.getText();
        StringBuilder sb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            sb.append(getText(childTree));
        }
        return sb.toString();
    }

    /**
     * add original imports from file
     *
     * @param input file code source
     * @param sb    java code string builder
     */
    public static void addOriginalImports(String input, Context ctx, StringBuilder sb) throws RecognitionException {
        Map<String, String> imports = ctx.imports;
        PreprocessorParser.code_return result = Preprocessor.getResult(input);
        for (Object child : ((CommonTree) result.getTree()).getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_INCLUDE:
                    String path = getText(childTree);
                    String className = path.substring(1, path.length() - 3);
                    String classPath = imports.get(className);
                    if (classPath != null) {
                        if (className.contains("+")) {
                            // сохраняем инфу о добавленных категориях, но в import не добавляем
                            ctx.localCategories.add(className);
                        } else {
                            sb.append("import ").append(classPath).append(";\n");
                            sb.append("import static ").append(classPath).append(".*;\n");
                            addNSHeaderImport(sb, classPath);
                        }
                        addStaticFromHeaderImports(ctx, sb, className);
                        ctx.localProcessedImports.add(className);
                    }
                    break;
            }
        }

    }
}
