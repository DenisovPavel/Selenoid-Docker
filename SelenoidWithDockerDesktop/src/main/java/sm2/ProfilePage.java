package sm2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;

public class ProfilePage {


    private final SelenideElement buttonProfile = Selenide.$x("//div[@class='mdc-menu mdc-menu-surface']/..");
    private final SelenideElement buttonInListFirst = Selenide.$x("//span[contains(text(),'Profile')]");
    private final SelenideElement buttonEdit = Selenide.$x("//button[@title='More options']");
    private final SelenideElement editProfile = Selenide.$x("//input[@type='file']");
    private final SelenideElement buttonSave = Selenide.$x("//button[@type='submit']");

    public void openProfilePage() {
        buttonProfile.shouldBe(visible).click();
        buttonInListFirst.click();
    }

    public void clickEditButtonInProfilePage(String path) {
        buttonEdit.shouldBe(visible).click();
        Selenide.sleep(5000);
//        editProfile.shouldBe(visible).click(); // после клика открывается окно windows
        editProfile.shouldBe(visible).uploadFile(new File(path));
        Selenide.sleep(5000);
        buttonSave.shouldBe(visible).click();
    }
    public String getFileName(){
        return editProfile.getValue();
    }
}
