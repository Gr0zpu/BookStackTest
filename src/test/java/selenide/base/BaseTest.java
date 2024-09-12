package selenide.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import selenide.pages.LoginPage;
import utils.AppConfig;
import utils.Helpers;

@Getter
public class BaseTest {
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    private final String WEB_ADMIN_LOGIN = appConfig.webAdminLogin();
    private final String WEB_ADMIN_PASSWORD = appConfig.webAdminPassword();
    @BeforeEach
    public void initSettings() {
        String chromeOptionsEnv = System.getenv("CHROME_OPTIONS");
        Configuration.browser = "chrome";
        Configuration.browserCapabilities.setCapability("goog:chromeOptions", Helpers.getChromeOption());

        System.out.println(appConfig.url());
        Configuration.baseUrl = appConfig.url();
    }

    public void login() {
        Selenide.open("login");
        new LoginPage().enterLogin(getWEB_ADMIN_LOGIN())
                .enterPassword(getWEB_ADMIN_PASSWORD())
                .clickLoginBtn();
    }

    @AfterEach
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }
}
