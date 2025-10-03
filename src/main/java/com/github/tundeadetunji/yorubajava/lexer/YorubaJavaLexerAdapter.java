package com.github.tundeadetunji.yorubajava.lexer;

/**
 * Built by Tunde Adetunji (<a href="mailto:tundeadetunji2017@gmail.com">tundeadetunji2017@gmail.com</a>)
 * on 03/10/2025
 */


import com.intellij.lexer.FlexAdapter;

public class YorubaJavaLexerAdapter extends FlexAdapter {
	public YorubaJavaLexerAdapter() {
		super(new YorubaJavaLexer(null));
	}
}
