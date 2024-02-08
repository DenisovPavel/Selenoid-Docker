package sm2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement elementCreateNewPostButton = $x("create-btn");

    public void createPost() {
        elementCreateNewPostButton.shouldBe(visible).click();
    }
}