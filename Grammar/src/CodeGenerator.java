import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class CodeGenerator extends MaximusBaseVisitor<Void>{
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<SymbolTable> symbols;
    private ByteCode byteCode;
    private int storeCount = 0;

    public CodeGenerator(ParseTreeProperty<SymbolTable>symbols,ParseTreeProperty<DataType> types, ByteCode byteCode) {
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
    public Void visitAssignment(MaximusParser.AssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol s = symbols.get(ctx).lookUp(name);
        visit(ctx.value());

        switch (types.get(ctx)){
            case DOUBLE:
                byteCode.add("dstore " + s.getStoreNr());
                break;
            case INT:
            case BOOLEAN:
                byteCode.add("istore " + s.getStoreNr());
                break;
            case STRING:
                byteCode.add("astore " + s.getStoreNr());
                break;
            case OTHER:
                throw new CompilerException("encountered unknown datatype for " + s.getName());
        }
        return null;
    }

    @Override
    public Void visitDeclaration(MaximusParser.DeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol s = symbols.get(ctx).lookUp(name);
        if(ctx.value() != null){
            visit(ctx.value());
        }
        switch (types.get(ctx)){
            case DOUBLE:
                byteCode.add("dstore " + s.getStoreNr());
                break;
            case INT:
            case BOOLEAN:
                byteCode.add("istore " + s.getStoreNr());
                break;
            case STRING:
                byteCode.add("astore " + s.getStoreNr());
                break;
            case OTHER:
                throw new CompilerException("encountered unknown datatype for " + s.getName());
        }
        return null;
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
        return null;
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
    public Void visitExVariable(MaximusParser.ExVariableContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol s = symbols.get(ctx).lookUp(name);
        if( s.getType() == DataType.INT || s.getType() == DataType.BOOLEAN){
            byteCode.add("iload " + s.getStoreNr());
        }else if (s.getType() == DataType.DOUBLE){
            byteCode.add("dload " + s.getStoreNr());
        }else if (s.getType() == DataType.STRING){

        }
        return null;
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
        return null;
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
        return null;
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
        return null;
    }

    @Override
    public Void visitConditional(MaximusParser.ConditionalContext ctx) {
        return super.visitConditional(ctx);
    }

    @Override
    public Void visitCondition(MaximusParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }

    @Override
    public Void visitFunction(MaximusParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

}
