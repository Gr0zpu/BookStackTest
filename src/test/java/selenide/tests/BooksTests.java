package selenide.tests;

import api.models.book.Book;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenide.base.BaseTest;
import selenide.pages.BookProfilePage;
import selenide.pages.LoginPage;
import selenide.pages.MainPage;
import utils.RandomTestData;

public class BooksTests extends BaseTest {
    private Book book;
    @BeforeEach
    public void testSetUp() {
        book = RandomTestData.getRandomBook();
        login();
        Selenide.open();
    }
    @Test
    public void createNewBookTest() {
       new MainPage().getHeader().openBooksPage()
                .createNewBook()
                .enterBookName(book.getName())
                .enterDescription(book.getDescription())
                .addCover()
                .addTags(book.getTags())
                .saveBook().should()
                           .assertBookTitle(book)
                           .assertBookDescription(book);
    }
    @Test
    public void deleteBookTest() {
        new MainPage().getHeader().openBooksPage()
                .createNewBook()
                .enterBookName(book.getName())
                .enterDescription(book.getDescription())
                .addCover()
                .addTags(book.getTags())
                .saveBook()
                .deleteBook()
                .confirmDelete().getAllBooksTitles()
                .should()
                .bookNotAvailable(book);
    }
}
