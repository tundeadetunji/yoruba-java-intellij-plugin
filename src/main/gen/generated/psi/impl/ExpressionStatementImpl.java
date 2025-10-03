// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.tundeadetunji.yorubajava.YorubaJavaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class ExpressionStatementImpl extends ASTWrapperPsiElement implements ExpressionStatement {

  public ExpressionStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitExpressionStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StringLiteral getStringLiteral() {
    return findChildByClass(StringLiteral.class);
  }

  @Override
  @Nullable
  public YorubaPrint getYorubaPrint() {
    return findChildByClass(YorubaPrint.class);
  }

  @Override
  @Nullable
  public Assignment getAssignment() {
    return findChildByClass(Assignment.class);
  }

}
