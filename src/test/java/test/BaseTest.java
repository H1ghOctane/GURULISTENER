package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    @BeforeAll
    static void browserSettings() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=AutoDeElevate");
        Configuration.browserCapabilities = options;
        Configuration.baseUrl = "https://github.com";
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
                        .includeSelenideSteps(true)

        );
    }
}
