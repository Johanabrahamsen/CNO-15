import java.util.HashMap;

public class SymbolTable {

    private int nextIndex;
    private SymbolTable parentScope;

    private final HashMap<String,Symbol> symbols;
    private final HashMap<String,ArraySymbol> arrays;
    private final HashMap<String,FunctionSymbol> functions;

    public SymbolTable(int offset) {
        this.nextIndex = offset;
        this.symbols = new HashMap<>();
        this.arrays = new HashMap<>();
        this.functions = new HashMap<>();
    }

    public SymbolTable getParentScope() {
        return parentScope;
    }


    public Symbol lookUp(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null && parentScope != null) {
            symbol = parentScope.lookUp(name);
        }
        return symbol;
    }

    public ArraySymbol lookUpArray(String name){
        ArraySymbol as = arrays.get(name);
        if (as == null && parentScope != null) {
            as = parentScope.lookUpArray(name);
        }
        return as;
    }

    public FunctionSymbol lookUpFunction(String name){
        FunctionSymbol fs = functions.get(name);
        if(fs == null && parentScope !=null){
            fs = parentScope.lookUpFunction(name);
        }
        return fs;
    }

    public void add(String name, DataType type) {
        symbols.put(name,new Symbol(name,type,nextIndex));

        if (type == DataType.DOUBLE ) {
            nextIndex += 2;
        } else {
            nextIndex++;
        }
    }

    public void addArray(String name, int size, DataType dataType){
        arrays.put(name,new ArraySymbol(dataType,size,nextIndex));

        if (dataType == DataType.DOUBLE){
            nextIndex += (size * 2);
        } else {
            nextIndex += size;
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

    public int getNextIndex(){
        return (nextIndex++);
    }


}
