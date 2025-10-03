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

public class MethodDeclarationImpl extends ASTWrapperPsiElement implements MethodDeclaration {

  public MethodDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMethodDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ArrayBrackets getArrayBrackets() {
    return findNotNullChildByClass(ArrayBrackets.class);
  }

  @Override
  @NotNull
  public Identifier getIdentifier() {
    return findNotNullChildByClass(Identifier.class);
  }

  @Override
  @NotNull
  public YorubaMain getYorubaMain() {
    return findNotNullChildByClass(YorubaMain.class);
  }

  @Override
  @NotNull
  public YorubaPublic getYorubaPublic() {
    return findNotNullChildByClass(YorubaPublic.class);
  }

  @Override
  @NotNull
  public YorubaStatic getYorubaStatic() {
    return findNotNullChildByClass(YorubaStatic.class);
  }

  @Override
  @NotNull
  public YorubaVoid getYorubaVoid() {
    return findNotNullChildByClass(YorubaVoid.class);
  }

  @Override
  @NotNull
  public List<Statement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Statement.class);
  }

}
