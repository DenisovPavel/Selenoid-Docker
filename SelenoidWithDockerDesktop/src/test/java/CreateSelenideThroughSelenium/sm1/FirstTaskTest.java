package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

public class FirstTaskTest extends AbstractTest {
    @Test
    @Disabled
    void authorizationTestOne() throws InterruptedException {
        SelenideElement loginNew = Selenide.$x("//*[@type='text']");
        SelenideElement passwordNew = Selenide.$x("//*[@type='password']");
        SelenideElement buttonNew = Selenide.$x("//*[@class='mdc-button__label']");
        loginNew.sendKeys(login);
        passwordNew.sendKeys(password);
        buttonNew.shouldBe(visible).click();
        SelenideElement searchList = Selenide.$x("//div[@class='mdc-menu mdc-menu-surface']/..");
        Assertions.assertEquals("Hello, OOlega", searchList.getText());
    }
}