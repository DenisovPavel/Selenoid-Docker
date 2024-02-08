package sm2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
public class LoginPage {
    private final SelenideElement elementLogin = $x("//*[@type='text']");
    private final SelenideElement elementPassword = $x("//*[@type='password']");
    private final SelenideElement elementButton = $x("//*[@class='mdc-button__label']");

    public void loginInSystem(String login1, String password1) {
        elementLogin.shouldBe(visible).sendKeys(login1);
        elementPassword.shouldBe(visible).sendKeys(password1);
        elementButton.shouldBe(visible).click();
    }

    public void LoginInSystemWithOutParams() {
        elementButton.shouldBe(visible).click();
    }

}
