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
	:	extern_wrapper 
	|	static_section_wrapper
	|	type_start_wrapper 
	| 	interface_declaration_wrapper 
	|	typedef_struct_declaration 
	;
	
/*------------------------------------------------------------------
 * IMPLEMENTATION RULES
 *------------------------------------------------------------------*/
 
 extern_wrapper
 	:	extern -> ^(EXTERN)
 	;
 
 extern	:	'extern'  '"C"'  L_FBR ~(R_FBR) R_FBR
 	;
implementation_wrapper
 	:	implementation -> ^(IMPLEMENTATION implementation);
 	
implementation
	:	'@implementation'  name  category? super_class?
		implementation_body+
		'@end'  semi?
	; 	

category:	L_BR  name  R_BR -> ^(CATEGORY name);	

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
	:	'@synthesize'  ID  semi
	;	
	
typedef	:	'typedef'  (typedef_declaration_wrapper | typedef_struct_declaration_wrapper) 
	;
		
static_section_wrapper
	:	static_section -> ^(STATIC static_section);		
	
static_section
	:	STATIC_PREFIX CONST_PREFIX? STRUCT_PREFIX? ENUM_PREFIX? static_section2;

static_section2
	:	inline_section 
	| 	implementation_method_wrapper2 
	| 	static_section3
	;
	
inline_section
	:	'inline'  field_type name  method_params2? (block_wrapper | SEMICOLON);	
	
static_section3
	:	field_type name indexed*  static_end;
	
	
static_end
	:	implementation_method_wrapper3
		| field_end;
		
field_end
	:	field_end_internal -> ^(FIELD field_end_internal);
	
field_end_internal
	:	value_set? semi;	
		
implementation_method_wrapper3
	:	implementation_method3 -> ^(METHOD implementation_method3);
	
implementation_method3
	:	method_header_body3  semi?
		attribute?
		block_wrapper?
	;
	
attribute
	:	'__attribute__'  L_BR  L_BR  'constructor'  R_BR  R_BR  SEMICOLON;	
	
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
//	:	field_type name method_params2 
	:	method_params2 
		block_wrapper 
	;	

implementation_method_wrapper
	:	implementation_method -> ^(METHOD implementation_method);

implementation_method_wrapper2
	:	implementation_method2 -> ^(METHOD implementation_method2);

implementation_method
	:	method_header_body semi?
		block_wrapper 
	;
	
block_wrapper
	:	block -> ^(BLOCK block);	
	
block	:		
		L_FBR
			(block_internal_full | block)*		
		R_FBR
	;

block_case
	:		
		L_FBR
			(block_internal_full | block)*		
			default_stmt?
		R_FBR
	;
	
block_internal_full
	:	block_internal
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
	|	return_stmt
	|	for_stmt
	|	while_stmt_wrapper
	|	single_operators
	|	xcrement
	|	in_brackets_block
	|	struct_variable
	|	enum_variable
	|	typeof_started
	|	const_expr  SEMICOLON
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
	:	L_BR  (known_types  | expression) R_BR  in_brackets_block_ends;
	
in_brackets_block_ends
	:	in_brackets_block_end1
	|	in_brackets_block_end2
	;
	
in_brackets_block_end1
	:	id_part_end?  (L_PLUS_PLUS|L_MINUS_MINUS)? (set_internal_end_wrapper)? SEMICOLON
	;
			
in_brackets_block_end2
	:	id_part simple_start_v_end;
	
		
const_expression
	:	CONST_PREFIX id_start_variable;		
		
xcrement:	(L_PLUS_PLUS|L_MINUS_MINUS) object_name  SEMICOLON
	;
	
throw_stmt
	:	'@throw'  SEMICOLON	
	;
	
try_stmt:	'@try'  block  catch_stmt* ('@finally'  block)?
	;
	
catch_stmt
	:	'@catch'  L_BR  ID  ASTERISK* ID  R_BR  block 
	;	

switch_stmt_wrapper
	:	switch_stmt -> ^(SWITCH switch_stmt);

switch_stmt
	:	'switch'  L_BR  switch_expr R_BR  
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
	:	'case'  case_expr  COLON 
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
	:	block_case single_operators?
	;

default_stmt_wrapper
	:	default_stmt -> ^(DEFAULT_STMT default_stmt);

default_stmt
	:	'default'  COLON 
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
	:	BREAK_WORD  SEMICOLON;	
	
do_stmt	:	'do'  if_stmt_block  'while'  L_BR  expression R_BR;

while_stmt_wrapper
	:	while_stmt -> ^(WHILE_STMT while_stmt)
	;

while_stmt
	:	'while'  L_BR  while_expr R_BR  if_stmt_block_wrapper; 	
	
while_expr
	:	 expression -> ^(WHILE_EXPR expression);	
	
for_stmt:	'for'  L_BR  for_stmt_iterator? for_stmt_internal R_BR  if_stmt_block
	;
	
for_stmt_iterator
	:	ID  (ASTERISK* ID)?
	;	
	
for_stmt_internal
	:	for_stmt_int1
	|	for_stmt_int2
	;	
	
for_stmt_int1
	:	'in'  expr  -> ^(FOR_IN_STMT  expr);	
	
for_stmt_int2
	:	(L_EQ  expression)? semi expression? semi (id_start_variable_light)?
	;

//return_stmt_wrapper
//	:	return_stmt -> ^(RETURN_STMT return_stmt)
//	;
	
return_stmt
	:	'return' expression? SEMICOLON -> ^(RETURN_STMT expression? SEMICOLON);	

if_stmt_wrapper
	:	if_stmt -> ^(IF_STMT if_stmt);

if_stmt	:	'if'  L_BR  if_expr R_BR  if_stmt_block_wrapper
	;	
	
if_expr	:	expression -> ^(IF_EXPR expression);	
	
else_stmt
	:	'else'  if_stmt_block;
	
variable_set
//	:	variable_set_internal  (COMMA  variable_set_internal)* isv_end;
	:	variable_set_internal (COMMA  variable_set_internal)* semi?;

if_stmt_block_wrapper
	:	if_stmt_block -> ^(IF_BLOCK if_stmt_block);

if_stmt_block
	:	block_wrapper
	| 	block_internal
	;	
		
	
variable_set_light
	:	variable_set_internal (COMMA  variable_set_internal)*;

variable_set_internal
	:	ASTERISK* id_part set_internal_end_wrapper?
	;

isv_end	:	SEMICOLON 
//	| 	COMMA  id_start_variable;
	| 	COMMA  id_part simple_start_v_end;


// эта обертка нужна, чтобы отслеживать: был ли объект инициализирован?
set_internal_end_wrapper
	:	set_internal_end -> ^(SET_INTERNAL set_internal_end);

set_internal_end
	:	op5  (in_q_brackets | classical_expr_wrp);
		
variable_set_end
	:       op5  expression
	|	L_PLUS_PLUS  set_internal_end_wrapper?
	|	L_MINUS_MINUS  set_internal_end_wrapper?	
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
	:	ASTERISK* (known_types ASTERISK*)? id_part simple_start_v_end
	;

simple_start_v_end
	:	simple_start_v1
	|	simple_start_v2
	;

simple_start_v1
	:	COLON
	;
	
simple_start_v2
	:	generic? id_part_end?  (id_start_variable_end | SEMICOLON)
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

id_part	:	 name_internal (L_KBR  classical_expr_wrp? R_KBR)*
	;
	
id_start_variable_end
	:	(variable_set_end (variable_set | isv_end)) 
	| 	variable_set
	|	L_BR  (expression (COMMA  expression)*)? R_BR  isv_end;	

id_start_variable_light
	:	(L_PLUS_PLUS|L_MINUS_MINUS)? ASTERISK* object_name  ( (variable_set_end variable_set_light?) | variable_set_light)?;
	
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
	:	object_wrapper method_name ( method_call_message_list_wrapper)?;

method_call_wrapper3
	:	method_call3 -> ^(METHOD_CALL method_call3);	
	
method_call3
	:	object_wrapper3 L_BR  (method_message3 (COMMA  method_message3)*)? R_BR;

method_message3
	:	expression -> ^(MESSAGE expression);
//	:	object -> ^(MESSAGE object);

object_wrapper3
	:	ID -> ^(OBJECT ID);
		
object_wrapper
	:	object -> ^(OBJECT object);	
	
object	:	type_convertion2 expression
	|	expr2 
	;
	
type_convertion2
	:	type_convertion_start (type_convertion_end | (expr  expression_end R_BR));	
	
type_convertion_start
	:	L_BR  ID generic?  -> ^(TYPE_CONVERTION_MAY_BE ID generic?);
	
type_convertion_end
	:	ASTERISK* R_BR  -> ^(TYPE_CONVERTION_TRUE);
	
type_convertion
	:	L_BR  'unsigned'? type_internal  ASTERISK* R_BR  -> ^(TYPE_CONVERTION type_internal);

method_name
	:	ID -> ^(METHOD_NAME ID);

method_call_message_list_wrapper
	:	method_call_message_list -> ^(MSG_LIST method_call_message_list);

method_call_message_list
	:	method_call_message_first_wrapper method_call_message_wrapper*;	

method_call_message_first_wrapper
	:	method_call_message_first -> ^(METHOD_MSG method_call_message_first);

method_call_message_first
	:	COLON  message;
	
method_call_message_wrapper
	:	method_call_message -> ^(METHOD_MSG method_call_message);
	
method_call_message
	:	prefix  COLON  message;
	
message	:	msg_expr (COMMA  msg_expr)* -> ^(MESSAGE msg_expr (COMMA  msg_expr)*)/
	;
		
msg_expr:	L_BR  (ID | const_expr) R_BR classical_expr_wrp? 
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
	:	expr_wrp  oper_wrp*
	;	

if3	:	'?'  classical_expr_wrp COLON  classical_expr_wrp
	;	
	
oper_wrp:	oper -> ^(OPER oper);	
	
oper	:	op_wrp  expr_wrp 
	|	if3
	;

expr_wrp:	expr -> ^(EXPR expr);

op_wrp	:	op -> ^(OP op);
	
op_wrp3	:	op3 -> ^(OP op3);

struct_init
	:	L_BR  STRUCT_PREFIX? ID  R_BR  L_FBR 
			struct_init_line (COMMA  struct_init_line)*
		R_FBR 
	;	
	
struct_init2
	:	L_FBR 
			struct_init_line (COMMA  struct_init_line)*
		R_FBR 
	;	

struct_init_line
	:	struct_init_var
//	|	struct_init_method
	|	struct_init_expression
	;	
	
struct_init_expression
	:	classical_expr;	
	
struct_init_method
	:	expr ;	
	
struct_init_var
	:	(DOT id_part)+  L_EQ  (in_q_brackets | expression) ;	

expression_end
	:	expression_asterix 
	| 	expression_other
	|	R_BR 
	;
	
expression_asterix
	:	ASTERISK+ expression_end2
	;

expression_other
	:	oper_wrp3 R_BR 
//	:	oper_wrp R_BR
	|	if3 R_BR 
	;
	
oper_wrp3
	:	oper3 -> ^(OPER oper3);	
	
oper3	:	op_wrp3 classical_expr_wrp;	
	
expression_end2
	:	R_BR expression -> ^(TYPE_CONVERTION expression)
//	|	expr_wrp oper_wrp* R_BR
	|	classical_expr_wrp R_BR
	;

op	:	ASTERISK | op3;

op3	:	'-' | '/' | '+' | '%' | '&' | '&&' | '|' | '||' | R_UBR | '>=' | L_UBR | '<=' | '==' | '!=' 
	| 	L_EQ | '+=' | '-=' | '/=' | '*=' | '&=' | '^' | '>>' | '<<'
	;

expr2	:	op2? (const_expr | a_started | id_started | square_brackets);
expr	:	op2? (const_expr | a_started | id_started | special_op | special_started | (in_brackets square_brackets? id_part_end?));

a_started
	:	a_selector_wrapper
	|	a_encode
	;
	
special_op
	:	sizeof1
	|	sizeof2
	|	typeof id_started
	;
	
sizeof1	:	'sizeof' L_BR  ASTERISK* ID  R_BR;

sizeof2	:	'sizeof'  ASTERISK* ID ;

typeof	:	'__typeof__'  L_BR  ID  R_BR ;
	
a_selector_wrapper
	:	a_selector -> ^(SELECTOR a_selector);	
	
a_selector:	'@selector' L_BR a_selector_value_wrapper R_BR;	

a_selector_value_wrapper
	:	a_selector_value -> ^(SELECTOR_VALUE a_selector_value);
	
a_selector_value
	:	 ID  (COLON  (ID  COLON)*)?;


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
	:	object_name  ((L_PLUS_PLUS|L_MINUS_MINUS) | method_brackets index_brackets*)?;

method_brackets
	:	L_BR  (expression  (COMMA  classical_expr_wrp)*)? R_BR;

in_brackets
	:	round_brackets
	| 	square_brackets
	|	type_convertion expression
	|	func_pointer2
	;
	
func_pointer1
	:	type_internal  ASTERISK? L_BR ASTERISK? type_internal  R_BR  func_pointer_params  variable_set_end? SEMICOLON
	;
	
func_pointer2
	:	L_BR  type_internal L_BR  ASTERISK  R_BR  func_pointer_params  R_BR
	;	
	
func_pointer_params
	:	L_BR  ID  ASTERISK* (COMMA  ID  ASTERISK*)* R_BR;
	
in_brackets_end1
	:	L_BR  expression  R_BR
	|	method_start index_brackets?
	|	(L_PLUS_PLUS | L_MINUS_MINUS) method_start
	|	const_expr
	//|	 simple_method_call
	;	

in_brackets_end2
	:	L_BR  expression  R_BR
	|	const_expr
	//|	 simple_method_call
	;	
	
method_start
	:	ID method_brackets?;
	
in_q_brackets
	:	L_FBR  q_brackets_source R_FBR
	;
	
q_brackets_source
	:	q_source
	|	q_br_source
	;	
	
q_br_source
	:	in_q_brackets  (COMMA  in_q_brackets)* COMMA?
	;
	
q_source:	(expression  (COMMA  expression)*)?
	;	
	
simple_method_call
	:	ID method_brackets?;	
	
round_brackets
	:	L_BR  round_brackets_end
	;
	
round_brackets_end
	:	type_in_brackets
	|	const_expr R_BR 
	|	expr  expression_end in_brackets_end2?
	;	
	
type_in_brackets
	:	CONST_PREFIX? ID generic? ASTERISK* R_BR  in_brackets_end1
	;
			
square_brackets
	:	
	L_KBR  method_call_wrapper2 R_KBR;	
	
index_brackets
	:	L_KBR  classical_expr_wrp R_KBR
	;

/*------------------------------------------------------------------
 * INTERFACE RULES
 *------------------------------------------------------------------*/

interface_declaration_wrapper
	:	interface_declaration -> ^(INTERFACE interface_declaration);
	
interface_declaration
	:	'@interface'  name  interface_category? (super_class)?
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
	;
	
simple_field_declaration
	:	field_type name  SEMICOLON
	;	
	
union_declaration
	:	'union'  L_FBR 
			simple_field_declaration+
		R_FBR  ID  SEMICOLON
	;	
		
super_class
	:	COLON  ID  -> ^(SUPER_CLASS ID);		

interface_category
	:	L_BR  ID  R_BR -> ^(CATEGORY L_BR  ID  R_BR);				
	
interface_methods
	:	(enum_declaration | interface_method)+;
	
interface_method
	:	method_header -> ^(METHOD method_header);	
	
method_header
	:	method_header_body semi?;

method_header_body
	:	method_modifier_wrapper  method_type  name  method_params? va_args_wrapper?;

va_args_wrapper
	:	va_args -> ^(VA_ARGS va_args);
	
va_args	:	COMMA  '...'  semi?;	

method_header_body2
	:	method_type name  method_params2?;

method_header_body3
	:	method_params2;

method_modifier_wrapper
	:	method_modifier -> ^(MODIFIER method_modifier);

method_modifier
	:	'+' | '-';	
	
method_type
	:	L_BR  STRUCT_PREFIX? type_internal  generic? ASTERISK* R_BR -> ^(TYPE type_internal)
	| 	L_BR  CONST_PREFIX? known_types? ID* generic? ASTERISK* R_BR -> ^(TYPE ID+)
	;			
		
type_internal
	:	type_internal1 (L_KBR  R_KBR)?
	;		
		
type_internal1
	:	VOID
	|	ID
	;	
	
generic:	L_UBR generic_internal R_UBR -> ^(GENERIC generic_internal);	

generic_internal
	:	 ID  ASTERISK* (COMMA  ID  ASTERISK*)*;

method_params2
	:	L_BR  method_param_wrapper2  (COMMA  method_param_wrapper2)* R_BR
	;

method_param_wrapper2
	:	method_param2 -> ^(PARAM method_param2);
	
method_param2
	:	CONST_PREFIX? ENUM_PREFIX? STRUCT_PREFIX? 'unsigned'? field_type name? indexed?;
	
indexed	:	L_KBR NUMBER? R_KBR;
	
method_params
	:	method_param+ -> ^(PARAM method_param)+;	
	
method_param
	:	prefix? COLON  method_type? name
	;	
	
prefix	:	ID -> ^(PREFIX ID);


/*------------------------------------------------------------------
 * TYPEDEF_STRUCT RULES
 *------------------------------------------------------------------*/
 
typedef_struct_declaration_wrapper
	:	typedef_struct_declaration -> ^(TYPEDEF_STRUCT typedef_struct_declaration)
	; 

typedef_struct_declaration
	: STRUCT_PREFIX name?
	L_FBR 
		typedef_struct_body+
	R_FBR  name? semi?
	;
	
typedef_struct_body
	:	typedef_struct_declaration_element_wrapper
	;
	
typedef_struct_declaration_element_wrapper
	: struct_field -> ^(STRUCT_FIELD struct_field);
	
struct_field
	:	field_type name  (COMMA  name)* SEMICOLON	
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
	:  ENUM_PREFIX L_FBR  typedef_declaration_element_wrapper  (COMMA  typedef_declaration_element_wrapper)* R_FBR  name? SEMICOLON;
	
typedef_declaration_element_wrapper
	:	typedef_declaration_element -> ^(TYPEDEF_ELEMENT typedef_declaration_element)
	;

typedef_declaration_element
	: ID  (L_EQ  (ID| NUMBER))?
	;

/*------------------------------------------------------------------
 * FIELD RULES
 *------------------------------------------------------------------*/

field_declaration_wrapper
	:	field_declaration -> ^(FIELD field_declaration);

field_declaration
	:	field_modifier_wrapper  field_type name field_declaration_end;
	
field_declaration_end
	:	 value_set? semi;
	
type_start_wrapper
	:	type_start -> ^(M_TYPE_START type_start);

type_start
	:	CONST_PREFIX? field_type name type_end;
	
type_end:	field_declaration4 -> ^(FIELD field_declaration4)
	|	method_declaration4 -> ^(STATIC_METHOD method_declaration4)
	;	
	
field_declaration4
	:	 value_set? SEMICOLON
	;
	
method_declaration4
	:	 method_params2 
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
	:	type_internal  generic? ASTERISK*;

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
	:	L_EQ  value -> ^(VALUE value);

value	:	ID | string_value | null_stmt | array | NUMBER | struct_init2;	

string_value
	:	STRING_LITERAL;
	
null_stmt	:	'nil' | 'Nil';

array	:	L_FBR  value  (COMMA  value)* R_FBR;

semi	:	SEMICOLON ;

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
 	:	'const' ;
 	
ENUM_PREFIX
	:	'enum' ;

STRUCT_PREFIX
	:	'struct' ;

STATIC_PREFIX
	:	'static' ;

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

WS : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+  { $channel = HIDDEN; } ;

SINGLE_OP
	:	'continue'  SEMICOLON
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