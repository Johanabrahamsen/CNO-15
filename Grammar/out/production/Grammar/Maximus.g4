

grammar Maximus;

program: 'BEGIN' scope EOF;

scope: '{' statement* ('result ' expression)?'}';

statement:  expression '$' | conditional  |
        'doOn(' expression ')' scope | 'loop[' INT ']times' scope | function;

expression:             '(' expression ')'                                       #ExParentheses
                      | DECLARATION? IDENTIFIER ASSIGNER (expression | declaredFunction | scan) #ExAssigner
                      | left=expression MUL_OPS right=expression                 #ExMul
                      | left=expression OPERATORS right=expression               #ExAdd
                      | expression INC_OP                                        #ExInc
                      | left=IDENTIFIER COMPARATORS right=IDENTIFIER             #ExCompareId
                      | left=IDENTIFIER COMPARATORS right=expression             #ExCompareEx
                      | IDENTIFIER                                               #ExId
                      | INT                                                      #ExInt
                      | STRING                                                   #ExString
                      | BOOLEAN                                                  #ExBool
                      | DOUBLE                                                   #ExDouble
                      | 'arr' IDENTIFIER ASSIGNER OBJECT_INITIALIZER ('arr{' INT '}'|IDENTIFIER) #ExArray
                      | print                                                    #ExPrint
                      | scan                                                     #ExScan
                      ;

scan: 'ask()';

conditional: ('condition(' expression ')' scope)+ ('notMet' scope)?;

function: DECLARATION? IDENTIFIER '(' (DECLARATION IDENTIFIER)* ')' scope;

declaredFunction: IDENTIFIER '(' (DECLARATION IDENTIFIER)* ')';

print: 'showString(' STRING ')';

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
IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;
BOOLEAN: 'valid' | 'invalid';
DOUBLE:  '-'? [1-9][0-9]* '.' [0-9]*;
WS: [\r\n\t ]+ -> skip;
COMMENT: '!!'.*? [\n\r]+ -> skip;