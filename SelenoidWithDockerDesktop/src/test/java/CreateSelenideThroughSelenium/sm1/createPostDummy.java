package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

public class createPostDummy extends AbstractTest {

    @Test
    @DisplayName("Create Dummy with wait")
    void createDummyInPage() {
        SelenideElement loginNew = Selenide.$x("//*[@type='text']");
        SelenideElement passwordNew = Selenide.$x("//*[@type='password']");
        SelenideElement buttonNew = Selenide.$x("//*[@class='mdc-button__label']");
        loginNew.sendKeys(login);
        passwordNew.sendKeys(password);
        buttonNew.shouldBe(visible).click();
        SelenideElement buttonCreate = Selenide.$x("//*[@id ='create-btn']");
        buttonCreate.shouldBe(visible).click();
        SelenideElement titleNew = Selenide.$x("//*[@type='text']");
        titleNew.sendKeys("New Dummy test");
        SelenideElement descriptionNew = Selenide.$("div.field textarea.mdc-text-field__input");
        descriptionNew.sendKeys("This is description of new Dummy");
        SelenideElement buttonPage = Selenide.$x("//*[@type='submit']");
        buttonPage.shouldBe(visible).click();
        SelenideElement elementsDummy = Selenide.$$x("//h1[@class='svelte-tv8alb']").first();
        Assertions.assertEquals("New Dummy test", elementsDummy.text());

    }
}
