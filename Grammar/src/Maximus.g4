

grammar Maximus;

program: 'BEGIN' scope EOF;

scope: '('parameter*')' scope | '{' statement* ('result ' expression)?'}';

statement:  expression '$' | conditional  |
        whileLoop | forLoop | function;

expression:             '(' expression ')'                                       #ExParentheses
                      | IDENTIFIER ASSIGNER value                                #assignment
                      | DECLARATION IDENTIFIER (ASSIGNER value)?                 #declaration
                      | left=expression MUL_OPS right=expression                 #exMul
                      | left=expression OPERATORS right=expression               #exAdd
                      | expression INC_OP                                        #exInc
                      | left=IDENTIFIER COMPARATORS right=IDENTIFIER             #exCompareId
                      | left=IDENTIFIER COMPARATORS right=expression             #exCompareEx
                      | INT                                                      #ExInt
                      | STRING                                                   #ExString
                      | BOOLEAN                                                  #ExBool
                      | DOUBLE                                                   #ExDouble
                      | IDENTIFIER                                               #exVariable

                      | 'arr' mainId=IDENTIFIER ASSIGNER OBJECT_INITIALIZER ('arr{' INT '}'|IDENTIFIER) #exArray
                      | print                                                    #exPrint
                      | scan                                                     #exScan
                      ;

scan: 'ask()';

value: (expression | declaredFunction | scan);

whileLoop:'doOn(' expression ')' scope;

forLoop: 'loop[' INT ']times' scope | function;

conditional: condition+;

condition: 'condition(' expression ')' scope | ('notMet' scope);

function: mainDec=DECLARATION? mainId=IDENTIFIER scope;

declaredFunction: mainId=IDENTIFIER '('parameter*')';

parameter: DECLARATION IDENTIFIER (',')?;

print: 'show(' expression ')';

OPERATORS:  'add' | 'minus' ;
MUL_OPS: 'times' | 'div' ;
INC_OP: 'increm' | 'decrem';
ASSIGNER: 'is';
COMPARATORS: 'equals' | 'not_equals' | 'bigger' | 'smaller';
LOGICALS: 'and' | 'or';
DECLARATION: INT_TYPE | STRING_TYPE | BOOLEAN_TYPE | DOUBLE_TYPE;
INT_TYPE: 'num';
STRING_TYPE: 'charCollection';
BOOLEAN_TYPE: 'booly';
DOUBLE_TYPE: 'numnum';
ARRAY_TYPE: 'arr';
OBJECT_INITIALIZER: 'create';
INT: '0' |'-'? [1-9][0-9]*;
STRING: '"' ~('\n'|'\r')* '"';
BOOLEAN: 'valid' | 'invalid';
DOUBLE:  '-'? [1-9][0-9]* '.' [0-9]*;
IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;
WS: [\r\n\t ]+ -> skip;
COMMENT: '!!'.*? [\n\r]+ -> skip;