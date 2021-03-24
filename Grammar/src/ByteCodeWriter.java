import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ByteCodeWriter {

    private static ArrayList<String> errors = new ArrayList<>();


    public static void main(String[] args) {

        generateByteCode("1 increm$ \n 2 decrem$");

    }

    private static void generateByteCode(String line) {
        ByteCode b = new ByteCode("Test");
        ParseTreeProperty<DataType> types = new ParseTreeProperty<>();
        CodeGenerator c = new CodeGenerator(types, b);

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

            out.println(".class public Sum");
            out.println(".super java/lang/Object");
            out.println();

            for( String codeLine : b.getJasminCode() )
                out.println(codeLine);

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
