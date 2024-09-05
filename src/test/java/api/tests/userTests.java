package api.tests;

import api.assertions.Conditions;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import api.models.user.User;
import listeners.CustomAllureRestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.*;
import api.services.UserService;
import utils.AppConfig;
import utils.RandomTestData;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;


public class userTests {
    private User user;
    private static AppConfig appConfig = ConfigFactory.create(AppConfig.class);
    private static RequestSpecification specification;
    private static UserService userService;

    @BeforeEach
    public void initTestUser(){
        user = RandomTestData.getRandomUser();
    }

    @BeforeAll
    public static void setUp(){
        RestAssured.baseURI = appConfig.url();
        userService = new UserService();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter(), new CustomAllureRestAssured());
        specification = RestAssured.given()
                .header("Authorization", String.format("Token %s:%s", appConfig.adminApiKey(), appConfig.adminApiSecretKey()))
                .contentType(ContentType.JSON);
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void getUserListTest(){
        userService.getUserList(specification)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/userListScheme.json"));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void createNewUserTest(){
        userService.register(user,specification)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newUserResponseScheme.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void readUserTest(){
        userService.register(user, specification)
                .should(Conditions.hasStatusCode(200));

        userService.getUserInfo(specification, user.getId())
                        .should(Conditions.hasStatusCode(200))
                        .should(Conditions.idIsEqual(user))
                        .should(Conditions.jsonScheme("jsonScheme/user/readUserResponseScheme.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void updateUserTest(){
       userService.register(user, specification)
                .should(Conditions.hasStatusCode(200));

       userService.updateUser(specification,user)
               .should(Conditions.hasStatusCode(200))
               .should(Conditions.idIsEqual(user))
               .should(Conditions.userUpdated(user))
               .should(Conditions.jsonScheme("jsonScheme/user/readUserResponseScheme.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void deleteUserTest(){
        userService.register(user, specification)
                .should(Conditions.hasStatusCode(200));

        userService.deleteUser(specification, user)
                .should(Conditions.hasStatusCode(204));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void deleteAllUsers(){
        ArrayList<User> users = new ArrayList<>(userService.getUserList(specification).asList("data",User.class));
        for (User user : users){
            if (user.getId() > 3){
                userService.deleteUser(specification, user);
            }
        }
    }
}
