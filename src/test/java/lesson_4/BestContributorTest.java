package lesson_4;

import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorTest {

    @Test
    void checkBestContributor() {
        //открыть страниицу репозитория selenide
        open("https://github.com/selenide/selenide");
        //навести мышку к первому аватару из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
        //Проверка фамилии имени первого контрибьютера
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
    }

}
