package api.services;

import api.assertions.AssertableResponse;
import api.models.book.Book;
import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import utils.RandomTestData;

import static io.restassured.RestAssured.given;

public class BookService {
    private final Faker faker = new Faker();

    public AssertableResponse addNewBook(RequestSpecification specification, Book book){
        ValidatableResponse response = given().spec(specification)
                        .contentType(ContentType.MULTIPART)
                .multiPart("name", book.getName())  // Передаем имя книги
                .multiPart("description", book.getDescription())
                .multiPart("description_html", book.getDescriptionHtml())
                        .multiPart("image", RandomTestData.getBookCover(), "image/jpg")
                        .post("api/books")
                        .then();

        book.setId(response.extract().jsonPath().getInt("id"));
        return new AssertableResponse(response);
    }

    public AssertableResponse getAvailableBooksList(RequestSpecification specification) {
         return new AssertableResponse(given().spec(specification)
                .get("api/books")
                .then());
    }

}
