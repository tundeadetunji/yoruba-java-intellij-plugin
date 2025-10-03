package com.github.tundeadetunji.yorubajava.psi;

/**
 * Built by Tunde Adetunji (<a href="mailto:tundeadetunji2017@gmail.com">tundeadetunji2017@gmail.com</a>)
 * on 03/10/2025
 */

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.github.tundeadetunji.yorubajava.YorubaJavaFileType;
import com.github.tundeadetunji.yorubajava.YorubaJavaLanguage;
import org.jetbrains.annotations.NotNull;

public class YorubaJavaFile extends PsiFileBase {
	public YorubaJavaFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, YorubaJavaLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return YorubaJavaFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Yoruba Java File";
	}
}
