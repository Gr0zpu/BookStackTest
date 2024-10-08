package api.services;

import api.assertions.AssertableResponse;
import api.models.shelve.Shelve;
import api.tests.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import utils.RandomTestData;

import static io.restassured.RestAssured.given;

public class ShelveService {
    private final Faker faker = new Faker();
    @Step("Create new shelve")
    public AssertableResponse addNewShelve(Shelve shelve){
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .body(shelve)
                .post("api/shelves")
                .then();
    shelve.setId(response.extract().jsonPath().getInt("id"));

    return new AssertableResponse(response);
    }
    @Step("Get shelve by ID")
    public AssertableResponse getShelveById(Shelve shelve) {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .get("api/shelves/" + shelve.getId())
                .then();

        return new AssertableResponse(response);
    }


    public AssertableResponse getShelvesList() {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .get("api/shelves")
                .then();
        return new AssertableResponse(response);
    }

    public AssertableResponse deleteShelveById(Shelve shelve) {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .delete("api/shelves/" + shelve.getId())
                .then();
        return new AssertableResponse(response);
    }

    public AssertableResponse updateShelveById(Shelve oldShelve) {
        Shelve updateShelve = RandomTestData.getRandomShelve();

        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .contentType(ContentType.MULTIPART)
                .multiPart("name", updateShelve.getName())
                .multiPart("description", updateShelve.getDescriptionHtml())
                .put("api/shelves/" + oldShelve.getId())
                .then();

        return new AssertableResponse(response);
    }

}
