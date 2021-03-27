import java.util.HashMap;

public class Scope {

    private HashMap<String,Symbol> symbols = new HashMap<>();
    private Scope parentScope;

    public void declareVariable(Symbol symbol) {
        symbols.put(symbol.getName(),symbol);
    }

    public Symbol CheckIfInScope( String name ){
        Symbol s = symbols.get(name);
        if( s == null && parentScope != null){
            return parentScope.CheckIfInScope(name);
        }
        return s;
    }

    public Scope openScope(){
     Scope childScope = new Scope();
     childScope.parentScope = this;
     return childScope;
    }

    public Scope closeScope(){
        return parentScope;
    }
}
