package selenium.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.asserts.MainPageAsserts;
import selenium.base.BasePage;
import selenium.components.Header;

@Getter
public class MainPage extends BasePage {
    private Header header;
    private By changeThemeHover = By.xpath("//div[@id='content']//span[contains(text(), 'Mode')]");

    public MainPage(WebDriver driver) {
        super(driver);
        header = new Header(getDriver());
    }

    public MainPageAsserts should(){

        return new MainPageAsserts(this);
    }


}
