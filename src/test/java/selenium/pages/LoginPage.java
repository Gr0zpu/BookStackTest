package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.BasePage;

public class LoginPage extends BasePage {
private By loginInput = By.xpath("//input[@id='email']");
private By passwordInput = By.xpath("//input[@id='password']");
private By loginBtn = By.xpath("//button[@class='button']");

public LoginPage enterLogin(String login) {
    getDriver().findElement(loginInput).click();
    getDriver().findElement(loginInput).sendKeys(login);
    return this;
}
public LoginPage enterPassword(String password) {
    getDriver().findElement(passwordInput).click();
    getDriver().findElement(passwordInput).sendKeys(password);
    return this;
}
public MainPage clickLoginBtn() {
    getDriver().findElement(loginBtn).click();
    return new MainPage(getDriver());
}

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
