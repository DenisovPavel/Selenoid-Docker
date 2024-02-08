package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AbstractTest {
    String login = "OOlega";
    String password = "8b8ea6e167";


    @BeforeEach
    void init() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
//        Configuration.browserVersion = "121.0.6167.86";//опционально;
        Configuration.headless = false;
        Selenide.open("https://test-stand.gb.ru/login");
        Configuration.pageLoadTimeout = 5000;

    }
    @AfterEach
    void close() {
        Selenide.closeWebDriver();
    }
}


