

grammar Maximus;

program: statement* EOF;

statement:  expression '$' | conditional  |
        'doOn(' expression '){' statement* '}' | 'loop[' INT ']times{' statement* '}'| function;

expression: '(' expression ')'                                                   #ExParentheses
                      | DECLARATION? IDENTIFIER ASSIGNER (expression | function) #ExAssigner
                      | expression MUL_OPS expression                            #ExMul
                      | expression OPERATORS expression                          #ExAdd
                      | expression INC_OP                                        #ExInc
                      | IDENTIFIER COMPARATORS IDENTIFIER                        #ExCompareId
                      | IDENTIFIER COMPARATORS expression                        #ExCompareEx
                      | IDENTIFIER                                               #ExId
                      | INT                                                      #ExInt
                      | STRING                                                   #ExString
                      | BOOLEAN                                                  #ExBool
                      | DOUBLE                                                   #ExDouble
                      | 'arr' IDENTIFIER ASSIGNER OBJECT_INITIALIZER ('arr{' INT '}'|IDENTIFIER) #ExArray
                      ;

conditional: ('condition(' expression '){'statement*'}')+ ('notMet{' statement* '}')?;

function: DECLARATION? IDENTIFIER '(' (DECLARATION IDENTIFIER)* '){' statement* ('result ' expression)? '}';

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