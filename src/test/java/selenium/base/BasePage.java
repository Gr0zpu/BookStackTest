package selenium.base;

import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@Getter
public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement webElementFactory(By locator) {
        return (WebElement) getDriver().findElements(locator);
    }
}
