package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public void setup() {
        Configuration.browser = "edge";
        open("https://www.swoop.ge/");
        Configuration.browserSize = "1920x1080";


    }

    @AfterMethod(description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}

