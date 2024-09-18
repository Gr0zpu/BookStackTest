package selenium.base;

import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.AppConfig;
import utils.Helpers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
@Getter
public class BaseTest {
    private WebDriver driver;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    private String baseUrl;
    @BeforeEach
    public void setUp(){
        String chromeOptionsEnv = System.getenv("CHROME_OPTIONS");
        if(appConfig.isLocal() == null){
            chromeRemoteSetup(chromeOptionsEnv);
        }

        baseUrl = appConfig.url();
        driver = new ChromeDriver(Helpers.getChromeOption());
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterEach
    public void tearDown() {
        driver.close();
    }

    public void chromeRemoteSetup(String chromeOptionsEnv) {
        ChromeOptions options = new ChromeOptions();

        options.setBinary("/opt/hostedtoolcache/setup-chrome/chromium/stable/x64/chrome");

        if (chromeOptionsEnv != null && !chromeOptionsEnv.isEmpty()) {
            String[] optionsArray = chromeOptionsEnv.split(" ");
            for (String option : optionsArray) {
                options.addArguments(option);
            }
        }
    }
}
