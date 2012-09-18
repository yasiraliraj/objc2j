grammar Objcm;

options {
  output = AST;
  k = 4;
}

tokens {
	MODIFIER;
	TYPE;
	NAME;
	VALUE;
	FIELD;
	INTERFACE;
	CATEGORY;
	METHOD;
	PARAM;
	IMPLEMENTATION;
	OBJECT;
	METHOD_NAME;
	MESSAGE;
	BLOCK;
	METHOD_CALL;
	BR_STMT;
	TYPE_CONVERTION;
	PREFIX;
	MSG_LIST;
	GENERIC;
	TYPEDEF_ELEMENT;
	TYPEDEF;
	TYPEDEF_STRUCT;
	STRUCT_FIELD;
	STATIC;
	STATIC_METHOD;
	TYPE_CONVERTION_MAY_BE;
	TYPE_CONVERTION_TRUE;
	OPERATOR;
	VA_ARGS;
	ENUM;
	SUPER_CLASS;
	EXTERN;
	M_IMPORT;
	M_TYPE_START;
	SWITCH;
	SWITCH_EXPRESSION;
	SWITCH_BODY;	
	CASE_STMT;
	CASE_EXPR;
	CASE_BODY;
	DEFAULT_STMT;
	DEFAULT_BODY;
	IF_STMT;
	IF_EXPR;
	IF_BLOCK;
	SELECTOR;
	SELECTOR_VALUE;
	OP;
	OPER;
	EXPR;
	CLASSICAL_EXPR;
	WHILE_STMT;
	WHILE_EXPR;
	NOT;
	BREAK;
	RETURN_STMT;
	FIELD_ACCESS;
	FIELD_TYPE_STARTED;
	STATIC_START;
	SET_INTERNAL;
	FOR_IN_STMT;
	METHOD_MSG;
}

@header {
package ru.andremoniy.objctojavacnv.antlr.output;
}
@lexer::header {
package ru.andremoniy.objctojavacnv.antlr.output;
}


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
code	:	
		code_internal+
//		EOF
	;
	
code_internal
	:	operator_wrapper
	| 	implementation_wrapper
	;

operator_wrapper
	:	operator -> ^(OPERATOR operator);
 
operator
	:	extern_wrapper WS*
	|	static_section_wrapper
	|	type_start_wrapper WS*
	| 	interface_declaration_wrapper WS*
	|	typedef_struct_declaration WS*
	;
	
/*------------------------------------------------------------------
 * IMPLEMENTATION RULES
 *------------------------------------------------------------------*/
 
 extern_wrapper
 	:	extern -> ^(EXTERN)
 	;
 
 extern	:	'extern' WS+ '"C"' WS+ L_FBR ~(R_FBR) R_FBR
 	;
implementation_wrapper
 	:	implementation -> ^(IMPLEMENTATION implementation);
 	
implementation
	:	'@implementation' WS+ name WS* (category WS*)? (super_class WS*)?
		implementation_body+
		'@end' WS* semi?
	; 	

category:	L_BR WS* name WS* R_BR -> ^(CATEGORY name);	

implementation_body
	:	directives
	| 	typedef
	| 	static_section_wrapper
	| 	implementation_method_wrapper
//	|	classic_method_declaration_wrapper
	|	field_type_started_wrapper
	| 	field_declaration_wrapper
	|	typedef_struct_declaration_wrapper
	;

directives
	:	synthesize
	;	
	
synthesize
	:	'@synthesize' WS+ ID WS* semi
	;	
	
typedef	:	'typedef' WS+ (typedef_declaration_wrapper | typedef_struct_declaration_wrapper) WS*
	;
		
static_section_wrapper
	:	static_section -> ^(STATIC static_section);		
	
static_section
	:	STATIC_PREFIX CONST_PREFIX? STRUCT_PREFIX? ENUM_PREFIX? static_section2;

static_section2
	:	inline_section WS*
	| 	implementation_method_wrapper2 WS*
	| 	static_section3
	;
	
inline_section
	:	'inline' WS+ field_type name WS* (method_params2 WS*)? (block_wrapper | SEMICOLON);	
	
static_section3
	:	field_type name indexed* WS* static_end;
	
	
static_end
	:	implementation_method_wrapper3
		| field_end;
		
field_end
	:	field_end_internal -> ^(FIELD field_end_internal);
	
field_end_internal
	:	(value_set WS*)? semi;	
		
implementation_method_wrapper3
	:	implementation_method3 -> ^(METHOD implementation_method3);
	
implementation_method3
	:	method_header_body3 WS* semi?
		(attribute WS*)?
		(block_wrapper WS*)?
	;
	
attribute
	:	'__attribute__' WS* L_BR WS* L_BR WS* 'constructor' WS* R_BR WS* R_BR WS* SEMICOLON;	
	
implementation_method2
	:	 semi?
		block_wrapper
	;
	
field_type_started_wrapper
	:	field_type_started -> ^(FIELD_TYPE_STARTED field_type_started);	
	
field_type_started
	:	field_type name (classic_method_declaration_wrapper | field_declaration_end_wrapper);
	
field_declaration_end_wrapper
	:	field_declaration_end -> ^(FIELD field_declaration_end);
	
classic_method_declaration_wrapper
	:	classic_method_declaration -> ^(STATIC_METHOD classic_method_declaration);	
	
classic_method_declaration
//	:	field_type name method_params2 WS*
	:	method_params2 WS*
		block_wrapper WS*
	;	

implementation_method_wrapper
	:	implementation_method -> ^(METHOD implementation_method);

implementation_method_wrapper2
	:	implementation_method2 -> ^(METHOD implementation_method2);

implementation_method
	:	method_header_body semi?
		block_wrapper WS*
	;
	
block_wrapper
	:	block -> ^(BLOCK block);	
	
block	:		
		L_FBR
			(block_internal_full | block)+		
		R_FBR
	;

block_case
	:		
		L_FBR
			(block_internal_full | block)+		
			default_stmt?
		R_FBR
	;
	
block_internal_full
	:	WS
	|	block_internal
	;

block_internal
	:	try_stmt
	|	throw_stmt
	|	static_start_wrapper
	|	do_stmt
	|	const_expression
	|	id_start_variable
	|	method_call_wrapper SEMICOLON
	|	if_stmt_wrapper
	|	else_stmt
	|	switch_stmt_wrapper
	|	return_stmt_wrapper
	|	for_stmt
	|	while_stmt_wrapper
	|	single_operators
	|	xcrement
	|	in_brackets_block
	|	struct_variable
	|	enum_variable
	|	typeof_started
	|	const_expr WS* SEMICOLON
	|	SEMICOLON	
	;
	
typeof_started
	:	typeof id_start_variable
	;	
	
struct_variable
	:	STRUCT_PREFIX id_start_variable;

enum_variable
	:	ENUM_PREFIX id_start_variable;
	
in_brackets_block
	:	L_BR WS* (known_types WS* | expression) R_BR WS* in_brackets_block_ends;
	
in_brackets_block_ends
	:	in_brackets_block_end1
	|	in_brackets_block_end2
	;
	
in_brackets_block_end1
	:	id_part_end? WS* ((L_PLUS_PLUS|L_MINUS_MINUS) WS*)? (set_internal_end_wrapper)? SEMICOLON
	;
			
in_brackets_block_end2
	:	id_part simple_start_v_end;
	
		
const_expression
	:	CONST_PREFIX id_start_variable;		
		
xcrement:	(L_PLUS_PLUS|L_MINUS_MINUS) object_name WS* SEMICOLON
	;
	
throw_stmt
	:	'@throw' WS* SEMICOLON	
	;
	
try_stmt:	'@try' WS* block WS* catch_stmt* ('@finally' WS* block)?
	;
	
catch_stmt
	:	'@catch' WS* L_BR WS* ID WS* (ASTERISK+ WS*)? ID WS* R_BR WS* block WS*
	;	

switch_stmt_wrapper
	:	switch_stmt -> ^(SWITCH switch_stmt);

switch_stmt
	:	'switch' WS* L_BR WS* switch_expr R_BR WS* 
		switch_body_wrapper
	;	
	
switch_body_wrapper
	:	L_FBR switch_body R_FBR -> ^(SWITCH_BODY switch_body);	
	
switch_body
	:	block_internal_full*
		switch_internal*
	;	

switch_expr
	:	expression -> ^(SWITCH_EXPRESSION expression);

switch_internal
	:	case_stmt_wrapper
	| 	default_stmt_wrapper;

case_stmt_wrapper
	:	case_stmt -> ^(CASE_STMT case_stmt);

case_stmt
	:	'case' WS+ case_expr WS* COLON WS*
		case_body_wrapper?
	;	
	
case_body_wrapper
	:	case_body -> ^(CASE_BODY case_body);	
	
case_body
	:	block_break 
	| 	block_internal_full+
	 ;
		
case_expr
	:	expr -> ^(CASE_EXPR expr);	
	
block_break
	:	block_case WS* (single_operators WS*)?
	;

default_stmt_wrapper
	:	default_stmt -> ^(DEFAULT_STMT default_stmt);

default_stmt
	:	'default' WS* COLON WS*
		default_body_wrapper?
	;	

default_body_wrapper
	:	default_body -> ^(DEFAULT_BODY default_body)
	;
	
default_body
	:	block_break
	| 	block_internal_full+
	;		
	
single_operators
	:	SINGLE_OP 
	| 	break_wrapper
	;
	
break_wrapper
	:	break_stmt -> ^(BREAK break_stmt);
	
break_stmt
	:	BREAK_WORD WS* SEMICOLON;	
	
do_stmt	:	'do' WS* if_stmt_block WS* 'while' WS* L_BR WS* expression R_BR;

while_stmt_wrapper
	:	while_stmt -> ^(WHILE_STMT while_stmt)
	;

while_stmt
	:	'while' WS* L_BR WS* while_expr R_BR WS* if_stmt_block_wrapper; 	
	
while_expr
	:	 expression -> ^(WHILE_EXPR expression);	
	
for_stmt:	'for' WS* L_BR WS* for_stmt_iterator? for_stmt_internal R_BR WS* if_stmt_block
	;
	
for_stmt_iterator
	:	ID WS* ((ASTERISK+ WS*)? ID WS*)?
	;	
	
for_stmt_internal
	:	for_stmt_int1
	|	for_stmt_int2
	;	
	
for_stmt_int1
	:	'in' WS+ expr WS* -> ^(FOR_IN_STMT WS+ expr WS*);	
	
for_stmt_int2
	:	(L_EQ WS* expression)? semi expression? semi (id_start_variable_light)?
	;

return_stmt_wrapper
	:	return_stmt -> ^(RETURN_STMT return_stmt)
	;
	
return_stmt
	:	'return' WS* expression? SEMICOLON;	

if_stmt_wrapper
	:	if_stmt -> ^(IF_STMT if_stmt);

if_stmt	:	'if' WS* L_BR WS* if_expr R_BR WS* if_stmt_block_wrapper
	;	
	
if_expr	:	expression -> ^(IF_EXPR expression);	
	
else_stmt
	:	'else' WS* if_stmt_block;
	
variable_set
//	:	variable_set_internal WS* (COMMA WS* variable_set_internal WS*)* isv_end;
	:	variable_set_internal (COMMA WS* variable_set_internal)* semi?;

if_stmt_block_wrapper
	:	if_stmt_block -> ^(IF_BLOCK if_stmt_block);

if_stmt_block
	:	block_wrapper
	| 	block_internal
	;	
		
	
variable_set_light
	:	variable_set_internal (COMMA WS* variable_set_internal)*;

variable_set_internal
	:	(ASTERISK+ WS*)? id_part WS* (set_internal_end_wrapper WS*)?
	;

isv_end	:	SEMICOLON 
//	| 	COMMA WS* id_start_variable;
	| 	COMMA WS* id_part simple_start_v_end;


// эта обертка нужна, чтобы отслеживать: был ли объект инициализирован?
set_internal_end_wrapper
	:	set_internal_end -> ^(SET_INTERNAL set_internal_end);

set_internal_end
	:	op5 WS* (in_q_brackets | classical_expr_wrp);
		
variable_set_end
	:       op5 WS* expression
	|	L_PLUS_PLUS WS* set_internal_end_wrapper?
	|	L_MINUS_MINUS WS* set_internal_end_wrapper?	
	;
	
op5	:	'%=' | '==' | L_EQ | '+=' | '-=' | '&=' | '/=' | '|=' | '*=' | '^=' | '<<=' | '>>=' | '<=' | '>=' | L_UBR | R_UBR
	;	

static_start_wrapper
	:	static_start -> ^(STATIC_START static_start);
	
static_start
	:	STATIC_PREFIX CONST_PREFIX? id_start_variable
	;
		
id_start_variable
	:	simple_start_v
	|	func_pointer1
	;
	
simple_start_v
	:	(ASTERISK+ WS*)? (known_types (ASTERISK+ WS+ | WS+ (ASTERISK+ WS+)?))? id_part simple_start_v_end
	;

simple_start_v_end
	:	simple_start_v1
	|	simple_start_v2
	;

simple_start_v1
	:	COLON
	;
	
simple_start_v2
	:	generic? id_part_end? WS* (id_start_variable_end | SEMICOLON)
	;			
	
id_part_end
	:	id_part_end_internal+
	;
	
id_part_end_internal	
	:	(DOT|'->') id_part -> ^(FIELD_ACCESS id_part)
	;	
	
known_types
	:	'unsigned'
	|	VOID
	;	

id_part	:	 name_internal (L_KBR WS* classical_expr_wrp? R_KBR)*
	;
	
id_start_variable_end
	:	(variable_set_end (variable_set | isv_end)) 
	| 	variable_set
	|	L_BR WS* (expression (COMMA WS* expression)*)? R_BR WS* isv_end;	

id_start_variable_light
	:	(L_PLUS_PLUS|L_MINUS_MINUS)? (ASTERISK+ WS*)? object_name WS* ( (variable_set_end variable_set_light?) | variable_set_light)?;
	
object_name
	:	id_part id_part_end?
	;	
	
view_stmt
	: 	square_brackets
	|	block_wrapper
	;			

method_call_wrapper
	:	L_KBR method_call2 R_KBR -> ^(METHOD_CALL method_call2)
	;
				
method_call_wrapper2
	:	method_call2 -> ^(METHOD_CALL method_call2);	
	
method_call2
	:	object_wrapper method_name (WS* method_call_message_list_wrapper)?;

method_call_wrapper3
	:	method_call3 -> ^(METHOD_CALL method_call3);	
	
method_call3
	:	object_wrapper3 L_BR WS* (method_message3 (COMMA WS* method_message3)*)? R_BR;

method_message3
	:	expression -> ^(MESSAGE expression);
//	:	object -> ^(MESSAGE object);

object_wrapper3
	:	ID -> ^(OBJECT ID);
		
object_wrapper
	:	object -> ^(OBJECT object);	
	
object	:	type_convertion2 expression
	|	expr2 WS*
	;
	
type_convertion2
	:	type_convertion_start (type_convertion_end | (expr WS* expression_end R_BR));	
	
type_convertion_start
	:	L_BR WS* ID generic? WS* -> ^(TYPE_CONVERTION_MAY_BE ID generic?);
	
type_convertion_end
	:	(ASTERISK+ WS*)? R_BR WS* -> ^(TYPE_CONVERTION_TRUE);
	
type_convertion
	:	L_BR WS* ('unsigned' WS+)? type_internal WS* (ASTERISK+ WS*)? R_BR WS* -> ^(TYPE_CONVERTION type_internal);

method_name
	:	ID -> ^(METHOD_NAME ID);

method_call_message_list_wrapper
	:	method_call_message_list -> ^(MSG_LIST method_call_message_list);

method_call_message_list
	:	method_call_message_first_wrapper method_call_message_wrapper*;	

method_call_message_first_wrapper
	:	method_call_message_first -> ^(METHOD_MSG method_call_message_first);

method_call_message_first
	:	COLON WS* message;
	
method_call_message_wrapper
	:	method_call_message -> ^(METHOD_MSG method_call_message);
	
method_call_message
	:	prefix WS* COLON WS* message;
	
message	:	msg_expr (COMMA WS* msg_expr)* -> ^(MESSAGE msg_expr (COMMA WS* msg_expr)*)/
	;
		
msg_expr:	L_BR WS* (ID | const_expr) R_BR WS*
	|	classical_expr_wrp
	;	
	
/*------------------------------------------------------------------
 * COMMON EXPRESSION RULES
 *------------------------------------------------------------------*/

expression
	:	classical_expr_wrp
	|	struct_init
	;
	
classical_expr_wrp
	:	classical_expr -> ^(CLASSICAL_EXPR classical_expr);	
	
classical_expr
	:	expr_wrp WS* oper_wrp*
	;	

if3	:	'?' WS* classical_expr_wrp COLON WS* classical_expr_wrp
	;	
	
oper_wrp:	oper -> ^(OPER oper);	
	
oper	:	op_wrp WS* expr_wrp WS*
	|	if3
	;

expr_wrp:	expr -> ^(EXPR expr);

//expr_wrp3
//	:	expr3 -> ^(EXPR expr3);

op_wrp	:	op -> ^(OP op)
	//|	'?' WS* classical_expr ':' classical_expr
	;
	
struct_init
	:	L_BR WS* STRUCT_PREFIX? ID WS* R_BR WS* L_FBR WS*
			struct_init_line (COMMA WS* struct_init_line)*
		R_FBR WS*
	;	
	
struct_init2
	:	L_FBR WS*
			struct_init_line (COMMA WS* struct_init_line)*
		R_FBR WS*
	;	

struct_init_line
	:	struct_init_var
//	|	struct_init_method
	|	struct_init_expression
	|	WS
	;	
	
struct_init_expression
	:	classical_expr;	
	
struct_init_method
	:	expr WS*;	
	
struct_init_var
	:	(DOT id_part)+ WS* L_EQ WS* (in_q_brackets | expression) WS*;	

expression_end
	:	expression_asterix 
	| 	expression_other
	|	R_BR WS*
	;
	
expression_asterix
	:	ASTERISK+ WS* expression_end2
	;

expression_other
	:	op3 WS* classical_expr_wrp R_BR WS*
	|	if3 R_BR WS*
	;
	
expression_end2
	:	R_BR WS* expression -> ^(TYPE_CONVERTION expression)
	|	expr WS* (op WS* expr WS*)* R_BR WS*
	;

op	:	ASTERISK | op3;

op3	:	'-' | '/' | '+' | '%' | '&' | '&&' | '|' | '||' | R_UBR | '>=' | L_UBR | '<=' | '==' | '!=' 
	| 	L_EQ | '+=' | '-=' | '/=' | '*=' | '&=' | '^' | '>>' | '<<'
	;
	// TODO  expr "?" expr ":" expr - support !!!


//expr2	:	(op2 WS*)? (const_expr | a_started | id_started | square_brackets) index_brackets*;
//expr	:	(op2 WS*)? (const_expr | a_started | id_started | special_op | special_started | (in_brackets square_brackets?)) index_brackets*;
expr2	:	(op2 WS*)? (const_expr | a_started | id_started | square_brackets);
expr	:	(op2 WS*)? (const_expr | a_started | id_started | special_op | special_started | (in_brackets square_brackets? id_part_end?));

a_started
	:	a_selector_wrapper
	|	a_encode
	;
	
special_op
	:	sizeof1
	|	sizeof2
	|	typeof id_started
	;
	
sizeof1	:	'sizeof' L_BR WS* (ASTERISK+ WS*)? ID WS* R_BR;

sizeof2	:	'sizeof' WS* (ASTERISK+ WS*)? ID WS*;

typeof	:	'__typeof__' WS* L_BR WS* ID WS* R_BR WS*;
	
a_selector_wrapper
	:	a_selector -> ^(SELECTOR a_selector);	
	
a_selector:	'@selector' L_BR a_selector_value_wrapper R_BR;	

a_selector_value_wrapper
	:	a_selector_value -> ^(SELECTOR_VALUE a_selector_value);
	
a_selector_value
	:	WS* ID WS* (COLON WS* (ID WS* COLON WS*)*)?;	


a_encode:	'@encode' L_BR ~(R_BR)+ R_BR;

const_expr	
	: 	NUMBER | STRING_LITERAL | STRING_LITERAL2 | STRING_LITERAL3 | null_stmt;
	
string_literal3
	:	STRING_LITERAL3;	

op2	:	'+' | '-' | L_MINUS_MINUS | L_PLUS_PLUS | not | '~';

not	:	'!' -> ^(NOT '!');

op4	:	L_MINUS_MINUS | L_PLUS_PLUS;

special_started
	:	('&'|ASTERISK)+ type_convertion? special_started_end;
	
special_started_end
	:	round_brackets 
	| 	'&'? id_started;

id_started
	:	object_name WS* ((L_PLUS_PLUS|L_MINUS_MINUS) | method_brackets index_brackets*)?;

method_brackets
	:	L_BR WS* (expression WS* (COMMA WS* classical_expr_wrp)*)? R_BR;

in_brackets
	:	round_brackets
	| 	square_brackets
	|	type_convertion expression
	|	func_pointer2
	;
	
func_pointer1
	:	type_internal WS* (ASTERISK WS*)? L_BR WS* (ASTERISK WS*)? type_internal WS* R_BR WS* func_pointer_params WS* variable_set_end? SEMICOLON
	;
	
func_pointer2
	:	L_BR WS* type_internal L_BR WS* ASTERISK WS* R_BR WS* func_pointer_params WS* R_BR
	;	
	
func_pointer_params
	:	L_BR WS* ID WS* (ASTERISK WS*)* (COMMA WS* ID WS* (ASTERISK WS*)*)* R_BR;	
	
in_brackets_end1
	:	L_BR WS* expression WS* R_BR
	|	method_start index_brackets?
	|	(L_PLUS_PLUS | L_MINUS_MINUS) method_start
	|	const_expr
	//|	 simple_method_call
	;	

in_brackets_end2
	:	L_BR WS* expression WS* R_BR
	|	const_expr
	//|	 simple_method_call
	;	
	
method_start
	:	ID method_brackets?;
	
in_q_brackets
	:	L_FBR WS* q_brackets_source R_FBR
	;
	
q_brackets_source
	:	q_source
	|	q_br_source
	;	
	
q_br_source
	:	in_q_brackets WS* (COMMA WS* in_q_brackets WS*)* (COMMA WS*)?
	;
	
q_source:	(expression WS* (COMMA WS* expression WS*)*)?
	;	
	
simple_method_call
	:	ID method_brackets?;	
	
round_brackets
	:	L_BR WS* round_brackets_end
	;
	
round_brackets_end
	:	type_in_brackets
	|	const_expr R_BR WS*
	|	expr WS* expression_end in_brackets_end2?
	;	
	
type_in_brackets
	:	CONST_PREFIX? ID (generic WS*)? R_BR WS* in_brackets_end1
	;
			
square_brackets
	:	
	L_KBR WS* method_call_wrapper2 R_KBR;	
	
index_brackets
	:	L_KBR WS* classical_expr_wrp R_KBR
	;

/*------------------------------------------------------------------
 * INTERFACE RULES
 *------------------------------------------------------------------*/

interface_declaration_wrapper
	:	interface_declaration -> ^(INTERFACE interface_declaration);
	
interface_declaration
	:	'@interface' WS+ name WS+ (interface_category WS+)? (super_class)?
		(annotated_block | interface_methods)+
		
		'@end';
		
annotated_block
	:	L_FBR 
		annotated_block_internal*
		R_FBR
	;
		
annotated_block_internal
	:	block_annotation 
	| 	public_block_internal 
	;
		
block_annotation
	:	'@public'
	|	'@private'
	;			
		
public_block_internal
	:	simple_field_declaration
	|	union_declaration
	|	WS
	;		
	
simple_field_declaration
	:	field_type name WS* SEMICOLON
	;	
	
union_declaration
	:	'union' WS* L_FBR WS*
			(simple_field_declaration | WS)+
		R_FBR WS* ID WS* SEMICOLON
	;	
		
super_class
	:	COLON WS* ID WS* -> ^(SUPER_CLASS ID);		

interface_category
	:	L_BR WS* ID WS* R_BR -> ^(CATEGORY L_BR WS* ID WS* R_BR);				
	
interface_methods
	:	(enum_declaration | interface_method | WS)+;	
	
interface_method
	:	method_header -> ^(METHOD method_header);	
	
method_header
	:	method_header_body semi?;

method_header_body
	:	method_modifier_wrapper WS* method_type WS* name WS* method_params? va_args_wrapper?;

va_args_wrapper
	:	va_args -> ^(VA_ARGS va_args);
	
va_args	:	COMMA WS* '...' WS* semi?;	

method_header_body2
	:	method_type name WS* method_params2?;

method_header_body3
	:	method_params2;

method_modifier_wrapper
	:	method_modifier -> ^(MODIFIER method_modifier);

method_modifier
	:	'+' | '-';	
	
method_type
	:	L_BR WS* STRUCT_PREFIX? type_internal WS* (generic WS*)? (ASTERISK+ WS*)? R_BR -> ^(TYPE type_internal)
	| 	L_BR WS* CONST_PREFIX? (known_types WS*)? (ID WS*)* (generic WS*)? (ASTERISK+ WS*)? R_BR -> ^(TYPE ID+)
	;			
		
type_internal
	:	type_internal1 (WS* L_KBR WS* R_KBR)?
	;		
		
type_internal1
	:	VOID
	|	ID
	;	
	
generic:	L_UBR generic_internal R_UBR -> ^(GENERIC generic_internal);	

generic_internal
	:	WS* ID WS* (ASTERISK+ WS*)? (COMMA WS* ID WS* ASTERISK*)*;

method_params2
	:	L_BR WS* method_param_wrapper2 WS* (COMMA WS* method_param_wrapper2 WS* )* R_BR
	;

method_param_wrapper2
	:	method_param2 -> ^(PARAM method_param2);
	
method_param2
	:	CONST_PREFIX? ENUM_PREFIX? STRUCT_PREFIX? ('unsigned' WS+)? field_type name? indexed?;
	
indexed	:	L_KBR WS*	(NUMBER WS*)? R_KBR;
	
method_params
	:	method_param+ -> ^(PARAM method_param)+;	
	
method_param
	:	(prefix WS*)? COLON WS* (method_type WS*)? name WS*
	;	
	
prefix	:	ID -> ^(PREFIX ID);


/*------------------------------------------------------------------
 * TYPEDEF_STRUCT RULES
 *------------------------------------------------------------------*/
 
typedef_struct_declaration_wrapper
	:	typedef_struct_declaration -> ^(TYPEDEF_STRUCT typedef_struct_declaration)
	; 

typedef_struct_declaration
	: STRUCT_PREFIX (name WS*)?
	L_FBR 
		typedef_struct_body+
	R_FBR WS* (name WS*)? semi?
	;
	
typedef_struct_body
	:	typedef_struct_declaration_element_wrapper
	|	WS
	;	
	
typedef_struct_declaration_element_wrapper
	: struct_field -> ^(STRUCT_FIELD struct_field);
	
struct_field
	:	field_type name WS* (COMMA WS* name)* SEMICOLON	
	;

/*------------------------------------------------------------------
 * TYPEDEF RULES
 *------------------------------------------------------------------*/
 
typedef_declaration_wrapper
	:	typedef_declaration -> ^(TYPEDEF typedef_declaration)
	; 

enum_declaration
	:	typedef_declaration -> ^(ENUM typedef_declaration);	
	
typedef_declaration
	:  ENUM_PREFIX L_FBR WS* typedef_declaration_element_wrapper WS* (COMMA WS* typedef_declaration_element_wrapper WS*)* R_FBR WS* (name WS*)? SEMICOLON;
	
typedef_declaration_element_wrapper
	:	typedef_declaration_element -> ^(TYPEDEF_ELEMENT typedef_declaration_element)
	;

typedef_declaration_element
	: ID WS* (L_EQ WS* (ID| NUMBER))?
	;

/*------------------------------------------------------------------
 * FIELD RULES
 *------------------------------------------------------------------*/

field_declaration_wrapper
	:	field_declaration -> ^(FIELD field_declaration);

field_declaration
	:	field_modifier_wrapper WS* field_type name field_declaration_end;
	
field_declaration_end
	:	WS+ (value_set WS*)? semi;	
	
type_start_wrapper
	:	type_start -> ^(M_TYPE_START type_start);

type_start
	:	CONST_PREFIX? field_type name type_end;
	
type_end:	field_declaration4 -> ^(FIELD field_declaration4)
	|	method_declaration4 -> ^(STATIC_METHOD method_declaration4)
	;	
	
field_declaration4
	:	WS* (value_set WS*)? SEMICOLON
	;
	
method_declaration4
	:	WS* method_params2 WS*
		block_wrapper
	;	

field_modifier_wrapper
	:	field_modifier -> ^(MODIFIER field_modifier);

field_modifier	
	:	'extern'
	;

field_type
	:	 field_type_internal -> ^(TYPE field_type_internal);	
	
field_type_internal
	:	type_internal WS* (generic WS*)? (ASTERISK+ WS*)?;	

/*------------------------------------------------------------------
 * COMMON RULES
 *------------------------------------------------------------------*/
	
name
	:	name_internal -> ^(NAME name_internal)
	;	
	
name_internal
	:	ID 
	| 	'in'	
	;

value_set
	:	L_EQ WS* value -> ^(VALUE value);

value	:	ID | string_value | null_stmt | array | NUMBER | struct_init2;	

string_value
	:	STRING_LITERAL;
	
null_stmt	:	'nil' | 'Nil';

array	:	L_FBR WS* value WS* (COMMA WS* value WS*)* R_FBR;

semi	:	SEMICOLON WS*;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

L_FBR:	'{';
R_FBR:	'}';
L_BR :	'(';
R_BR :	')';
L_KBR:	'[';
R_KBR:	']';
SEMICOLON
	:	';';
COLON:	':';
L_UBR:	'<';
R_UBR:	'>';
DOT:	'.';
COMMA:	',';
L_EQ :	'=';
ASTERISK
	:	'*';
L_PLUS_PLUS
	:	'++';
L_MINUS_MINUS
	:	'--';

CONST_PREFIX
 	:	'const' WS+;
 	
ENUM_PREFIX
	:	'enum' WS+;

STRUCT_PREFIX
	:	'struct' WS+;

STATIC_PREFIX
	:	'static' WS+;

SINGLE_COMMENT
	:	'//' ~('\r' | '\n')* ('\r'? '\n')+ { skip(); };

MULTI_COMMENT options { greedy = false; }
 	: '/*' .* '*/' ('\r'? '\n')? { skip(); };

PREPROCESSOR_DECLARATION
	: 	'#' ~('\\' | '\r' | '\n')* ('\\' ('\r' | '\n')+ ~('\\' | '\r' | '\n')+)* ('\r' | '\n')+ { skip(); }; 	
	
NUMBER  : DIGIT+ ('u'|'U')?
	| DIGIT+ DOT DIGIT* ('f'|'F')?
	| DIGIT* DOT DIGIT+ ('f'|'F')?
	| ('0x'  (DIGIT|'A'..'F')*(DOT DIGIT+)?)?
	| DIGIT+ (DOT DIGIT+)? 'e' ('-'|'+')? DIGIT+;

WS : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ /*  { $channel = HIDDEN; } */;

SINGLE_OP
	:	'continue' WS* SEMICOLON
	;
	
BREAK_WORD
	:	'break';	
		
VOID	:	'void';
		
ID	:	LETTER (DIGIT|LETTER)*;

//CHAR_LITERAL
//	:	'\'' LETTER '\'';

STRING_LITERAL2
	:	'"' (WS | ESC | ~('\r' | '\n' | '"'))* '"';

STRING_LITERAL3
	:	'\'' (WS | ESC | ~('\r' | '\n' | '\''))* '\'';

STRING_LITERAL : '`'? '@' STRING_LITERAL2;

fragment DIGIT  : '0'..'9' ;
fragment LETTER	: ('a'..'z' | 'A'..'Z' | '_'); 
fragment ESC
	:	'\\' '"' { setText("\\\""); }
	;