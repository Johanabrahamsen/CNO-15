.class public test
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc 20
istore 1
whileStart1:
iload 1
ldc 10
if_icmpgt isTrue2
ldc 0
goto endComparison2
isTrue2:
ldc 1
endComparison2:
ifeq whileEnd1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
iload 1
ldc 1
isub
istore 1
goto whileStart1
whileEnd1:
return
.end method
