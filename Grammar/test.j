.class public test
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc 0
istore 1
ldc 1
istore 2
whileStart1:
iload 1
ldc 0
if_icmpeq isTrue2
ldc 0
goto endComparison2
isTrue2:
ldc 1
endComparison2:
ifeq whileEnd1
ldc 5
istore 3
ldc 0
istore 4
forStart3:
iload 3
iload 4
if_icmpeq forEnd3
iload 2
ldc 1
iadd
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
iload 2
ldc 12
if_icmpgt isTrue4
ldc 0
goto endComparison4
isTrue4:
ldc 1
endComparison4:
ifeq endif4
ldc 1
istore 1
endif4:
iinc 4 1
goto forStart3
forEnd3:
goto whileStart1
whileEnd1:
return
.end method
