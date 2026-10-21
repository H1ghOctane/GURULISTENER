package test;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueTitleStepAnnotationTest extends BaseTest {

    @Test
    void checkIssueTitle() {
        openIssuesPage();
        clickFirstIssue();
        verifyIssueTitle("Issue");
    }

    @Step("Открыть список Issues репозитория")
    void openIssuesPage() {
        open("/H1ghOctane/GURULISTENER/issues");
    }

    @Step("Кликнуть по ссылке на Issue #1")
    void clickFirstIssue() {
        $("a[href$='/issues/1']").click();
    }

    @Step("Проверить, что название Issue равно '{issue for test}'")
    void verifyIssueTitle(String expectedTitle) {
        $("h1 bdi").shouldHave(text(expectedTitle));
    }
}