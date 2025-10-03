// This is a generated file. Not intended for manual editing.
package com.github.tundeadetunji.yorubajava;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface YorubaJavaTypes {

  IElementType ARRAY_BRACKETS = new IElementType("ARRAY_BRACKETS", null);
  IElementType ASSIGN = new IElementType("ASSIGN", null);
  IElementType ASSIGNMENT = new IElementType("ASSIGNMENT", null);
  IElementType BAD_CHARACTER = new IElementType("BAD_CHARACTER", null);
  IElementType BLOCK_COMMENT = new IElementType("BLOCK_COMMENT", null);
  IElementType CLASS_DECLARATION = new IElementType("CLASS_DECLARATION", null);
  IElementType DIV = new IElementType("DIV", null);
  IElementType EXPRESSION = new IElementType("EXPRESSION", null);
  IElementType EXPRESSION_STATEMENT = new IElementType("EXPRESSION_STATEMENT", null);
  IElementType FIELD_DECLARATION = new IElementType("FIELD_DECLARATION", null);
  IElementType IDENTIFIER = new IElementType("IDENTIFIER", null);
  IElementType IF_STATEMENT = new IElementType("IF_STATEMENT", null);
  IElementType LBRACE = new IElementType("LBRACE", null);
  IElementType LINE_COMMENT = new IElementType("LINE_COMMENT", null);
  IElementType LITERAL = new IElementType("LITERAL", null);
  IElementType LPAREN = new IElementType("LPAREN", null);
  IElementType METHOD_DECLARATION = new IElementType("METHOD_DECLARATION", null);
  IElementType MINUS = new IElementType("MINUS", null);
  IElementType MULT = new IElementType("MULT", null);
  IElementType NUMBER = new IElementType("NUMBER", null);
  IElementType PLUS = new IElementType("PLUS", null);
  IElementType RBRACE = new IElementType("RBRACE", null);
  IElementType RPAREN = new IElementType("RPAREN", null);
  IElementType SEMICOLON = new IElementType("SEMICOLON", null);
  IElementType STATEMENT = new IElementType("STATEMENT", null);
  IElementType STRING_LITERAL = new IElementType("STRING_LITERAL", null);
  IElementType TYPE = new IElementType("TYPE", null);
  IElementType WHITE_SPACE = new IElementType("WHITE_SPACE", null);
  IElementType YORUBA_BOOLEAN = new IElementType("YORUBA_BOOLEAN", null);
  IElementType YORUBA_CLASS = new IElementType("YORUBA_CLASS", null);
  IElementType YORUBA_ELSE = new IElementType("YORUBA_ELSE", null);
  IElementType YORUBA_IF = new IElementType("YORUBA_IF", null);
  IElementType YORUBA_INT_TYPE = new IElementType("YORUBA_INT_TYPE", null);
  IElementType YORUBA_MAIN = new IElementType("YORUBA_MAIN", null);
  IElementType YORUBA_NULL = new IElementType("YORUBA_NULL", null);
  IElementType YORUBA_PRINT = new IElementType("YORUBA_PRINT", null);
  IElementType YORUBA_PUBLIC = new IElementType("YORUBA_PUBLIC", null);
  IElementType YORUBA_STATIC = new IElementType("YORUBA_STATIC", null);
  IElementType YORUBA_STRING_TYPE = new IElementType("YORUBA_STRING_TYPE", null);
  IElementType YORUBA_VOID = new IElementType("YORUBA_VOID", null);

  IElementType EOF = new IElementType("EOF", null);
  IElementType STRING_TYPE = new IElementType("STRING_TYPE", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_BRACKETS) {
        return new ArrayBracketsImpl(node);
      }
      else if (type == ASSIGN) {
        return new AssignImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new AssignmentImpl(node);
      }
      else if (type == BAD_CHARACTER) {
        return new BadCharacterImpl(node);
      }
      else if (type == BLOCK_COMMENT) {
        return new BlockCommentImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ClassDeclarationImpl(node);
      }
      else if (type == DIV) {
        return new DivImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new ExpressionStatementImpl(node);
      }
      else if (type == FIELD_DECLARATION) {
        return new FieldDeclarationImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new IdentifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new IfStatementImpl(node);
      }
      else if (type == LBRACE) {
        return new LbraceImpl(node);
      }
      else if (type == LINE_COMMENT) {
        return new LineCommentImpl(node);
      }
      else if (type == LITERAL) {
        return new LiteralImpl(node);
      }
      else if (type == LPAREN) {
        return new LparenImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new MethodDeclarationImpl(node);
      }
      else if (type == MINUS) {
        return new MinusImpl(node);
      }
      else if (type == MULT) {
        return new MultImpl(node);
      }
      else if (type == NUMBER) {
        return new NumberImpl(node);
      }
      else if (type == PLUS) {
        return new PlusImpl(node);
      }
      else if (type == RBRACE) {
        return new RbraceImpl(node);
      }
      else if (type == RPAREN) {
        return new RparenImpl(node);
      }
      else if (type == SEMICOLON) {
        return new SemicolonImpl(node);
      }
      else if (type == STATEMENT) {
        return new StatementImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new StringLiteralImpl(node);
      }
      else if (type == TYPE) {
        return new TypeImpl(node);
      }
      else if (type == WHITE_SPACE) {
        return new WhiteSpaceImpl(node);
      }
      else if (type == YORUBA_BOOLEAN) {
        return new YorubaBooleanImpl(node);
      }
      else if (type == YORUBA_CLASS) {
        return new YorubaClassImpl(node);
      }
      else if (type == YORUBA_ELSE) {
        return new YorubaElseImpl(node);
      }
      else if (type == YORUBA_IF) {
        return new YorubaIfImpl(node);
      }
      else if (type == YORUBA_INT_TYPE) {
        return new YorubaIntTypeImpl(node);
      }
      else if (type == YORUBA_MAIN) {
        return new YorubaMainImpl(node);
      }
      else if (type == YORUBA_NULL) {
        return new YorubaNullImpl(node);
      }
      else if (type == YORUBA_PRINT) {
        return new YorubaPrintImpl(node);
      }
      else if (type == YORUBA_PUBLIC) {
        return new YorubaPublicImpl(node);
      }
      else if (type == YORUBA_STATIC) {
        return new YorubaStaticImpl(node);
      }
      else if (type == YORUBA_STRING_TYPE) {
        return new YorubaStringTypeImpl(node);
      }
      else if (type == YORUBA_VOID) {
        return new YorubaVoidImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
