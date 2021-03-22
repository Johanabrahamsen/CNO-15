import org.antlr.v4.runtime.tree.*;

/**
 * Visitor that determines the data types of expressions and selectively associates
 * the datatype with the parse tree node in the ParseTreeProperty.
 */
public class Checker extends MaximusBaseVisitor<DataType> {
	private ParseTreeProperty<DataType> types;

	public Checker(ParseTreeProperty<DataType> types ) {
		this.types = types;
	}

	public ParseTreeProperty<DataType> getTypes() {
		return this.types;
	}


}
