.class public test
.super java/lang/Object

istore 1
ldc 5
istore 1
iload 1
ldc 6
iadd
ldc 1
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
iload 1
iload 2
if_icmpgt
