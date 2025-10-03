package com.github.tundeadetunji.yorubajava;

/**
 * Built by Tunde Adetunji (<a href="mailto:tundeadetunji2017@gmail.com">tundeadetunji2017@gmail.com</a>)
 * on 03/10/2025
 */


import com.intellij.lang.Language;

public class YorubaJavaLanguage extends Language {
	public static final YorubaJavaLanguage INSTANCE = new YorubaJavaLanguage();

	private YorubaJavaLanguage() {
		super("YorubaJava");
	}
}
