package selenium.asserts;

import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.BasePage;
import selenium.pages.MainPage;
import utils.AppConfig;


@Getter
public class MainPageAsserts {
    private MainPage mainPage;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    public MainPageAsserts(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    public MainPageAsserts assertElementIsPresent(By hoverLocator) {
        Assertions.assertNotNull(mainPage.getDriver().findElement(hoverLocator));
        return this;
    }

    public MainPageAsserts assertUrlIsCorrect(){
        Assertions.assertEquals(mainPage.getDriver().getCurrentUrl(),appConfig.url());
        return this;

    }
}
