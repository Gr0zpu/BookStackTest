package api.services;

import api.assertions.AssertableResponse;
import api.models.book.Book;
import api.tests.BaseTest;
import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import utils.RandomTestData;

import static io.restassured.RestAssured.given;

public class BookService {
    private final Faker faker = new Faker();

    public AssertableResponse addNewBook(Book book){
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                        .contentType(ContentType.MULTIPART)
                        .multiPart("name", book.getName())
                        .multiPart("description", book.getDescription())
                        .multiPart("description_html", book.getDescriptionHtml())
                        .multiPart("image", RandomTestData.getBookCover(), "image/jpg")
                        .post("api/books")
                        .then();

        book.setId(response.extract().jsonPath().getInt("id"));
        return new AssertableResponse(response);
    }

    public AssertableResponse getAvailableBooksList() {
        ValidatableResponse response =  given().spec(BaseTest.getSpecification())
                .get("api/books")
                .then();
        return new AssertableResponse(response);
    }

    public AssertableResponse getBookById(Integer id){
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .get("api/books/"+id)
                .then();
        return new AssertableResponse(response);
    }

    public AssertableResponse updateBookById(Book originalBook) {
        Book updatedBook = RandomTestData.getRandomBook();

        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .contentType(ContentType.MULTIPART)
                .multiPart("name", updatedBook.getName())
                .multiPart("description", updatedBook.getDescription())
                .multiPart("description_html", updatedBook.getDescriptionHtml())
                .multiPart("image", RandomTestData.getBookCover(), "image/jpg")
                .put("api/books/" + originalBook.getId())
                .then();

        return new AssertableResponse(response);
    }
    public AssertableResponse deleteBookById(Book book) {
        ValidatableResponse response = given().spec(BaseTest.getSpecification())
                .delete("api/books/" + book.getId())
                .then();

        return new AssertableResponse(response);
    }

}
