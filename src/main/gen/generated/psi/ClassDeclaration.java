// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ClassDeclaration extends PsiElement {

  @NotNull
  Identifier getIdentifier();

  @NotNull
  YorubaClass getYorubaClass();

  @NotNull
  List<FieldDeclaration> getFieldDeclarationList();

  @NotNull
  List<MethodDeclaration> getMethodDeclarationList();

}
