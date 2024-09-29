package api.services;

import api.assertions.AssertableResponse;
import api.models.book.Book;
import api.models.page.Page;
import api.tests.BaseTest;
import com.github.javafaker.Faker;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class PageService {
    private final Faker faker = new Faker();

    public AssertableResponse addNewPage(Page page) {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .body(page)
                .post("api/pages")
                .then();

        page.setId(response.extract().jsonPath().getInt("id"));

        return new AssertableResponse(response);
    }

    public AssertableResponse deletePage(Page page) {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .delete("api/pages/" + page.getId())
                .then();
        return new AssertableResponse(response);
    }

    public AssertableResponse getPageById(Page page) {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .get("api/pages/" + page.getId())
                .then();
        return new AssertableResponse(response);
    }
}
