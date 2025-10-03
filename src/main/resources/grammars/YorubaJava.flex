package com.github.tundeadetunji.yorubajava;  // Use your group ID

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.github.tundeadetunji.yorubajava.YorubaJavaTypes.*;  // Generated PSI types

%%

%{
public YorubaJavaLexer() {
    this((java.io.Reader)null);
}
%}

%public
%class YorubaJavaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode  // Enables UTF-8 for Yoruba diacritics

// Lexer states and patterns
WHITE_SPACE=[ \n\t\r\f]+
LINE_COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/"\*[\s\S]*?\*"/"
IDENTIFIER=[a-zA-ZÀ-ỹ_][a-zA-Z0-9À-ỹ_]*  // Unicode for Yoruba (À-ỹ covers accents)
NUMBER=[0-9]+(\.[0-9]+)?  // Integers/floats
STRING_LITERAL=\"([^\\\"]|\\.)*\"  // Escaped strings

%%

{WHITE_SPACE}     { yybegin(YYINITIAL); return WHITE_SPACE; }
{LINE_COMMENT}    { yybegin(YYINITIAL); return LINE_COMMENT; }
{BLOCK_COMMENT}   { yybegin(YYINITIAL); return BLOCK_COMMENT; }

// Yoruba Keywords (exact matches; variants as alternatives)
// Renamed Yoruba Keywords (return new token types)
"kíláàsì"|"ìṣọ̀rí"|"isori"|"kilasi"    { return YORUBA_CLASS; }
"gbangba"                               { return YORUBA_PUBLIC; }
"àìmì"|"aimi"                           { return YORUBA_STATIC; }
"òfo"|"ofo"                             { return YORUBA_VOID; }
"àkọ́kọ́"|"akoko"                       { return YORUBA_MAIN; }
"okùn"|"okun"                           { return YORUBA_STRING_TYPE; }
"nọmba"|"nomba"                         { return YORUBA_INT_TYPE; }
"tí"|"ti"                               { return YORUBA_IF; }
"tí kò ṣe bẹ́ẹ̀"|"eko se bee"|"else"    { return YORUBA_ELSE; }
"tẹ"|"te"|"print"                       { return YORUBA_PRINT; }
"òtítọ́"|"true"                         { return YORUBA_BOOLEAN; }  // Note: Single return for boolean literals
"òdì"|"false"                           { return YORUBA_BOOLEAN; }  // Reuse for true/false
"null"                                  { return YORUBA_NULL; }

// Symbols/Operators
";"                                     { return SEMICOLON; }
"{"                                     { return LBRACE; }
"}"                                     { return RBRACE; }
"("                                     { return LPAREN; }
")"                                     { return RPAREN; }
"="                                     { return ASSIGN; }
"+"                                     { return PLUS; }
"-"                                     { return MINUS; }
"*"                                     { return MULT; }
"/"                                     { return DIV; }
"[]"                                    { return ARRAY_BRACKETS; }  // For String[]

// Other tokens
{IDENTIFIER}                            { return IDENTIFIER; }
{NUMBER}                                { return NUMBER; }
{STRING_LITERAL}                        { return STRING_LITERAL; }

.                                       { return BAD_CHARACTER; }