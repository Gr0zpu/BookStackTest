package api.tests;

import api.assertions.Conditions;
import api.models.user.User;
import org.junit.jupiter.api.*;
import utils.RandomTestData;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;


public class userTests extends BaseTest {
    private User user;

    @BeforeEach
    public void initTestUser(){
        user = RandomTestData.getRandomUser();
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void getUserListTest() {
        getUserService().getUserList(getSpecification())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/userListScheme.json"));

    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void createNewUserTest() {
        getUserService().register(user,getSpecification())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newUserResponseScheme.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void readUserTest() {
        getUserService().register(user, getSpecification())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newUserResponseScheme.json"));

        getUserService().getUserInfo(getSpecification(), user.getId())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.idIsEqual(user))
                .should(Conditions.jsonScheme("jsonScheme/user/readUserResponseScheme.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void updateUserTest() {
        getUserService().register(user, getSpecification())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newUserResponseScheme.json"));

        getUserService().updateUser(getSpecification(),user)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.idIsEqual(user))
                .should(Conditions.userUpdated(user))
                .should(Conditions.jsonScheme("jsonScheme/user/newUserResponseScheme.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void deleteUserTest() {
        getUserService().register(user, getSpecification())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newUserResponseScheme.json"));

        getUserService().deleteUser(getSpecification(), user)
                .should(Conditions.hasStatusCode(204));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void deleteAllUsers() {
        ArrayList<User> users = new ArrayList<>(getUserService().getUserList(getSpecification()).asList("data",User.class));
        for (User user : users){
            if (user.getId() > 3){
                getUserService().deleteUser(getSpecification(), user);
            }
        }
    }
}