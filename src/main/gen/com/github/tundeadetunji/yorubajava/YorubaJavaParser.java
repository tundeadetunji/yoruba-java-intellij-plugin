// This is a generated file. Not intended for manual editing.
package com.github.tundeadetunji.yorubajava;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.tundeadetunji.yorubajava.YorubaJavaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YorubaJavaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return yorubaJavaFile(b, l + 1);
  }

  /* ********************************************************** */
  // '[]'
  public static boolean ARRAY_BRACKETS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_BRACKETS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_BRACKETS, "<array brackets>");
    r = consumeToken(b, "[]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '='
  public static boolean ASSIGN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN, "<assign>");
    r = consumeToken(b, "=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  public static boolean BAD_CHARACTER(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, BAD_CHARACTER, true);
    return true;
  }

  /* ********************************************************** */
  public static boolean BLOCK_COMMENT(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, BLOCK_COMMENT, true);
    return true;
  }

  /* ********************************************************** */
  // '/'
  public static boolean DIV(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIV")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIV, "<div>");
    r = consumeToken(b, "/");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  public static boolean IDENTIFIER(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, IDENTIFIER, true);
    return true;
  }

  /* ********************************************************** */
  // '{'
  public static boolean LBRACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LBRACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LBRACE, "<lbrace>");
    r = consumeToken(b, "{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  public static boolean LINE_COMMENT(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, LINE_COMMENT, true);
    return true;
  }

  /* ********************************************************** */
  // '('
  public static boolean LPAREN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LPAREN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LPAREN, "<lparen>");
    r = consumeToken(b, "(");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '-'
  public static boolean MINUS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MINUS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MINUS, "<minus>");
    r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*'
  public static boolean MULT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULT, "<mult>");
    r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  public static boolean NUMBER(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, NUMBER, true);
    return true;
  }

  /* ********************************************************** */
  // '+'
  public static boolean PLUS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PLUS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS, "<plus>");
    r = consumeToken(b, "+");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}'
  public static boolean RBRACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RBRACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RBRACE, "<rbrace>");
    r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean RPAREN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RPAREN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RPAREN, "<rparen>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean SEMICOLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEMICOLON")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMICOLON, "<semicolon>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  public static boolean STRING_LITERAL(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, STRING_LITERAL, true);
    return true;
  }

  /* ********************************************************** */
  public static boolean WHITE_SPACE(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, WHITE_SPACE, true);
    return true;
  }

  /* ********************************************************** */
  // 'òtítọ́' | 'true' | 'òdì' | 'false'
  public static boolean YORUBA_BOOLEAN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_BOOLEAN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_BOOLEAN, "<yoruba boolean>");
    r = consumeToken(b, "òtítọ́");
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "òdì");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'kíláàsì' | 'ìṣọ̀rí' | 'isori' | 'kilasi'
  public static boolean YORUBA_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_CLASS, "<yoruba class>");
    r = consumeToken(b, "kíláàsì");
    if (!r) r = consumeToken(b, "ìṣọ̀rí");
    if (!r) r = consumeToken(b, "isori");
    if (!r) r = consumeToken(b, "kilasi");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'tí kò ṣe bẹ́ẹ̀' | 'eko se bee' | 'else'
  public static boolean YORUBA_ELSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_ELSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_ELSE, "<yoruba else>");
    r = consumeToken(b, "tí kò ṣe bẹ́ẹ̀");
    if (!r) r = consumeToken(b, "eko se bee");
    if (!r) r = consumeToken(b, "else");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'tí' | 'ti'
  public static boolean YORUBA_IF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_IF")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_IF, "<yoruba if>");
    r = consumeToken(b, "tí");
    if (!r) r = consumeToken(b, "ti");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'nọmba' | 'nomba'
  public static boolean YORUBA_INT_TYPE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_INT_TYPE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_INT_TYPE, "<yoruba int type>");
    r = consumeToken(b, "nọmba");
    if (!r) r = consumeToken(b, "nomba");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'àkọ́kọ́' | 'akoko'
  public static boolean YORUBA_MAIN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_MAIN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_MAIN, "<yoruba main>");
    r = consumeToken(b, "àkọ́kọ́");
    if (!r) r = consumeToken(b, "akoko");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'null'
  public static boolean YORUBA_NULL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_NULL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_NULL, "<yoruba null>");
    r = consumeToken(b, "null");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'tẹ' | 'te' | 'print'
  public static boolean YORUBA_PRINT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_PRINT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_PRINT, "<yoruba print>");
    r = consumeToken(b, "tẹ");
    if (!r) r = consumeToken(b, "te");
    if (!r) r = consumeToken(b, "print");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'gbangba'
  public static boolean YORUBA_PUBLIC(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_PUBLIC")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_PUBLIC, "<yoruba public>");
    r = consumeToken(b, "gbangba");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'àìmì' | 'aimi'
  public static boolean YORUBA_STATIC(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_STATIC")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_STATIC, "<yoruba static>");
    r = consumeToken(b, "àìmì");
    if (!r) r = consumeToken(b, "aimi");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'okùn' | 'okun'
  public static boolean YORUBA_STRING_TYPE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_STRING_TYPE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_STRING_TYPE, "<yoruba string type>");
    r = consumeToken(b, "okùn");
    if (!r) r = consumeToken(b, "okun");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'òfo' | 'ofo'
  public static boolean YORUBA_VOID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YORUBA_VOID")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YORUBA_VOID, "<yoruba void>");
    r = consumeToken(b, "òfo");
    if (!r) r = consumeToken(b, "ofo");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' literal
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // YORUBA_CLASS IDENTIFIER '{' (fieldDeclaration)* (methodDeclaration)* '}'
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = YORUBA_CLASS(b, l + 1);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && classDeclaration_3(b, l + 1);
    r = r && classDeclaration_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (fieldDeclaration)*
  private static boolean classDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classDeclaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_3", c)) break;
    }
    return true;
  }

  // (fieldDeclaration)
  private static boolean classDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (methodDeclaration)*
  private static boolean classDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classDeclaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_4", c)) break;
    }
    return true;
  }

  // (methodDeclaration)
  private static boolean classDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal | IDENTIFIER | expression '+' expression | expression '-' expression | expression '*' expression | expression '/' expression | '(' expression ')'
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = literal(b, l + 1);
    if (!r) r = IDENTIFIER(b, l + 1);
    if (!r) r = expression_2(b, l + 1);
    if (!r) r = expression_3(b, l + 1);
    if (!r) r = expression_4(b, l + 1);
    if (!r) r = expression_5(b, l + 1);
    if (!r) r = expression_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression '+' expression
  private static boolean expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, "+");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression '-' expression
  private static boolean expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression '*' expression
  private static boolean expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, "*");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression '/' expression
  private static boolean expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, "/");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' expression ')'
  private static boolean expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // YORUBA_PRINT '(' STRING_LITERAL ')' ';' | assignment ';'
  public static boolean expressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expressionStatement_0(b, l + 1);
    if (!r) r = expressionStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // YORUBA_PRINT '(' STRING_LITERAL ')' ';'
  private static boolean expressionStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = YORUBA_PRINT(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && STRING_LITERAL(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment ';'
  private static boolean expressionStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (YORUBA_PUBLIC)? type IDENTIFIER '=' literal ';'
  public static boolean fieldDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECLARATION, "<field declaration>");
    r = fieldDeclaration_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && literal(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (YORUBA_PUBLIC)?
  private static boolean fieldDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldDeclaration_0")) return false;
    fieldDeclaration_0_0(b, l + 1);
    return true;
  }

  // (YORUBA_PUBLIC)
  private static boolean fieldDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldDeclaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = YORUBA_PUBLIC(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // YORUBA_IF '(' expression ')' '{' (statement)* '}' (YORUBA_ELSE '{' (statement)* '}')?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = YORUBA_IF(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && ifStatement_5(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && ifStatement_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (statement)*
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifStatement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_5", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (YORUBA_ELSE '{' (statement)* '}')?
  private static boolean ifStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_7")) return false;
    ifStatement_7_0(b, l + 1);
    return true;
  }

  // YORUBA_ELSE '{' (statement)* '}'
  private static boolean ifStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = YORUBA_ELSE(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ifStatement_7_0_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)*
  private static boolean ifStatement_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_7_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifStatement_7_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_7_0_2", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean ifStatement_7_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_7_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | STRING_LITERAL | YORUBA_BOOLEAN | YORUBA_NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = NUMBER(b, l + 1);
    if (!r) r = STRING_LITERAL(b, l + 1);
    if (!r) r = YORUBA_BOOLEAN(b, l + 1);
    if (!r) r = YORUBA_NULL(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // YORUBA_PUBLIC YORUBA_STATIC YORUBA_VOID YORUBA_MAIN '(' STRING_TYPE ARRAY_BRACKETS IDENTIFIER ')' '{' (statement)* '}'
  public static boolean methodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = YORUBA_PUBLIC(b, l + 1);
    r = r && YORUBA_STATIC(b, l + 1);
    r = r && YORUBA_VOID(b, l + 1);
    r = r && YORUBA_MAIN(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, STRING_TYPE);
    r = r && ARRAY_BRACKETS(b, l + 1);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && methodDeclaration_10(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (statement)*
  private static boolean methodDeclaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_10")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodDeclaration_10_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodDeclaration_10", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean methodDeclaration_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDeclaration_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classDeclaration | methodDeclaration | ifStatement | expressionStatement | ';'
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = classDeclaration(b, l + 1);
    if (!r) r = methodDeclaration(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = expressionStatement(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // YORUBA_INT_TYPE | YORUBA_STRING_TYPE
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = YORUBA_INT_TYPE(b, l + 1);
    if (!r) r = YORUBA_STRING_TYPE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (statement)* EOF
  static boolean yorubaJavaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yorubaJavaFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = yorubaJavaFile_0(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)*
  private static boolean yorubaJavaFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yorubaJavaFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!yorubaJavaFile_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "yorubaJavaFile_0", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean yorubaJavaFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yorubaJavaFile_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
