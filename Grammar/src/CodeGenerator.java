import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class CodeGenerator extends MaximusBaseVisitor<Void>{
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private ByteCode byteCode;
    private int storeCount = 0;

    public CodeGenerator(ParseTreeProperty<Symbol>symbols,ParseTreeProperty<DataType> types, ByteCode byteCode) {
        this.types = types;
        this.byteCode = byteCode;
        this.symbols = symbols;
    }

    //:TODO Write ByteCode For all these
    @Override
    public Void visitProgram(MaximusParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitScope(MaximusParser.ScopeContext ctx) {
        return super.visitScope(ctx);
    }

    @Override
    public Void visitScan(MaximusParser.ScanContext ctx) {
        return super.visitScan(ctx);
    }

    @Override
    public Void visitDeclaredFunction(MaximusParser.DeclaredFunctionContext ctx) {
        return super.visitDeclaredFunction(ctx);
    }

    @Override
    public Void visitPrint(MaximusParser.PrintContext ctx) {
        return super.visitPrint(ctx);
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
        visit(ctx.left);
        visit(ctx.right);
        if("add".equals(ctx.OPERATORS().getText())){
            byteCode.add("iadd");
        } else {
            byteCode.add("isub");
        }
        return null;
    }


    @Override
    public Void visitExId(MaximusParser.ExIdContext ctx) {
        return super.visitExId(ctx);
    }

    @Override
    public Void visitExInc(MaximusParser.ExIncContext ctx) {
        visit(ctx.expression());
        byteCode.add("istore " + storeCount);
        if("increm".equals(ctx.INC_OP().getText())){
            byteCode.add("iinc " + storeCount + " 1");
        } else {
            byteCode.add("iinc " + storeCount + " -1");
        }
        storeCount++;
        return null;
    }

    @Override
    public Void visitExString(MaximusParser.ExStringContext ctx) {
        byteCode.add("ldc " + ctx.getText());
        return super.visitExString(ctx);
    }

    @Override
    public Void visitExMul(MaximusParser.ExMulContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if("times".equals(ctx.MUL_OPS().getText())){
            byteCode.add("imul");
        } else{
            byteCode.add("idiv");
        }
        return null;
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
