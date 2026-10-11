package test;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueTitleLambdaStepsTest extends BaseTest {

    @Test
    void checkIssueTitle() {
        Allure.step("Открыть список Issues репозитория", () -> {
            open("/H1ghtOctane/GURULISTENER/issues");
        });

        Allure.step("Кликнуть по ссылке на Issue #1", () -> {
            $("a[href$='/issues/1']").click();
        });

        Allure.step("Проверить, что заголовок Issue равен 'Issue'", () -> {
            $("h1 bdi").shouldHave(text("Issue"));
        });
    }
}