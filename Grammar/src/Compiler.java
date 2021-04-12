import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Compiler {
    private ParseTreeProperty<DataType>types = new ParseTreeProperty<>();
    private ParseTreeProperty<SymbolTable> symbols = new ParseTreeProperty<>();
    private SymbolTable symbolTable = new SymbolTable(1);

    private int errorCount = 0;

    public static void main(String[] args) {
        Compiler compiler = new Compiler();

        Path sourceCodePath = Paths.get(args[0]);
        String fileName =  sourceCodePath.getFileName().toString();
        String className = getClassName(fileName);
        String outputFilename = Paths.get(args[0]).getParent().resolve(className+".j").toString();

        ByteCode result = compiler.compile(fileName, className);
        try {
            result.writeJasminToFile(outputFilename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getClassName(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        return fileName.substring(0, dotIndex == -1 ? fileName.length() : dotIndex);
    }

    public ByteCode compile(String filePath, String className){
        try {
            CharStream input = CharStreams.fromFileName(filePath);

            CommonTokenStream tokens = runLexer(input);
            ParseTree tree = runParser(tokens);

            if( errorCount == 0){
                if(!runChecker(tree)){
                    return null;
                }
                return generateCode(tree,className);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ByteCode generateCode(ParseTree tree, String className){
        ByteCode byteCode = new ByteCode( className );

        byteCode.add(".class public " + className);
        byteCode.add(".super java/lang/Object");
        byteCode.add("");

        // Main method
        byteCode.add(".method public static main([Ljava/lang/String;)V");
        byteCode.add(".limit stack 99");
        byteCode.add(".limit locals 99");
        byteCode.add("");

        CodeGenerator codeGenerator = new CodeGenerator(symbols, types,  byteCode );
        codeGenerator.visit(tree);

        byteCode.add("return");
        byteCode.add(".end method");

        return byteCode;
    }

    private CommonTokenStream runLexer(CharStream input ) {
        MaximusLexer lexer = new MaximusLexer(input);
        lexer.addErrorListener(getErrorListener());
        return new CommonTokenStream(lexer);
    }

    private ParseTree runParser( CommonTokenStream tokens ) {
       MaximusParser parser = new MaximusParser(tokens);
        parser.addErrorListener(getErrorListener());
        return parser.program();
    }

    private boolean runChecker( ParseTree parseTree ) {
        try {
            Checker checker = new Checker(types, symbols,symbolTable);
            checker.visit(parseTree);
            return true;
        } catch (CompilerException ce) {
            System.err.println(ce.getMessage());
            return false;
        }
    }

    private ANTLRErrorListener getErrorListener() {
        return new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                errorCount++;
            }
        };
    }
}
