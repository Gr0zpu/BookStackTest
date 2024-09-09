package selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.AppConfig;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
@Getter
public class BaseTest {
    private WebDriver driver;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    private String baseUrl;
    private FirefoxOptions options;
    @BeforeEach
    public void setUp() throws InterruptedException {
        options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        baseUrl = appConfig.url(); // Предполагается, что appConfig.url() вернет ваш базовый URL

        // Передача options в конструктор FirefoxDriver
        driver = new FirefoxDriver(options);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        waitForServer(baseUrl); // Метод для ожидания готовности сервера

        driver.get(baseUrl);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    public void waitForServer(String url) throws InterruptedException {
        int timeout = 30;  // Максимальное время ожидания в секундах
        for (int i = 0; i < timeout; i++) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                int responseCode = connection.getResponseCode();
                if (responseCode == 200) {
                    return;  // Сервер доступен
                }
            } catch (IOException e) {
                Thread.sleep(1000);  // Ожидание 1 секунду перед повторной проверкой
            }
        }
        throw new RuntimeException("Server is not available after " + timeout + " seconds.");
    }
}
