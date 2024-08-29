package api.services;

import api.assertions.AssertableResponse;
import com.github.javafaker.Faker;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import api.models.user.User;

import static io.restassured.RestAssured.given;

public class UserService {
    private final Faker faker = new Faker();
    public AssertableResponse register(User user, RequestSpecification specification){
        ValidatableResponse response = given().spec(specification)
                .body(user)
                .post("api/users")
                .then();

        user.setId(response.extract().jsonPath().getInt("id"));

        return new AssertableResponse(response);
    }
    public AssertableResponse getUserList(RequestSpecification specification){
        return new AssertableResponse(given().spec(specification)
                .get("api/users")
                .then());
    }

    public AssertableResponse getUserInfo(RequestSpecification specification, Integer userId){
        return new AssertableResponse(given().spec(specification)
                .get("api/users" +"/" + userId)
                .then());
    };

    public AssertableResponse updateUser(RequestSpecification specification,User user){
        user.setEmail(faker.internet().emailAddress());
        user.setName(faker.name().fullName());

        return new AssertableResponse(given().spec(specification)
                .body(user)
                .put("api/users" + "/" + user.getId())
                .then());
    }

    public  AssertableResponse deleteUser(RequestSpecification specification, User user){
       return new AssertableResponse(given().spec(specification)
                .body(String.format("{ \"migrate_ownership_id\": %d }", user.getId()))
                .delete("api/users" + "/" + user.getId())
                .then());
    }
}
