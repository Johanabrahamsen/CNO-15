import org.antlr.v4.runtime.tree.*;

import java.util.concurrent.CompletionException;

public class Checker extends MaximusBaseVisitor<DataType> {
	private ParseTreeProperty<DataType> types;
	private ParseTreeProperty<Symbol> symbols;
	private Scope currentScope = new Scope();
	private int localnums = 0;

	public Checker(ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols ) {
		this.types = types;
		this.symbols = symbols;
	}

	@Override
	public DataType visitScope(MaximusParser.ScopeContext ctx) {
		currentScope = currentScope.openScope();
		visitChildren(ctx);
		currentScope = currentScope.closeScope();
		return null;
	}


	@Override
	public DataType visitExBool(MaximusParser.ExBoolContext ctx) {
		 return addType(ctx, DataType.BOOLEAN) ;
	}

	@Override
	public DataType visitExPrint(MaximusParser.ExPrintContext ctx) {
		return super.visitExPrint(ctx);
	}

	@Override
	public DataType visitExAdd(MaximusParser.ExAddContext ctx) {
		DataType left = visit(ctx.left);
		DataType right = visit(ctx.right);
		if(left != right){
			throw new CompilerException("DataTypes do not match!");
		}
		return addType(ctx,left);
	}

	@Override
	public DataType visitExInc(MaximusParser.ExIncContext ctx) {
		return addType(ctx, DataType.INT);
	}


	@Override
	public DataType visitExString(MaximusParser.ExStringContext ctx) {
		return addType(ctx, DataType.STRING);
	}

	@Override
	public DataType visitExMul(MaximusParser.ExMulContext ctx) {
		DataType left = visit(ctx.left);
		DataType right = visit(ctx.right);
		if(left == DataType.STRING || right == DataType.STRING){
			throw new CompilerException("Strings can not be used in multiplication");
		}
		if(left == DataType.BOOLEAN || right == DataType.BOOLEAN){
			throw new CompilerException("Booleans can not be used in multiplication");
		}
		if(left != right){
			throw new CompilerException("DataTypes do not match!");
		}
		return addType(ctx,left);
	}

	@Override
	public DataType visitExInt(MaximusParser.ExIntContext ctx) {
		return addType(ctx, DataType.INT);
	}

	@Override
	public DataType visitExParentheses(MaximusParser.ExParenthesesContext ctx) {
		DataType type = visit(ctx.expression());
		return addType(ctx, type);
	}

	@Override
	public DataType visitExDouble(MaximusParser.ExDoubleContext ctx) {
		return addType(ctx, DataType.DOUBLE);
	}


	@Override
	public DataType visitExAssigner(MaximusParser.ExAssignerContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		if(currentScope.CheckIfInScope(name) == null && ctx.DECLARATION() == null){
			throw new CompilerException("Variable is not declared!");
		}else if(currentScope.CheckIfInScope(name) != null && ctx.DECLARATION() != null){
			throw new CompilerException("Variable already declared!");
		}else if(currentScope.CheckIfInScope(name) == null && ctx.DECLARATION() != null){
			DataType type = getDataTypeFromContext(ctx);
			localnums++;
			Symbol s = new Symbol(name,type,localnums);
			if(type == DataType.DOUBLE){
				localnums++;
			}
			currentScope.declareVariable(s);
			symbols.put(ctx, s);
		}
		return null;
	}

	@Override
	public DataType visitExCompareId(MaximusParser.ExCompareIdContext ctx) {
		Symbol assigned = currentScope.CheckIfInScope(ctx.left.getText());
		Symbol assigner = currentScope.CheckIfInScope(ctx.right.getText());

		if(assigned == null || assigner == null){
			throw new CompilerException("Variable not declared!");
		}
		return addType(ctx, DataType.BOOLEAN);
	}


	@Override
	public DataType visitExCompareEx(MaximusParser.ExCompareExContext ctx) {
		Symbol symbol = currentScope.CheckIfInScope(ctx.left.getText());
		if(symbol == null){
			throw new CompilerException("Variable not declared!");
		}
		return addType(ctx, DataType.BOOLEAN);
	}


	@Override
	public DataType visitExId(MaximusParser.ExIdContext ctx) {
		Symbol symbol = currentScope.CheckIfInScope(ctx.IDENTIFIER().getText());
		if(symbol == null){
			throw new CompilerException("Variable " + ctx.IDENTIFIER().getText() + " not declared or out of scope!");
		}
		symbols.put(ctx,symbol);
		return addType(ctx, symbol.getType());
	}

	//:TODO check array
	@Override
	public DataType visitExArray(MaximusParser.ExArrayContext ctx) {
		return super.visitExArray(ctx);
	}

	@Override
	public DataType visitFunction(MaximusParser.FunctionContext ctx) {
		if(currentScope.CheckIfInScope(ctx.mainId.getText()) != null){
			throw new CompilerException("Identifier already in use!");
		} else {
			localnums++;
			if(ctx.mainDec == null){
				currentScope.declareVariable(new Symbol(ctx.mainId.getText(),null,localnums));
				return null;
			} else {
				DataType returnType = getDataTypeFromContext(ctx);
				currentScope.declareVariable(new Symbol(ctx.mainId.getText(),returnType,localnums));
				return addType(ctx, returnType);
			}
		}
	}

	@Override
	public DataType visitDeclaredFunction(MaximusParser.DeclaredFunctionContext ctx) {
		if(currentScope.CheckIfInScope(ctx.mainId.getText()) == null){
			throw new CompilerException("Function not declared");
		}
		Symbol function = currentScope.CheckIfInScope(ctx.mainId.getText());
		return addType(ctx,function.getType());
	}

	private DataType addType(ParseTree node, DataType type) {
		types.put(node, type);
		return type;
	}

	@Override
	public DataType visitParameter(MaximusParser.ParameterContext ctx) {
		return super.visitParameter(ctx);
	}




	private DataType getDataTypeFromContext(MaximusParser.FunctionContext ctx){
		DataType type = null;
		switch (ctx.mainDec.getText()){
			case "num":
				type = DataType.INT;
				break;
			case "numnum":
				type = DataType.DOUBLE;
				break;
			case "booly":
				type = DataType.BOOLEAN;
				break;
			case "charCollection":
				type = DataType.STRING;
				break;
		}
		return type;
	}
		private DataType getDataTypeFromContext(MaximusParser.ExAssignerContext ctx){
			DataType type = null;
			switch (ctx.DECLARATION().getText()){
				case "num":
					type = DataType.INT;
					break;
				case "numnum":
					type = DataType.DOUBLE;
					break;
				case "booly":
					type = DataType.BOOLEAN;
					break;
				case "charCollection":
					type = DataType.STRING;
					break;
			}
			return type;
	}
}

