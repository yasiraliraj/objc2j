package ru.andremoniy.objctojavacnv.context;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: Andremoniy
 * Date: 05.10.12
 * Time: 9:04
 */
public class ClassContext extends AbstractContext {

    public MethodContext methodCtx;
    public ProjectContext projectCtx;

    public boolean containsInit;
    public boolean containsAutoRelease;

    // current class name
    public String className;

    // current class category name
    public String categoryName;

    // локально добавленные категории
    public Set<String> localCategories = new HashSet<>();
    public String categoryList;

    public List<String> localProcessedImports = new ArrayList<>();
    public List<String> addImports = new ArrayList<>();

    public ClassContext(String className, String categoryName, ProjectContext projectCtx) {
        this.className = className;
        this.projectCtx = projectCtx;
        this.categoryName = categoryName;
    }

    public MethodContext newMethod(String methodName, boolean staticFlag) {
        methodCtx = new MethodContext(methodName, staticFlag, this);
        methodCtx.variables.putAll(variables);
        return methodCtx;
    }

    public ExpressionContext newExpr() {
        return methodCtx.blockCtx.newExpr();
    }

    public ClassContext copyNoStatic() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
