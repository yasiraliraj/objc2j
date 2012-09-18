grammar Preprocessor;

options {
  output = AST;
  k = 4;
}

tokens {
	T_DEFINE;
	T_REPLACE;
	T_ID;
	T_IN_BRACKETS;
	T_PARAM;
	T_NAME;
	T_BACKSLASH;
	T_IMPORT;
	T_PATH;
	T_BLOCK;
	T_IF_DEFINE;
	T_IF_NOT_DEFINE;
	T_IF_SIMPLE;
	T_IF_MAIN;
	T_IF_ELSE;
	T_EXPRESSION;
	T_EX_AND;
	T_EX_OR;
	T_EX_SNGL;
	T_INCLUDE;
}

@header {
package ru.andremoniy.objctojavacnv.antlr.output;
}
@lexer::header {
package ru.andremoniy.objctojavacnv.antlr.output;
}

code	:	code_fragment+
		EOF;


smth_else
	:	~(DEFINE | WS | COMMENT | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF)+ 
	;
code_fragment
	:	WS
	|	define_directive
	|	import_declaration
	|	if_simple_check_wrapper
	|	if_define_block_wrapper
	|	if_not_define_block_wrapper
	|	smth_else
	;
	
ret	:	(WS | '\r' | '\n')+;	

if_not_define_block_wrapper
	:	if_not_define_block -> ^(T_IF_NOT_DEFINE if_not_define_block);
	
if_not_define_block
	:	(ifndef1 | ifndef2) ret
		main_code_block
		(ELSE ret 
		else_code_block)? 
		ENDIF
	;

ifndef1	:	IFNDEF WS+ name;

ifndef2	:	IF WS+ '!' WS* 'defined' '(' WS* name WS * ')';

if_simple_check_wrapper
	:	if_simple_check -> ^(T_IF_SIMPLE if_simple_check);
	
if_simple_check
	:	IF WS+ expression_wrapper ret
		main_code_block
		(ELIF WS+ expression_wrapper ret
		else_code_block)*
		(ELSE ret 
		else_code_block)? 
		ENDIF
	;
	
expression_wrapper
	:	expression -> ^(T_EXPRESSION expression);	
	
if_define_block_wrapper
	:	if_define_block -> ^(T_IF_DEFINE if_define_block);	
	
if_define_block
	:	(ifdef1 | ifdef2) ret
		main_code_block?
		(ELSE ret 
		else_code_block)? 
		ENDIF
	;

ifdef1	:	IF WS+ 'defined' '(' name ')';

ifdef2	:	IFDEF WS+ name;

main_code_block
	:	code_block -> ^(T_IF_MAIN code_block);

else_code_block
	:	code_block -> ^(T_IF_ELSE code_block);

code_block
	:	code_fragment+ -> ^(T_BLOCK code_fragment+);
//	:	 inside_block -> ^(T_BLOCK inside_block);
	
inside_block
	:	~(ELSE | ENDIF | ELIF)*;	

name	:	ID -> ^(T_NAME ID);

import_declaration
	:	(IMPORT | INCLUDE) WS* (import_internal | import_external);
	
import_internal
	:	import_internal_string -> ^(T_IMPORT import_internal_string);
	
import_internal_string
	:	'<' WS* filename ('/' filename)* WS* '>';
	
filename:	ID ('.' ID)?;	

import_external
	:	import_external_string -> ^(T_INCLUDE import_external_string);

import_external_string
	:	STRING_LITERAL2;
	
define_directive
	:	DEFINE WS+ id_wrapper WS* mln_end? replace_wrapper? -> ^(T_DEFINE DEFINE WS+ id_wrapper replace_wrapper?)
	;
	
mln_end	:	'\\' WS* ('\r' | '\n')+
	;	
	
id_wrapper
	:	name_wrapper in_brackets_wrapper? -> ^(T_ID name_wrapper in_brackets_wrapper?);	
	
name_wrapper
	:	ID -> ^(T_NAME ID);	
	
in_brackets_wrapper
	:	in_brackets -> ^(T_IN_BRACKETS in_brackets);	
	
in_brackets
	:	'(' WS* param_wrapper (WS* ',' WS* param_wrapper)* WS* ')'	
	;
	
param_wrapper
	:	param_common
	|	many_points
	;	
	
many_points
	:	'...'
	;	
	
param_common
	:	ID -> ^(T_PARAM ID)
	;
		
replace_wrapper
	:	replace -> ^(T_REPLACE replace);	
	
replace	:	replace_internal (backslash ('\r' | '\n')+ replace_internal)*
	;
	
backslash
	:	'\\' -> ^(T_BACKSLASH)
	;	
	
replace_internal
	:	('\'#\'' | ~('\\' | '\r' | '\n' | SINGLE_COMMENT)+);	
	
expression
	:	ex_and_wrp (WS+ '&&' WS+ ex_and_wrp)*;
	
ex_and_wrp
	:	ex_and -> ^(T_EX_AND ex_and);	
	
ex_and	:	('!' WS*)? ex_and_not;

ex_and_not
	:	math_expr_wrp
	|	('defined' WS*)? '(' WS* expression_wrapper (WS+ '||' WS+ expression_wrapper)* ')'
	;
	
math_expr_wrp
	:	math_expr;	
		
math_expr
	:	single_expr (WS* op WS* single_expr)*
	;
	
op	:	'==' | '>=' | '<=' | '>' | '<' | '*' | '+' | '-' 
	;	

	
single_expr
	:	(('+' | '-')WS*)? single_expr2;

single_expr2
	:	name
	|	const_expr
	//|	'(' WS* math_expr_wrp WS* ')'	
	;

	
const_expr	:	NUMBER 'L'?;	
	
IFNDEF	:	'#ifndef';	

IF	:	'#if';

ELIF	:	'#elif';

IFDEF	:	'#ifdef';

ELSE	:	'#else';

ENDIF	:	'#endif';
	
DEFINE	:	'#define';

INCLUDE	:	'#include';		

IMPORT	:	'#import';

ID	:	LETTER (DIGIT|LETTER)*;

COMMENT
    :    //{ skip(); setText("\n"); }
    '/*' ( options {greedy=false;} : . )* '*/' { skip(); }
    ;
    
SINGLE_COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n';    

WS  	:   	' '
        |	'\t'
        ;
        
NUMBER  : DIGIT (DIGIT|'.')* ;

STRING_LITERAL2
	:	'"' ~('\r' | '\n' | '"')* '"';

STRING_LITERAL : '@' STRING_LITERAL2;

SPECIAL_CHARS:	'!'|'%'|'?'|'|'|'&'|'.'|'*'|';'|'['|']'|'{'|'}'|'@'|':'|'+'|'-'|'/'|'#'|'<'|'>'|'=';

fragment DIGIT  : '0'..'9' ;
fragment LETTER	: ('a'..'z' | 'A'..'Z' | '_'); 


