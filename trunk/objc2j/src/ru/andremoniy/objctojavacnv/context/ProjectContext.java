package ru.andremoniy.objctojavacnv.context;

import ru.andremoniy.objctojavacnv.antlr.Macros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Andremoniy
 * Date: 05.10.12
 * Time: 9:03
 */
public class ProjectContext extends AbstractContext {

    public ClassContext classCtx;

    // #define ...
    public Map<String, List<Macros>> macrosMap = new HashMap<String, List<Macros>>();

    // classname on its package
    public Map<String, Set<String>> imports = new HashMap<>();

    // header-class-name on list of its enums
    public Map<String, List<String>> headerEnums = new HashMap<>();

    // хранит карту категорий для каждого класса
    public Map<String, Set<String>> categories = new HashMap<>();

    public Map<String, Map<String, MethodInterface>> methodsInterfaces = new HashMap<>();

    // static field name on its classname
    public Map<String, String> staticFields = new HashMap<>();

    public int m_counter;
    public int h_counter;
    public boolean skipSDK;

    public ClassContext newClass(String className, String categoryName) {
        Map<String, MethodInterface> classMethodsInterfaces = new HashMap<>();
        methodsInterfaces.put(className, classMethodsInterfaces);
        classCtx = new ClassContext(className, categoryName, this, classMethodsInterfaces);
        classCtx.variables.putAll(variables);
        return classCtx;
    }

    public ExpressionContext newExpr() {
        return classCtx.methodCtx.blockCtx.newExpr();
    }

    public void dump() throws IOException {
        try (FileWriter fw = new FileWriter("enums.csv")) {
            for (String _enum : headerEnums.keySet()) {
                fw.write(_enum + ";" + headerEnums.get(_enum) + "\n");
            }
        }
        try (FileWriter fw = new FileWriter("staticFields.csv")) {
            for (String staticField : staticFields.keySet()) {
                fw.write(staticField + ";" + staticFields.get(staticField) + "\n");
            }
        }
        try (FileWriter fw = new FileWriter("imports.csv")) {
            for (String className : imports.keySet()) {
                fw.write(className + ";" + imports.get(className) + "\n");
            }
        }
    }

    public void load() throws IOException {
        if (skipSDK) return;

        try {
            try (FileReader fr = new FileReader("enums.csv");
                 BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String parts[] = line.split(";");
                    String _enum = parts[0].trim();
                    String enumFields[] = parts[1].substring(parts[1].indexOf("[") + 1, parts[1].lastIndexOf("]")).split(",");
                    List<String> enumFieldsList = new ArrayList<>();
                    for (String enumField : enumFields) {
                        enumFieldsList.add(enumField.trim());
                    }

                    headerEnums.put(_enum, enumFieldsList);
                }
            }
            try (FileReader fr = new FileReader("staticFields.csv");
                 BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String parts[] = line.split(";");
                    staticFields.put(parts[0], parts[1]);
                }
            }
            try (FileReader fr = new FileReader("imports.csv");
                 BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String parts[] = line.split(";");
                    Set<String> list = imports.get(parts[0]);
                    if (list == null) {
                        list = new HashSet<>();
                        imports.put(parts[0], list);
                    }
                    String classPathes[] = parts[1].substring(parts[1].indexOf("[") + 1, parts[1].lastIndexOf("]")).split(",");
                    for (String classPath : classPathes) {
                        list.add(classPath.trim());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addImports(String className, String path) {
        Set<String> classPathes = imports.get(className);
        if (classPathes == null) {
            classPathes = new HashSet<>();
            imports.put(className, classPathes);
        }
        classPathes.add(path);
    }
}
