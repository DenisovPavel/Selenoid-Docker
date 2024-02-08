package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;

public class AbstractTest {
    String login = "OOlega";
    String password = "8b8ea6e167";


    @BeforeEach
    void init() {
        Configuration.remote = "http://localhost:4444/wd/hub";// remote - обращение к selenoid с default настройками.
//        Configuration.browser = "chrome";
//        Configuration.browserSize = "1920x1080";
//        Configuration.browserVersion = "121.0";//опционально;
        Map<String, Object> options = new HashMap<>();
        options.put("enableVNC", true);
        options.put("enableLog", true);
        Configuration.browserCapabilities.setCapability("selenoid:options", options);
        Configuration.headless = false;
        Selenide.open("https://test-stand.gb.ru/login");
        Configuration.pageLoadTimeout = 5000;

    }

    @AfterEach
    void close() {
        Selenide.closeWebDriver();
    }
}


