package lesson_4;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositorySearch() {

        //открыть главную страницу
        open("https://github.com/");
        //нажать на кнопку поиска, ввести в поле поиска selenide и нажать enter
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        //нажать на первый элемент в результатах поиска
        $$("[data-testid='results-list'] h3 span").first().click();

        //проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

        sleep(5000);
    }

}
