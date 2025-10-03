package com.yourusername.yoruba.lexer;  // Adjust package

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.*;
import static com.yourusername.yoruba.psi.YorubaJavaTypes.*;  // Generated later

%%

%{
public _YorubaJavaLexer() {
    this((java.io.Reader)null);
}
%}

%public
%class _YorubaJavaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITE_SPACE=[\ \n\t\r]+
LINE_COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/"\*[\s\S]*?\*"/"
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_À-ỹ]*  // Supports Yoruba Unicode (À-ỹ range)
NUMBER=[0-9]+
STRING_LITERAL=\"([^\\\"]|\\.)*\"

%%

{WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }
{LINE_COMMENT}     { return LINE_COMMENT; }
{BLOCK_COMMENT}    { return BLOCK_COMMENT; }
"kíláàsì"|"ìṣọ̀rí"|"isori"|"kilasi"  { return CLASS; }
"gbangba"          { return PUBLIC; }
"àìmì"|"aimi"      { return STATIC; }
"òfo"|"ofo"        { return VOID; }
"àkọ́kọ́"|"akoko"  { return MAIN; }
"okùn"|"okun"      { return STRING_TYPE; }
"nọmba"|"nomba"    { return INT_TYPE; }
"tí"|"ti"          { return IF; }
"tí kò ṣe bẹ́ẹ̀"|"eko se bee"|"else" { return ELSE; }
"tẹ"|"te"|"print"  { return PRINT; }
"òtítọ́"|"true"     { return TRUE; }
"òdì"|"false"      { return FALSE; }
"null"             { return NULL; }
{IDENTIFIER}       { return IDENTIFIER; }
{NUMBER}           { return NUMBER; }
{STRING_LITERAL}   { return STRING_LITERAL; }
[+\-*/=(){}]       { return OPERATOR_OR_SYMBOL; }
";"                { return SEMICOLON; }
.                  { return BAD_CHARACTER; }