import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class CodeGenerator extends MaximusBaseVisitor<Void>{
    private ParseTreeProperty<DataType> types;
    private ByteCode byteCode;

    public CodeGenerator(ParseTreeProperty<DataType> types, ByteCode byteCode) {
        this.types = types;
        this.byteCode = byteCode;
    }

    //:TODO Write ByteCode For all these
    @Override
    public Void visitProgram(MaximusParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitStatement(MaximusParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitExAssigner(MaximusParser.ExAssignerContext ctx) {
        return super.visitExAssigner(ctx);
    }

    @Override
    public Void visitExCompareId(MaximusParser.ExCompareIdContext ctx) {
        return super.visitExCompareId(ctx);
    }

    @Override
    public Void visitExBool(MaximusParser.ExBoolContext ctx) {
        if("valid".equals(ctx.getText())){
            byteCode.add("ldc 1");
        } else {
            byteCode.add("ldc 0");
        }
        return super.visitExBool(ctx);
    }

    @Override
    public Void visitExCompareEx(MaximusParser.ExCompareExContext ctx) {
        return super.visitExCompareEx(ctx);
    }

    @Override
    public Void visitExAdd(MaximusParser.ExAddContext ctx) {
        visit(ctx.)
        if("add".equals(ctx.getText())){

            iadd
        }
        return super.visitExAdd(ctx);
    }

    @Override
    public Void visitExId(MaximusParser.ExIdContext ctx) {
        return super.visitExId(ctx);
    }

    @Override
    public Void visitExInc(MaximusParser.ExIncContext ctx) {
        return super.visitExInc(ctx);
    }

    @Override
    public Void visitExString(MaximusParser.ExStringContext ctx) {
        byteCode.add("ldc " + ctx.getText());
        return super.visitExString(ctx);
    }

    @Override
    public Void visitExMul(MaximusParser.ExMulContext ctx) {
        return super.visitExMul(ctx);
    }

    @Override
    public Void visitExInt(MaximusParser.ExIntContext ctx) {
        byteCode.add("ldc " + ctx.getText());
        return super.visitExInt(ctx);
    }

    @Override
    public Void visitExArray(MaximusParser.ExArrayContext ctx) {
        return super.visitExArray(ctx);
    }

    @Override
    public Void visitExParentheses(MaximusParser.ExParenthesesContext ctx) {
        return super.visitExParentheses(ctx);
    }

    @Override
    public Void visitExDouble(MaximusParser.ExDoubleContext ctx) {
        byteCode.add("ldc2_w " + ctx.getText());
        return super.visitExDouble(ctx);
    }

    @Override
    public Void visitConditional(MaximusParser.ConditionalContext ctx) {
        return super.visitConditional(ctx);
    }

    @Override
    public Void visitFunction(MaximusParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }


}
