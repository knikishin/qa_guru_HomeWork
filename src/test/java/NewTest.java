import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NewTest {

    @Test
    void successfulSearchTest() {
        Configuration.timeout = 50000;
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        Configuration.timeout = 50000;  // без timeout не успевает прогрузиться страница
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
}
