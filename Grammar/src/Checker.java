import org.antlr.v4.runtime.tree.*;

import java.util.concurrent.CompletionException;

public class Checker extends MaximusBaseVisitor<DataType> {
	private final ParseTreeProperty<DataType> types;
	private final ParseTreeProperty<SymbolTable> scopes;
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
		return addType(ctx,visit(ctx.left));
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
		Symbol s = symbolTable.lookUp(name);
		if(s == null){
			throw new CompilerException("Variable " + name + " is not declared!");
		}
		if(s.getType() != visit(ctx.expression())){
			throw new CompilerException("Variable and values types do not match!");
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
	public DataType visitPrint(MaximusParser.PrintContext ctx) {
		return addType(ctx,visit(ctx.expression()));
	}


	@Override
	public DataType visitExParentheses(MaximusParser.ExParenthesesContext ctx) {
		return addType(ctx,visit(ctx.expression()));
	}

	@Override
	public DataType visitExCompareId(MaximusParser.ExCompareIdContext ctx) {
		Symbol assigned = symbolTable.lookUp(ctx.left.getText());
		Symbol assigner = symbolTable.lookUp(ctx.right.getText());

		if(assigned == null || assigner == null){
			throw new CompilerException("Variable not declared!");
		}
		if(assigned.getType() != assigner.getType()){
			throw new CompilerException("Types do not match!");
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
		if(symbol.getType() != visit(ctx.right)){
			throw new CompilerException("Types dont match!");
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
	public DataType visitArrayGet(MaximusParser.ArrayGetContext ctx) {
		ArraySymbol as = symbolTable.lookUpArray(ctx.IDENTIFIER().getText());
		if(as == null){
			throw new CompilerException("array" + ctx.IDENTIFIER().getText() + " not defined!");
		}
		if((as.getSize()-1) < Integer.parseInt(ctx.INT().getText())){
			throw new CompilerException("Index is out of bounds of array");
		}
		scopes.put(ctx, symbolTable);
		return addType(ctx, as.getDataType());
	}

	@Override
	public DataType visitArrayDeclaration(MaximusParser.ArrayDeclarationContext ctx) {
		String name = ctx.IDENTIFIER().getText();
		DataType type = symbolTable.getDataType(ctx.DECLARATION().getText());
		if(symbolTable.lookUp(name) != null){
			throw new CompilerException("Variable name already in use for something other than array");
		}
		if(type == DataType.ARRAY || type == DataType.OTHER){
			throw new CompilerException("Not allowed to store these data types in an array");
		}
		symbolTable.addArray(name,Integer.parseInt(ctx.INT().getText()),type);
		scopes.put(ctx,symbolTable);
		return addType(ctx,DataType.ARRAY);
	}

	@Override
	public DataType visitArrayAssignment(MaximusParser.ArrayAssignmentContext ctx) {
		ArraySymbol as = symbolTable.lookUpArray(ctx.IDENTIFIER().getText());
		if(as == null){
			throw new CompilerException("Array not yet declared or out of scope!");
		}
		if(as.getDataType() != visit(ctx.expression())){
			throw new CompilerException("Datatype not allowed to be stored in array");
		}
		if((as.getSize()-1) < Integer.parseInt(ctx.INT().getText())){
			throw new CompilerException("Index is out of bounds of array");
		}
		scopes.put(ctx,symbolTable);
		return super.visitArrayAssignment(ctx);
	}

	//	@Override
//	public DataType visitFunction(MaximusParser.FunctionContext ctx) {
//		if(symbolTable.lookUp(ctx.mainId.getText()) != null){
//			throw new CompilerException("Identifier already in use!");
//		} else {
//			return null;
//		}
//	}

	@Override
	public DataType visitFunctionCall(MaximusParser.FunctionCallContext ctx) {
		if(symbolTable.lookUp(ctx.mainId.getText()) == null){
			throw new CompilerException("Function not declared");
		}
		Symbol function = symbolTable.lookUp(ctx.mainId.getText());
		return addType(ctx,function.getType());
	}

	@Override
	public DataType visitWhileLoop(MaximusParser.WhileLoopContext ctx) {
		if(visit(ctx.expression()) != DataType.BOOLEAN){
			throw new CompilerException("Expression is not of type boolean!");
		}
		scopes.put(ctx,symbolTable);
		visit(ctx.scope());
		return null;
	}

	@Override
	public DataType visitForLoop(MaximusParser.ForLoopContext ctx) {
		scopes.put(ctx,symbolTable);
		visit(ctx.scope());
		return null;
	}

	@Override
	public DataType visitCondition(MaximusParser.ConditionContext ctx) {
		if(visit(ctx.expression()) != DataType.BOOLEAN){
			throw new CompilerException("Expression not of type boolean!");
		}
		if(ctx.children.isEmpty()){
			throw new CompilerException("Condition does nothing");
		}
		scopes.put(ctx,symbolTable);
		visit(ctx.scope());
		return null;
	}

	private DataType addType(ParseTree node, DataType type) {
		types.put(node, type);
		return type;
	}


}

