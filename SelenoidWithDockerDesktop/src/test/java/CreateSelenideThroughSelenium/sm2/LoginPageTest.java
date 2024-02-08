package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageTest extends AbstractTest {


    @Test
    @DisplayName("Проверка текста об ошибке в сплывающем окне(разные вариации)")
    void getAuthorizationWithOutParams() {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.LoginInSystemWithOutParams();
        SelenideElement elementSearch = $x("//h2[@class='svelte-uwkxn9']");
        //      $x("div[@class='error-block svelte-uwkxn9']/p[contains(text(),'Invalid credentials.')]"));
        Assertions.assertEquals("401", elementSearch.getText());
//    Assertions.assertEquals("Invalid credentials",elementSearch.getText());
    }

    @Test
    @DisplayName("Тест на простое изменение имени")
    void getDummyNameRewritten() throws InterruptedException {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystem(getLogin(), getPassword());
        RemakeNamePage remakeNamePage = Selenide.page(RemakeNamePage.class);
        remakeNamePage.openFirstDummyCardAndSaveNewName("New Dummy2");
        SelenideElement searchElement = $x("//div[@class='container svelte-tv8alb']/h1");
        Assertions.assertEquals("New Dummy2", searchElement.getText());

    }

    @Test
    @DisplayName("Тест на проверку Id измененного названия заголовка")
    void getDummyIDRewritten() throws InterruptedException {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystem(getLogin(), getPassword());
        RemakeNamePage remakeNamePage = Selenide.page(RemakeNamePage.class);
        remakeNamePage.openFirstDummyCardAndSaveNewName("New Dummy2");
        remakeNamePage.openProfile();
        SelenideElement  searchElement = $("tbody tr td");
        Assertions.assertEquals("97452", searchElement.getText());
    }



}