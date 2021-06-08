import java.util.ArrayList;

public class FunctionSymbol {
    DataType returnType;
    String name;
    ArrayList<String> parameters;

    public FunctionSymbol(DataType returnType, String name) {
        this.returnType = returnType;
        this.name = name;
        parameters = new ArrayList<>();
    }

    public DataType getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void addParameter(String name){
        parameters.add(name);
    }
}
