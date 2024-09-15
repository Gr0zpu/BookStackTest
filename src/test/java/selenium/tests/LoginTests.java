package selenium.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;
import selenium.base.BaseTest;
import selenium.pages.LoginPage;
import selenium.pages.MainPage;

public class LoginTests extends BaseTest {
    @BeforeEach
    public void openSite() {
        getDriver().get(getBaseUrl() + "login"); }

    @Test
    @Tag("UI")
    @Tag("Positive")
    @Tag("Positive")
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        MainPage mainPage = loginPage.enterLogin(getAppConfig().webAdminLogin())
                .enterPassword(getAppConfig().webAdminPassword())
                .clickLoginBtn();

        mainPage.should()
                .assertElementIsPresent(mainPage.getChangeThemeHover())
                .assertUrlIsCorrect();
    }
}
