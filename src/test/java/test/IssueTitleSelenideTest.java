package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueTitleSelenideTest extends BaseTest {

    @Test
    void checkIssueTitle() {
        open("/H1ghtOctane/GURULISTENER/issues");
        $("a[href$='/issues/1']").click();
        $("h1 bdi").shouldHave(text("Issue"));
    }
}