package test;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class IssueTitleSelenideTest extends BaseTest {

    @Test
    void checkIssueTitle() {

        open("/H1ghOctane/GURULISTENER/issues");
        $("a[href$='/issues/1']").click();
        $("[data-testid='issue-title']").shouldHave(text("issue for test"));
    }
}