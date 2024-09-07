package api.tests;

import api.assertions.Conditions;
import api.models.book.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomTestData;

public class BooKTests extends BaseTest{
    private Book book;
    @BeforeEach
    public void initTestBook() {
        book = RandomTestData.getRandomBook();
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void createNewBookTest() {
        getBookService().addNewBook(getSpecification(), book)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/newBookResponse.json"));
    }
}
