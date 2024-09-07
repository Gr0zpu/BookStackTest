package api.tests;

import api.services.BookService;
import api.services.UserService;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import listeners.CustomAllureRestAssured;
import lombok.Data;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import utils.AppConfig;

public class BaseTest {
    @Getter
    private static AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    @Getter
    private static RequestSpecification specification;
    @Getter
    private static UserService userService;
    @Getter
    private static BookService bookService;

    @BeforeAll
    public static void setUp(){
        RestAssured.baseURI = appConfig.url();
        userService = new UserService();
        bookService = new BookService();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter(), new CustomAllureRestAssured());
        specification = RestAssured.given()
                .header("Authorization", String.format("Token %s:%s", appConfig.adminApiKey(), appConfig.adminApiSecretKey()))
                .contentType(ContentType.JSON);
    }
}
