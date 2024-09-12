package api.tests;

import api.assertions.Conditions;
import api.models.book.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomTestData;


public class BookTests extends BaseTest{
    private Book book;
    @BeforeEach
    public void initTestBook() {
        book = RandomTestData.getRandomBook();
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void createNewBookTest() {
        getBookService().addNewBook(book)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newBookResponse.json"));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void getAllAvailableBooksList() {
        getBookService().getAvailableBooksList()
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/getBooksList.json"));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void getBookByIdTest() {
        getBookService().addNewBook(book)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newBookResponse.json"));

        getBookService().getBookById(book.getId())
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/getBookById.json"))
                .should(Conditions.idCondition(book.getId()));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void updateBoolTest() {
        getBookService().addNewBook(book)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newBookResponse.json"));

        getBookService().updateBookById(book)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.idCondition(book.getId()))
                .should(Conditions.bookUpdated(book))
                .should(Conditions.jsonScheme("jsonScheme/user/newBookResponse.json"));


    }
}
