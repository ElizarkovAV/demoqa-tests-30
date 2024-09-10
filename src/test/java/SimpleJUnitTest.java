import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {
    int result;

    @BeforeEach
    void setUp() {
        System.out.println("### beforeEach()");
        result = getResult();
    }

    private int getResult() {
        return 3;
    }

    static {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void firstTest() {
        System.out.println("### firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("### secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTest()");
        Assertions.assertTrue(result > 2);
    }

    @AfterEach
    void afterEach() {
        System.out.println("###    afterEach()\n");
        result = 0;
    }

}
