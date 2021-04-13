import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;



public class CodeGenerator extends MaximusBaseVisitor<Void>{
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<SymbolTable> symbols;
    private ByteCode byteCode;
    private int storeCount = 0;
    private int labelCount = 0;


    public CodeGenerator(ParseTreeProperty<SymbolTable>symbols,ParseTreeProperty<DataType> types, ByteCode byteCode) {
        this.types = types;
        this.byteCode = byteCode;
        this.symbols = symbols;
    }

    @Override
    public Void visitAssignment(MaximusParser.AssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        SymbolTable st = symbols.get(ctx);
        Symbol s = symbols.get(ctx).lookUp(name);
        visit(ctx.value());

        switch (types.get(ctx)){
            case DOUBLE:
                byteCode.add("dstore " + s.getStoreNr());
                break;
            case INT:
            case BOOLEAN:
                byteCode.add("istore " + s.getStoreNr());
                break;
            case STRING:
                byteCode.add("astore " + s.getStoreNr());
                break;
            case OTHER:
                throw new CompilerException("encountered unknown datatype for " + s.getName());
        }
        return null;
    }

    @Override
    public Void visitDeclaration(MaximusParser.DeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol s = symbols.get(ctx).lookUp(name);
        if(ctx.value() != null){
            visit(ctx.value());
        }
        switch (types.get(ctx)){
            case DOUBLE:
                byteCode.add("dstore " + s.getStoreNr());
                break;
            case INT:
            case BOOLEAN:
                byteCode.add("istore " + s.getStoreNr());
                break;
            case STRING:
                byteCode.add("astore " + s.getStoreNr());
                break;
            case OTHER:
                throw new CompilerException("encountered unknown datatype for " + s.getName());
        }
        return null;
    }

    @Override
    public Void visitExCompareId(MaximusParser.ExCompareIdContext ctx) {
        Symbol left = symbols.get(ctx).lookUp(ctx.left.getText());
        Symbol right = symbols.get(ctx).lookUp(ctx.right.getText());
        labelCount++;
        switch (left.getType()){
            case INT, BOOLEAN ->
                    {
              byteCode.add("iload " + left.getStoreNr());
              byteCode.add("iload " + right.getStoreNr());
              if(left.getType() == DataType.INT | left.getType() == DataType.BOOLEAN ){
                  if(ctx.COMPARATORS().getText().equals("equals")){
                      byteCode.add("if_icmpeq " + "isTrue" + labelCount);
                      writeComparisonTrueOrFalse();

                  } else if (ctx.COMPARATORS().getText().equals("not_equals")){
                      byteCode.add("if_icmpne " + "isTrue" + labelCount);
                      writeComparisonTrueOrFalse();
                  }
              }
              if(left.getType() == DataType.INT){
                  if(ctx.COMPARATORS().getText().equals("bigger")){
                      byteCode.add("if_icmpgt " + "isTrue" + labelCount);
                      writeComparisonTrueOrFalse();
                  }else if(ctx.COMPARATORS().getText().equals("smaller")){
                      byteCode.add("if_icmplt " + "isTrue" + labelCount);
                      writeComparisonTrueOrFalse();
                  }
              }
            }
//            case DOUBLE -> {
//                byteCode.add("dload " + left.getStoreNr());
//                byteCode.add("ldc 10000.0");
//                byteCode.add("dmul");
//                byteCode.add("d2i");
//                byteCode.add("dload " + right.getStoreNr());
//                byteCode.add("ldc 10000.0");
//                byteCode.add("dmul");
//                byteCode.add("d2i");
//
//                if(ctx.COMPARATORS().getText().equals("equals")){
//                    byteCode.add("if_icmpeq " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                } else if (ctx.COMPARATORS().getText().equals("not_equals")){
//                    byteCode.add("if_icmpne " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                } else if(ctx.COMPARATORS().getText().equals("bigger")){
//                    byteCode.add("if_icmpgt " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                }else if(ctx.COMPARATORS().getText().equals("smaller")){
//                    byteCode.add("if_icmplt " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                }
//            }
        }
        return null;
    }

    @Override
    public Void visitExBool(MaximusParser.ExBoolContext ctx) {
        if("valid".equals(ctx.getText())){
            byteCode.add("ldc 1");
        } else {
            byteCode.add("ldc 0");
        }
        return null;
    }

    @Override
    public Void visitExCompareEx(MaximusParser.ExCompareExContext ctx) {
        Symbol left = symbols.get(ctx).lookUp(ctx.left.getText());
        labelCount++;
        switch (left.getType()){
            case INT, BOOLEAN ->
                    {
                        byteCode.add("iload " + left.getStoreNr());
                        visit(ctx.right);
                        if(left.getType() == DataType.INT | left.getType() == DataType.BOOLEAN ){
                            if(ctx.COMPARATORS().getText().equals("equals")){
                                byteCode.add("if_icmpeq " + "isTrue" + labelCount);
                                writeComparisonTrueOrFalse();

                            } else if (ctx.COMPARATORS().getText().equals("not_equals")){
                                byteCode.add("if_icmpne " + "isTrue" + labelCount);
                                writeComparisonTrueOrFalse();
                            }
                        }
                        if(left.getType() == DataType.INT){
                            if(ctx.COMPARATORS().getText().equals("bigger")){
                                byteCode.add("if_icmpgt " + "isTrue" + labelCount);
                                writeComparisonTrueOrFalse();
                            }else if(ctx.COMPARATORS().getText().equals("smaller")){
                                byteCode.add("if_icmplt " + "isTrue" + labelCount);
                                writeComparisonTrueOrFalse();
                            }
                        }
                    }
//            case DOUBLE -> {
//                byteCode.add("dload " + left.getStoreNr());
//                byteCode.add("ldc 10000.0");
//                byteCode.add("dmul");
//                byteCode.add("d2i");
//                byteCode.add("ldc " + ctx.right);
//                byteCode.add("ldc 10000.0");
//                byteCode.add("dmul");
//                byteCode.add("d2i");
//
//                if(ctx.COMPARATORS().getText().equals("equals")){
//                    byteCode.add("if_icmpeq " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                } else if (ctx.COMPARATORS().getText().equals("not_equals")){
//                    byteCode.add("if_icmpne " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                } else if(ctx.COMPARATORS().getText().equals("bigger")){
//                    byteCode.add("if_icmpgt " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                }else if(ctx.COMPARATORS().getText().equals("smaller")){
//                    byteCode.add("if_icmplt " + "isTrue" + labelCount);
//                    writeComparisonTrueOrFalse();
//                }
//            }
        }
        return null;
    }

    @Override
    public Void visitExAdd(MaximusParser.ExAddContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if("add".equals(ctx.OPERATORS().getText())){
            byteCode.add("iadd");
        } else {
            byteCode.add("isub");
        }
        return null;
    }


    @Override
    public Void visitExVariable(MaximusParser.ExVariableContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol s = symbols.get(ctx).lookUp(name);
        if( s.getType() == DataType.INT || s.getType() == DataType.BOOLEAN){
            byteCode.add("iload " + s.getStoreNr());
        }else if (s.getType() == DataType.DOUBLE){
            byteCode.add("dload " + s.getStoreNr());
        }else if (s.getType() == DataType.STRING){

        }
        return null;
    }

    @Override
    public Void visitExString(MaximusParser.ExStringContext ctx) {
        byteCode.add("ldc " + ctx.getText());
        return null;
    }

    @Override
    public Void visitExMul(MaximusParser.ExMulContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if("times".equals(ctx.MUL_OPS().getText())){
            byteCode.add("imul");
        } else{
            byteCode.add("idiv");
        }
        return null;
    }

    @Override
    public Void visitExInt(MaximusParser.ExIntContext ctx) {
        byteCode.add("ldc " + ctx.getText());
        return null;
    }


    @Override
    public Void visitExDouble(MaximusParser.ExDoubleContext ctx) {
        byteCode.add("ldc2_w " + ctx.getText());
        return null;
    }

    @Override
    public Void visitCondition(MaximusParser.ConditionContext ctx) {
        visit(ctx.expression());
        String label = "endif" + (labelCount++);
        byteCode.add("ifeq " + label);
        visit(ctx.scope());
        byteCode.add(label + ":");
        return null;
    }

    @Override
    public Void visitMultiCompare(MaximusParser.MultiCompareContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if("and".equals(ctx.LOGICALS().getText())){
            byteCode.add("iand");
        } else {
            byteCode.add("ior");
        }
        return null;
    }

    @Override
    public Void visitArrayGet(MaximusParser.ArrayGetContext ctx) {
        ArraySymbol as = symbols.get(ctx).lookUpArray(ctx.IDENTIFIER().getText());
        byteCode.add("aload " + as.getStoreNumber());
        byteCode.add("ldc " + ctx.INT().getText());
        if(as.getDataType() == DataType.INT){
            byteCode.add("iaload");
        }
        if(as.getDataType() == DataType.BOOLEAN){
            byteCode.add("baload");
        }
        if(as.getDataType() == DataType.DOUBLE){
            byteCode.add("daload");
        }
        if(as.getDataType() == DataType.STRING){
            byteCode.add("aaload");
        }
        return null;
    }

    @Override
    public Void visitArrayPut(MaximusParser.ArrayPutContext ctx) {
        ArraySymbol as = symbols.get(ctx).lookUpArray(ctx.IDENTIFIER().getText());
        byteCode.add("aload " + as.getStoreNumber());
        byteCode.add("ldc " + ctx.INT().getText());
        visit(ctx.value());
        if(as.getDataType() == DataType.INT){
            byteCode.add("iastore");
        }
        if(as.getDataType() == DataType.BOOLEAN){
            byteCode.add("bastore");
        }
        if(as.getDataType() == DataType.DOUBLE){
            byteCode.add("dastore");
        }
        if(as.getDataType() == DataType.STRING){
            byteCode.add("aastore");
        }
        return null;
    }

    @Override
    public Void visitArrayDeclaration(MaximusParser.ArrayDeclarationContext ctx) {
        ArraySymbol as = symbols.get(ctx).lookUpArray(ctx.IDENTIFIER().getText());
        byteCode.add("ldc " + ctx.INT().getText());
        if(as.getDataType() == DataType.STRING){
            byteCode.add("anewarray java/lang/string");
        } else {
            String datatype;
            if(as.getDataType() == DataType.INT){
                datatype = "int";
            } else if(as.getDataType() == DataType.DOUBLE){
                datatype = "double";
            } else{
                datatype = "boolean";
            }
            byteCode.add("newarray " + datatype);
        }
        byteCode.add("astore " + as.getStoreNumber());
        return super.visitArrayDeclaration(ctx);
    }

//    @Override
//    public Void visitFunction(MaximusParser.FunctionContext ctx) {
//        return super.visitFunction(ctx);
//    }

    @Override
    public Void visitExPrint(MaximusParser.ExPrintContext ctx) {
        byteCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expression());
        switch (types.get(ctx)) {
            case DOUBLE:
                byteCode.add("invokevirtual java/io/PrintStream/println(D)V");
                break;
            case INT:
                byteCode.add("invokevirtual java/io/PrintStream/println(I)V");
                break;
            case STRING:
                byteCode.add("java/io/PrintStream/println(Ljava/lang/String;)V");
                break;
            case BOOLEAN:
                byteCode.add("invokevirtual java/io/PrintStream/println(Z)V");
                break;
        }
        return null;
    }

    @Override
    public Void visitExScan(MaximusParser.ExScanContext ctx) {
        return super.visitExScan(ctx);
    }

    @Override
    public Void visitWhileLoop(MaximusParser.WhileLoopContext ctx) {
        labelCount++;
        String start = "whileStart" + labelCount;
        String end = "whileEnd" + labelCount;
        byteCode.add(start + ":");
        visit(ctx.expression());
        byteCode.add("ifeq " + end );
        visit(ctx.scope());
        byteCode.add("goto " + start);
        byteCode.add(end + ":");
        return null;
    }

    @Override
    public Void visitForLoop(MaximusParser.ForLoopContext ctx) {
        SymbolTable s = symbols.get(ctx);
        int totalCountStore = s.getNextIndex();
        int currentCountStore = s.getNextIndex();
        labelCount++;
        String start = "forStart" + labelCount;
        String end = "forEnd" + labelCount;
        byteCode.add("ldc " + ctx.INT().getText());
        byteCode.add("istore " + totalCountStore);
        byteCode.add("ldc 0");
        byteCode.add("istore " + currentCountStore);
        byteCode.add(start + ":");
        byteCode.add("iload " + totalCountStore);
        byteCode.add("iload " + currentCountStore);
        byteCode.add("if_icmpeq " + end);
        visit(ctx.scope());
        byteCode.add("iinc " + currentCountStore + " 1");
        byteCode.add("goto " + start);
        byteCode.add(end + ":");
        return null;
    }

    public void writeComparisonTrueOrFalse(){
        byteCode.add("ldc 0");
        byteCode.add("goto endComparison" + labelCount);
        byteCode.add("isTrue" + labelCount + ":");
        byteCode.add("ldc 1");
        byteCode.add("endComparison" + labelCount + ":");
    }

}
