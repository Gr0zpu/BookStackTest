package selenium.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.asserts.MainPageAsserts;
import selenium.base.BasePage;

public class MainPage extends BasePage {
    @Getter
    private By changeThemeHover = By.xpath("//div[@id='content']//span[contains(text(), 'Mode')]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPageAsserts should(){
        return new MainPageAsserts(this);
    }


}
