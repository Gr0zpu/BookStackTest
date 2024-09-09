package selenide.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenide.base.BaseTest;
import selenide.pages.LoginPage;
import selenide.pages.MainPage;
import utils.AppConfig;

public class LoginTest extends BaseTest {

    @BeforeEach
    public void initTestSetting() {
        Selenide.open("login");
    }
    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = loginPage.enterLogin(getWEB_ADMIN_LOGIN())
                                    .enterPassword(getWEB_ADMIN_PASSWORD())
                                    .clickLoginBtn();

        mainPage.should().assertElementIsPresent(mainPage.getChangeThemeHover())
                         .assertUrlIsCorrect();
    }

}
