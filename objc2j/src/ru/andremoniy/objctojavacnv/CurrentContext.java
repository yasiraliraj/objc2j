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
    public MethodContext mc;
    public boolean isBreak;
    public boolean skipBreak;
    public boolean transformClassNames;
    public boolean skipObjField;
    public boolean addReturnNull;
    public boolean isVariableDeclaration;
    public String variableDeclarationType;
    public boolean needSaveVariable;

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
        this.mc = current.mc;
        this.isBreak = current.isBreak;
        this.skipBreak = current.skipBreak;
        this.addReturnNull = current.addReturnNull;
        this.isVariableDeclaration = current.isVariableDeclaration;
        this.variableDeclarationType = current.variableDeclarationType;
        this.needSaveVariable = current.needSaveVariable;
    }

    public CurrentContext gem() {
        return this.gem(staticFlag);
    }

    public CurrentContext gem(boolean staticFlag) {
        return new CurrentContext(this, staticFlag);
    }

}
