package ru.andremoniy.objctojavacnv.context;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Andremoniy
 * Date: 05.10.12
 * Time: 9:04
 */
public class ExpressionContext {

    public boolean needSaveVariable;
    public boolean isVariableDeclaration;

    public ExpressionContext parentCtx;
    public String variableDeclarationType;
    public BlockContext blockCtx;
    public boolean skipObjField;
    public boolean transformClassNames;
    public boolean isArrayDeclaration;
    public List<String> arraySizes = new ArrayList<>();

    public ExpressionContext setNeedSaveVariable() {
        needSaveVariable = true;
        return this;
    }

    public ExpressionContext(BlockContext blockCtx) {
        this.blockCtx = blockCtx;
    }

    public ExpressionContext newExpr() {
        ExpressionContext newExpr = new ExpressionContext(blockCtx);
        newExpr.parentCtx = this;
        newExpr.transformClassNames = this.transformClassNames;
        newExpr.skipObjField = this.skipObjField;
        newExpr.needSaveVariable = this.needSaveVariable;
        newExpr.isArrayDeclaration = this.isArrayDeclaration;
        newExpr.isVariableDeclaration = this.isVariableDeclaration;
        return newExpr;
    }

    public ExpressionContext setTransformClassNames() {
        this.transformClassNames = true;
        return this;
    }

    public ExpressionContext setNoTransformClassNames() {
        this.transformClassNames = false;
        return this;
    }

    public ExpressionContext setNoArrayDeclaration() {
        this.isArrayDeclaration = false;
        return this;
    }
}
