import org.antlr.v4.runtime.tree.*;

import java.util.concurrent.CompletionException;

public class Checker extends MaximusBaseVisitor<DataType> {
	private ParseTreeProperty<DataType> types;
	private ParseTreeProperty<SymbolTable> scopes;
	private SymbolTable symbolTable;

	public Checker(ParseTreeProperty<DataType> types, ParseTreeProperty<SymbolTable> scopes, SymbolTable symbolTable ) {
		this.types = types;
		this.scopes = scopes;
		this.symbolTable = symbolTable;

	}



	@Override
	public DataType visitScope(MaximusParser.ScopeContext ctx) {
		scopes.put(ctx, symbolTable);
		symbolTable = symbolTable.openScope();
		visitChildren(ctx);
		symbolTable = symbolTable.closeScope();
		return null;
	}


	@Override
	public DataType visitExBool(MaximusParser.ExBoolContext ctx) {
		scopes.put(ctx,symbolTable);
		return addType(ctx, DataType.BOOLEAN) ;
	}

	@Override
	public DataType visitExAdd(MaximusParser.ExAddContext ctx) {
		DataType left = visit(ctx.left);
		DataType right = visit(ctx.right);
		if(left != right){
			throw new CompilerException("DataTypes do not match!");
		}
		scopes.put(ctx, symbolTable);
		return visit(ctx.left);
	}

	@Override
	public DataType visitExInc(MaximusParser.ExIncContext ctx) {

		return addType(ctx, DataType.INT);
	}


	@Override
	public DataType visitExString(MaximusParser.ExStringContext ctx) {
		scopes.put(ctx,symbolTable);
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
		scopes.put(ctx,symbolTable);
		return addType(ctx, DataType.INT);
	}


	@Override
	public DataType visitExDouble(MaximusParser.ExDoubleContext ctx) {
		scopes.put(ctx,symbolTable);
		return addType(ctx, DataType.DOUBLE);
	}


	@Override
	public DataType visitAssignment(MaximusParser.AssignmentContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		Symbol s = symbolTable.lookUpLocal(name);
		if(s == null){
			throw new CompilerException("Variable " + name + " is not declared!");
		}
		scopes.put(ctx, symbolTable);
		types.put(ctx,s.getType());
		return symbolTable.lookUp(name).getType();
	}

	@Override
	public DataType visitDeclaration(MaximusParser.DeclarationContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		Symbol s = symbolTable.lookUp(name);
		if(s != null){
			throw new CompilerException("Variable " + name + "already declared!");
		}
		symbolTable.add(name,symbolTable.getDataType(ctx.DECLARATION().getText()));
		scopes.put(ctx,symbolTable);
		types.put(ctx,symbolTable.getDataType(ctx.DECLARATION().getText()));
		return symbolTable.lookUp(name).getType();
	}


	@Override
	public DataType visitExCompareId(MaximusParser.ExCompareIdContext ctx) {
		Symbol assigned = symbolTable.lookUp(ctx.left.getText());
		Symbol assigner = symbolTable.lookUp(ctx.right.getText());

		if(assigned == null || assigner == null){
			throw new CompilerException("Variable not declared!");
		}
		scopes.put(ctx,symbolTable);
		return addType(ctx, DataType.BOOLEAN);
	}


	@Override
	public DataType visitExCompareEx(MaximusParser.ExCompareExContext ctx) {
		Symbol symbol = symbolTable.lookUp(ctx.left.getText());
		if(symbol == null){
			throw new CompilerException("Variable not declared!");
		}
		scopes.put(ctx,symbolTable);
		return addType(ctx, DataType.BOOLEAN);
	}

	@Override
	public DataType visitExVariable(MaximusParser.ExVariableContext ctx) {
		Symbol symbol = symbolTable.lookUp(ctx.IDENTIFIER().getText());
		if(symbol == null){
			throw new CompilerException("Variable " + ctx.IDENTIFIER().getText() + " not declared or out of scope!");
		}
		scopes.put(ctx,symbolTable);
		return addType(ctx,symbol.getType());
	}

	//:TODO check array
	@Override
	public DataType visitExArray(MaximusParser.ExArrayContext ctx) {
		return super.visitExArray(ctx);
	}

	@Override
	public DataType visitFunction(MaximusParser.FunctionContext ctx) {
		if(symbolTable.lookUp(ctx.mainId.getText()) != null){
			throw new CompilerException("Identifier already in use!");
		} else {
			return null;
		}
	}

	@Override
	public DataType visitDeclaredFunction(MaximusParser.DeclaredFunctionContext ctx) {
		if(symbolTable.lookUp(ctx.mainId.getText()) == null){
			throw new CompilerException("Function not declared");
		}
		Symbol function = symbolTable.lookUp(ctx.mainId.getText());
		return addType(ctx,function.getType());
	}

	private DataType addType(ParseTree node, DataType type) {
		types.put(node, type);
		return type;
	}



}

