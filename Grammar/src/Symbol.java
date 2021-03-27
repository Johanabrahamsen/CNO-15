public class Symbol {

    private String name;
    private DataType type;
    private int storeNr;

    public Symbol( String name, DataType type, int storeNr){
        this.name = name;
        this.type = type;
        this.storeNr = storeNr;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public int getStoreNr() {
        return storeNr;
    }
}
