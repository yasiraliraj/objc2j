package ru.andremoniy.objctojavacnv;

/**
 * User: Andremoniy
 * Date: 26.08.12
 * Time: 20:28
 */

/**
 * Оболочка, которая содержит все нужные параметры для текущего разбора
 */
public class CurrentContext {

    Context ctx;
    String className;
    boolean staticFlag;
    String methodName;
    public boolean isBreak;
    public boolean skipBreak;
    public boolean transformClassNames;
    public boolean skipObjField;
    public boolean addReturnNull;
    public boolean isVariableDeclaration;
    public String variableDeclarationType;

    public CurrentContext(CurrentContext current, boolean staticFlag, String methodName) {
        this(current, staticFlag);
        this.methodName = methodName;
    }

    public CurrentContext(Context ctx, String className, boolean staticFlag) {
        this.ctx = ctx;
        this.className = className;
        this.staticFlag = staticFlag;
    }

    public CurrentContext(CurrentContext current, boolean staticFlag) {
        this.ctx = current.ctx;
        this.className = current.className;
        this.staticFlag = staticFlag;
        this.skipObjField = current.skipObjField;
        this.transformClassNames = current.transformClassNames;
        this.methodName = current.methodName;
        this.isBreak = current.isBreak;
        this.skipBreak = current.skipBreak;
        this.addReturnNull = current.addReturnNull;
        this.isVariableDeclaration = current.isVariableDeclaration;
        this.variableDeclarationType = current.variableDeclarationType;
    }

    public CurrentContext gem() {
        return this.gem(staticFlag);
    }

    public CurrentContext gem(boolean staticFlag) {
        return new CurrentContext(this, staticFlag);
    }

    public CurrentContext gem(boolean static_flag, String methodName) {
        return new CurrentContext(this, static_flag, methodName);
    }
}
