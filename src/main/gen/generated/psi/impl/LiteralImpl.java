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

public class LiteralImpl extends ASTWrapperPsiElement implements Literal {

  public LiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Number getNumber() {
    return findChildByClass(Number.class);
  }

  @Override
  @Nullable
  public StringLiteral getStringLiteral() {
    return findChildByClass(StringLiteral.class);
  }

  @Override
  @Nullable
  public YorubaBoolean getYorubaBoolean() {
    return findChildByClass(YorubaBoolean.class);
  }

  @Override
  @Nullable
  public YorubaNull getYorubaNull() {
    return findChildByClass(YorubaNull.class);
  }

}
