public class ArraySymbol {
    private DataType dataType;
    private int size;
    private int storeNumber;

    public ArraySymbol(DataType dataType, int size, int storeNumber) {
        this.dataType = dataType;
        this.size = size;
        this.storeNumber = storeNumber;
    }

    public DataType getDataType() {
        return dataType;
    }

    public int getSize() {
        return size;
    }

    public int getStoreNumber() {
        return storeNumber;
    }
}
