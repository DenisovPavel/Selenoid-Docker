package sm2;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;
/**
 * @params ElementPage - отдельный случай PageObject;
 */
public class ElementPage {
  private final ElementsCollection elementsPage = $$x( "//button");

    public void deletePost() {
        elementsPage.get(1).click();
    }
    public void editButton(){
        elementsPage.first().click();
    }
}