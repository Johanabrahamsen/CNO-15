import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ByteCodeWriter {

    private static ArrayList<String> errors = new ArrayList<>();


    public static void main(String[] args) {

        generateByteCode("BEGIN{\nnum a is 20$" +
                "doOn(a bigger 10){" +
                "show(a)$" +
                "a is (a minus 1)$" +
                "}}");

    }

    private static void generateByteCode(String line) {
        ByteCode b = new ByteCode("Test");
        ParseTreeProperty<DataType> types = new ParseTreeProperty<>();
        ParseTreeProperty<SymbolTable> symbols = new ParseTreeProperty<>();
        CodeGenerator c = new CodeGenerator(symbols, types, b);

        // Reset errors
        errors.clear();

        // Create lexer and run scanner to create stream of tokens
        CharStream charStream = CharStreams.fromString(line);
        MaximusLexer lexer = new MaximusLexer(charStream);
        setupErrorListener(lexer);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser and feed it the tokens
        MaximusParser parser = new MaximusParser(tokens);
        setupErrorListener(parser);
        MaximusParser.ProgramContext parseTree = parser.program();
        SymbolTable symbolTable = new SymbolTable(1);

        Checker checker = new Checker(types,symbols,symbolTable);
        try{
            checker.visit(parseTree);
        } catch (CompilerException e){
            System.err.println(e.getMessage());
        }


        // Have there been errors? Bail out
        if (errors.size() > 0) {
            for (String e : errors)
                System.out.println(e);
            return;
        }

        // Generate code
        c.visit(parseTree);

        try {
            // Write to file
            PrintWriter out = new PrintWriter(new File("test.j"));

            out.println(".class public test");
            out.println(".super java/lang/Object");
            out.println("");

            // Main method
            out.println(".method public static main([Ljava/lang/String;)V");
            out.println(".limit stack 99");
            out.println(".limit locals 99");
            out.println("");

            for( String codeLine : b.getJasminCode() )
                out.println(codeLine);

            out.println("return");
            out.println(".end method");

            out.close();
        } catch( IOException error ) {
            System.err.println("Error writing file: " + error.getMessage() );
        }
    }
    private static void setupErrorListener( Recognizer<?, ?> lexerOrParser ) {
        lexerOrParser.removeErrorListeners();
        lexerOrParser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e ) {
                errors.add( "ERROR at pos " + charPositionInLine + ": " + msg );
            }
        });
    }
}
