package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;
import java.util.Map;

public class AbstractTest {
    private static String login = "OOlega";

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    private static String password = "8b8ea6e167";

    @AfterAll
    static void tearDown() {
        Selenide.closeWebDriver();
    }

    @BeforeAll
    static void SetUp() {
        Configuration.remote = "http://localhost:4444/wd/hub";
//        Configuration.browser = "chrome";
//        Configuration.browserSize = "1920x1080";
//        Configuration.headless = false;
        Map<String, Object> options = new HashMap<>();
        options.put("enableVNC", true);
        options.put("enableLog", true);
        Configuration.browserCapabilities.setCapability("selenoid:options", options);
        Selenide.open("https://test-stand.gb.ru/login");
        Configuration.pageLoadTimeout = 5000;
    }
}