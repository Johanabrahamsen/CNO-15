import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ByteCode {
    private ArrayList<String> jasminCode;
    private String className;

    public ByteCode(String className) {
        this.className = className;
        this.jasminCode = new ArrayList<>();
    }

    public ByteCode(String className, ArrayList<String> jasminCode ) {
        this.className = className;
        this.jasminCode = jasminCode;
    }

    public void add( String line ) {
        jasminCode.add(line);
    }

    public void writeJasminToFile( String jasminFileName ) throws IOException {
        PrintWriter jasminOut = new PrintWriter(new FileWriter(jasminFileName));
        for( String line : jasminCode )
            jasminOut.println(line);
        jasminOut.close();
    }

    public String getClassName() {
        return className;
    }

    public List<String> getLines() {
        return jasminCode;
    }

    public ArrayList<String> getJasminCode() {
        return jasminCode;
    }
}


