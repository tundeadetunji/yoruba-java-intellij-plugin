package com.github.tundeadetunji.yorubajava;

/**
 * Built by Tunde Adetunji (<a href="mailto:tundeadetunji2017@gmail.com">tundeadetunji2017@gmail.com</a>)
 * on 03/10/2025
 */

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class YorubaJavaFileType extends LanguageFileType {
	public static final YorubaJavaFileType INSTANCE = new YorubaJavaFileType();

	private YorubaJavaFileType() {
		super(YorubaJavaLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "YorubaJava file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Yoruba Java language file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "yj";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return null; // You can add an icon here later
	}
}
