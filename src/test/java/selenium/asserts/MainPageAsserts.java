package selenium.asserts;

import io.qameta.allure.Step;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import selenium.pages.MainPage;
import utils.AppConfig;


@Getter
public class MainPageAsserts {
    private MainPage mainPage;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    public MainPageAsserts(MainPage mainPage) {
        this.mainPage = mainPage;
    }
    @Step
    public MainPageAsserts assertElementIsPresent(By hoverLocator) {
        Assertions.assertNotNull(mainPage.getDriver().findElement(hoverLocator));
        return this;
    }
    @Step
    public MainPageAsserts assertUrlIsCorrect(){
        Assertions.assertEquals(mainPage.getDriver().getCurrentUrl(),appConfig.url());
        return this;
    }
}
