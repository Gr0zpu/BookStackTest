package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement loginInput = $x("//input[@id='email']");
    private SelenideElement passwordInput = $x("//input[@id='password']");
    private SelenideElement loginBtn = $x("//button[@class='button']");

    public LoginPage enterLogin(String login) {
        loginInput.click();
        loginInput.sendKeys(login);
        return this;
    }
    public LoginPage enterPassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);
        return this;
    }
    public MainPage clickLoginBtn() {
        loginBtn.click();
        return Selenide.page(MainPage.class);
    }
}
