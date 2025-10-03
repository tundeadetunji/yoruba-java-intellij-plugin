package com.github.tundeadetunji.yorubajava.parser;

/**
 * Built by Tunde Adetunji (<a href="mailto:tundeadetunji2017@gmail.com">tundeadetunji2017@gmail.com</a>)
 * on 03/10/2025
 */

import com.github.tundeadetunji.yorubajava.YorubaJavaLanguage;
import com.github.tundeadetunji.yorubajava.YorubaJavaParser;
import com.github.tundeadetunji.yorubajava.YorubaJavaTypes;
import com.github.tundeadetunji.yorubajava.lexer.YorubaJavaLexerAdapter;
import com.github.tundeadetunji.yorubajava.psi.YorubaJavaFile;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class YorubaJavaParserDefinition implements ParserDefinition {
	public static final IFileElementType FILE = new IFileElementType(YorubaJavaLanguage.INSTANCE);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new YorubaJavaLexerAdapter();
	}

	@Override
	public PsiParser createParser(Project project) {
		return new YorubaJavaParser(); // Generated parser class
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens() {
		return TokenSet.create(YorubaJavaTypes.WHITE_SPACE);
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		return TokenSet.create(YorubaJavaTypes.LINE_COMMENT, YorubaJavaTypes.BLOCK_COMMENT);
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements() {
		return TokenSet.create(YorubaJavaTypes.STRING_LITERAL);
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode node) {
		return YorubaJavaTypes.Factory.createElement(node);
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new YorubaJavaFile(viewProvider);
	}
}
