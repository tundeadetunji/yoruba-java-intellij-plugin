// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IfStatement extends PsiElement {

  @Nullable
  YorubaElse getYorubaElse();

  @NotNull
  YorubaIf getYorubaIf();

  @NotNull
  Expression getExpression();

  @NotNull
  List<Statement> getStatementList();

}
