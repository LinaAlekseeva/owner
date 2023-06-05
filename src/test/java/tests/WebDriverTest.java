package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebDriverTest extends TestBase {
    SelenideElement aboutTinkoff = $(".footer__cZ2dAc"),
            introductionHeaderText = $(".abwoW-+QD9");

    @Test
    void amazonTest() {

        open("/");
        aboutTinkoff.click();
        introductionHeaderText.shouldHave(text("О Тинькофф"));
    }

}
