

grammar Maximus;

program: 'BEGIN' scope EOF;

scope: '{' statement* (RETURN expression)?'}';

statement:  conditional  |
            whileLoop |
            forLoop |
            declaration '$' |
            assignment '$' |
            arrayAssignment '$' |
            functionDeclaration |
            print '$'   |
            functionCall '$' |
            arrayDeclaration '$'
            ;


expression:             '(' expression ')'                                       #ExParentheses
                      | left=expression MUL_OPS right=expression                 #exMul
                      | left=expression OPERATORS right=expression               #exAdd
                      | left=IDENTIFIER COMPARATORS right=IDENTIFIER             #exCompareId
                      | left=IDENTIFIER COMPARATORS right=expression             #exCompareEx
                      | INT                                                      #ExInt
                      | STRING                                                   #ExString
                      | BOOLEAN                                                  #ExBool
                      | DOUBLE                                                   #ExDouble
                      | IDENTIFIER                                               #exVariable
                      | left=expression LOGICALS right=expression                #multiCompare
                      | IDENTIFIER '[' INT ']'                                   #arrayGet
                      | scan                                                     #exScan
                      | functionCall                                             #exFunctionCall
                      ;

scan: 'ask()';

declaration: DECLARATION IDENTIFIER (ASSIGNER expression)?;

assignment:IDENTIFIER ASSIGNER expression;

arrayDeclaration: ARRAY_TYPE mainId=IDENTIFIER  '[' INT ','DECLARATION']';

arrayAssignment: IDENTIFIER '[' INT ']' ASSIGNER expression;

whileLoop:'doOn(' expression ')' scope;

forLoop: 'loop[' INT ']times' scope;

conditional: condition+;

condition: 'condition(' expression ')' scope;

functionDeclaration: mainDec=DECLARATION? mainId=IDENTIFIER scope;

functionCall: mainId=IDENTIFIER '('(parameter)? | (parameter ',')+ parameter')';

parameter: DECLARATION IDENTIFIER;

print: 'show(' expression ')';


RETURN:  'result';
OPERATORS:  'add' | 'minus' ;
MUL_OPS: 'times' | 'div' ;
ASSIGNER: 'is';
COMPARATORS: 'equals' | 'not_equals' | 'bigger' | 'smaller' | 'bigger_or_equals' | 'smaller_or_equals';
LOGICALS: 'and' | 'or';
DECLARATION: INT_TYPE | STRING_TYPE | BOOLEAN_TYPE | DOUBLE_TYPE;
INT_TYPE: 'num';
STRING_TYPE: 'charCollection';
BOOLEAN_TYPE: 'booly';
DOUBLE_TYPE: 'numnum';
ARRAY_TYPE: 'arr';
INT: '0' |'-'? [1-9][0-9]*;
STRING: '"' ~('\n'|'\r')* '"';
BOOLEAN: 'valid' | 'invalid';
DOUBLE:  '-'? [1-9][0-9]* '.' [0-9]*;
IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;
WS: [\r\n\t ]+ -> skip;
COMMENT: '!!'.*? [\n\r]+ -> skip;