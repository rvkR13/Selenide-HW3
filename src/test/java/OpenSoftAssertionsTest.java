import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class OpenSoftAssertionsTest {

    @DisplayName("open SoftAssertions")
    @Test
    public void openSoftAssertions() {
        open("https://github.com/");
        $("[aria-label=\"Search GitHub\"]").setValue("selenide").pressEnter();
        $$(".menu-item").filter(text("Wikis")).get(0).click();
        $(byTitle("SoftAssertions")).shouldBe(visible).click();
        $(byText("Using JUnit5 extend test class:")).shouldBe(visible);
    }

    @DisplayName("Drag and Drop elements")
    @Test
    public void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
    }
}
