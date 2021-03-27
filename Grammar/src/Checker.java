import org.antlr.v4.runtime.tree.*;

import java.util.concurrent.CompletionException;

/**
 * Visitor that determines the data types of expressions and selectively associates
 * the datatype with the parse tree node in the ParseTreeProperty.
 */
public class Checker extends MaximusBaseVisitor<DataType> {
	private ParseTreeProperty<DataType> types;
	private ParseTreeProperty<Symbol> symbols;
	private Scope currentScope = new Scope();
	private int localnums = 0;

	public Checker(ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols ) {
		this.types = types;
		this.symbols = symbols;
	}

	public ParseTreeProperty<DataType> getTypes() {
		return this.types;
	}


	@Override
	public DataType visitScope(MaximusParser.ScopeContext ctx) {
		currentScope = currentScope.openScope();
		visitChildren(ctx);
		currentScope = currentScope.closeScope();
		return null;
	}

	@Override
	public DataType visitExAssigner(MaximusParser.ExAssignerContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		if(currentScope.CheckIfInScope(name) == null && ctx.DECLARATION() == null){
			throw new CompilerException("Variable is not declared!");
		}else if(currentScope.CheckIfInScope(name) != null && ctx.DECLARATION() != null){
			throw new CompilerException("Variable already declared!");
		}else if(currentScope.CheckIfInScope(name) == null){
			DataType type;
			switch (ctx.DECLARATION()){
			}

		}

	}

	@Override
	public DataType visitExCompareId(MaximusParser.ExCompareIdContext ctx) {
		return super.visitExCompareId(ctx);
	}

	@Override
	public DataType visitExBool(MaximusParser.ExBoolContext ctx) {
		return super.visitExBool(ctx);
	}

	@Override
	public DataType visitExPrint(MaximusParser.ExPrintContext ctx) {
		return super.visitExPrint(ctx);
	}

	@Override
	public DataType visitExCompareEx(MaximusParser.ExCompareExContext ctx) {
		return super.visitExCompareEx(ctx);
	}

	@Override
	public DataType visitExAdd(MaximusParser.ExAddContext ctx) {
		return super.visitExAdd(ctx);
	}

	@Override
	public DataType visitExId(MaximusParser.ExIdContext ctx) {
		return super.visitExId(ctx);
	}

	@Override
	public DataType visitExInc(MaximusParser.ExIncContext ctx) {
		return super.visitExInc(ctx);
	}

	@Override
	public DataType visitExScan(MaximusParser.ExScanContext ctx) {
		return super.visitExScan(ctx);
	}

	@Override
	public DataType visitExString(MaximusParser.ExStringContext ctx) {
		return super.visitExString(ctx);
	}

	@Override
	public DataType visitExMul(MaximusParser.ExMulContext ctx) {
		return super.visitExMul(ctx);
	}

	@Override
	public DataType visitExInt(MaximusParser.ExIntContext ctx) {
		return super.visitExInt(ctx);
	}

	@Override
	public DataType visitExArray(MaximusParser.ExArrayContext ctx) {
		return super.visitExArray(ctx);
	}

	@Override
	public DataType visitExParentheses(MaximusParser.ExParenthesesContext ctx) {
		return super.visitExParentheses(ctx);
	}

	@Override
	public DataType visitExDouble(MaximusParser.ExDoubleContext ctx) {
		return super.visitExDouble(ctx);
	}

	@Override
	public DataType visitScan(MaximusParser.ScanContext ctx) {
		return super.visitScan(ctx);
	}

	@Override
	public DataType visitConditional(MaximusParser.ConditionalContext ctx) {
		return super.visitConditional(ctx);
	}

	@Override
	public DataType visitFunction(MaximusParser.FunctionContext ctx) {
		return super.visitFunction(ctx);
	}

	@Override
	public DataType visitDeclaredFunction(MaximusParser.DeclaredFunctionContext ctx) {
		return super.visitDeclaredFunction(ctx);
	}

	@Override
	public DataType visitPrint(MaximusParser.PrintContext ctx) {
		return super.visitPrint(ctx);
	}
}
