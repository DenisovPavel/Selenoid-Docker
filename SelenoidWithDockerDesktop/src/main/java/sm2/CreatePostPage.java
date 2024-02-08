package sm2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CreatePostPage {
    private final SelenideElement elementTitle = $x("//*[@type='text']");
    private final SelenideElement elementDescription = $x("//textarea[@class='mdc-text-field__input']");
    private final SelenideElement elementButtonSave = $x("//*[@type='submit']");


    public void savePost(String titleText, String descriptionText) {
        elementTitle.shouldBe(visible).sendKeys(titleText);
        elementDescription.shouldBe(visible).sendKeys(descriptionText);
        elementButtonSave.shouldBe(visible).click();
    }

}

