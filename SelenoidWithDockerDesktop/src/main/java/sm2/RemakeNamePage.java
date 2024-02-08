package sm2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class RemakeNamePage {
    private final SelenideElement elementFirstDummyCard = $x("//div[@class='posts svelte-127jg4t']/a");
    private final SelenideElement elementDummyEditPostButton = $x("//div[@class='button-block svelte-tv8alb']/button");
    private final SelenideElement elementFieldToTitle = $x("//input[@type='text']");
    private final SelenideElement elementButtonSave = $x("//*[@type='submit']");
    private final SelenideElement elementUserPageButton = $x("//a[contains(text(),'Hello')]");
    private final SelenideElement elementProfileButton = $x("//ul[@class='mdc-deprecated-list']/li");

    public void openFirstDummyCardAndSaveNewName(String name) throws InterruptedException {
        elementFirstDummyCard.shouldBe(visible).click();
        Thread.sleep(5000L);
        elementDummyEditPostButton.shouldBe(visible).click();
        elementFieldToTitle.clear();
        elementFieldToTitle.sendKeys(name);
        elementButtonSave.click();
    }

    public void openProfile() throws InterruptedException {
        Thread.sleep(5000l);
        elementUserPageButton.shouldBe(visible).click();
        elementProfileButton.shouldBe(visible).click();
    }
}
