package selenide.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import utils.AppConfig;
@Getter
public class BaseTest {
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    private final String WEB_ADMIN_LOGIN = appConfig.webAdminLogin();
    private final String WEB_ADMIN_PASSWORD = appConfig.webAdminPassword();
    @BeforeEach
    public void initSettings() {
        System.out.println(appConfig.url());
        Configuration.baseUrl = appConfig.url();
    }
}
