.class public test
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc 4
istore 1
iload 1
ldc 3
if_icmpgt isTrue1
ldc 0
goto endComparison1
isTrue1:
ldc 1
endComparison1:
ifeq endif1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
invokevirtual java/io/PrintStream/println(I)V
endif1:
iload 1
ldc 4
if_icmpeq isTrue3
ldc 0
goto endComparison3
isTrue3:
ldc 1
endComparison3:
ifeq endif3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
invokevirtual java/io/PrintStream/println(I)V
endif3:
iload 1
ldc 5
if_icmplt isTrue5
ldc 0
goto endComparison5
isTrue5:
ldc 1
endComparison5:
ifeq endif5
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
invokevirtual java/io/PrintStream/println(I)V
endif5:
return
.end method
