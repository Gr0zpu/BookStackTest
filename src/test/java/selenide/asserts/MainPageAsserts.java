package selenide.asserts;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import selenide.pages.MainPage;
import utils.AppConfig;

public class MainPageAsserts {
    private MainPage mainPage;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    public MainPageAsserts(MainPage mainPage) {
        this.mainPage = mainPage;
    }

@Step
    public MainPageAsserts assertElementIsPresent(SelenideElement hoverLocator) {
        Assertions.assertNotNull(hoverLocator);
        return this;
    }
@Step
    public MainPageAsserts assertUrlIsCorrect(){
        Assertions.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), appConfig.url());
        return this;
    }
}
