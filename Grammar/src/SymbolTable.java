import java.util.HashMap;

public class SymbolTable {

    private int nextIndex;
    private SymbolTable parentScope;

    private final HashMap<String,Symbol> symbols;

    public SymbolTable(int offset) {
        this.nextIndex = offset;
        this.symbols = new HashMap<>();
    }

    public SymbolTable getParentScope() {
        return parentScope;
    }

    public Symbol lookUpLocal(String name) {
        return symbols.get(name);
    }

    public Symbol lookUp(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null && parentScope != null) {
            symbol = parentScope.lookUp(name);
        }
        return symbol;
    }

    public void add(String name, DataType type) {
        symbols.put(name,new Symbol(name,type,nextIndex));

        if (type == DataType.DOUBLE ) {
            nextIndex += 2;
        } else {
            nextIndex++;
        }
    }

    private SymbolTable createScope(int offset) {
        SymbolTable childScope = new SymbolTable(offset);
        childScope.parentScope = this;

        return childScope;
    }

    public SymbolTable openScope() {
        return createScope(nextIndex);
    }

    public SymbolTable openFunctionScope() {
        return createScope(0);
    }

    public SymbolTable closeScope() { return parentScope; }

    public DataType getDataType(String type){
        DataType d = DataType.OTHER;
        switch (type){
            case "num":
                d = DataType.INT;
                break;
            case "numnum":
                d = DataType.DOUBLE;
                break;
            case "booly":
                d = DataType.BOOLEAN;
                break;
            case "charCollection":
                d = DataType.STRING;
                break;
        }
        return d;
    }


}
