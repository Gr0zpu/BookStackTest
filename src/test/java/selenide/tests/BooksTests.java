package selenide.tests;

import api.models.book.Book;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import selenide.base.BaseTest;
import selenide.services.DataService;
import utils.RandomTestData;

public class BooksTests extends BaseTest {
    private Book book;
    private DataService dataService;
    @BeforeEach
    public void testSetUp() {
        dataService = new DataService();
        book = RandomTestData.getRandomBook();
        login();
        Selenide.open();
    }
    @Test
    @Tag("UI")
    @Tag("Selenide")
    @Tag("Positive")
    public void createNewBookTest() {
       dataService.createNewBook(book)
               .should()
                           .assertBookTitle(book)
                           .assertBookDescription(book);
    }
    @Test
    @Tag("UI")
    @Tag("Selenide")
    @Tag("Positive")
    public void deleteBookTest() {
        dataService.createNewBook(book)
                    .deleteBook()
                    .confirmDelete().getAllBooksTitles()
                    .should()
                    .assertBookNotAvailable(book);
    }
    @Test
    @Tag("UI")
    @Tag("Selenide")
    @Tag("Positive")
    public void editBookTest() {
        String bookName = book.getName();
        Book updatedBook = RandomTestData.getRandomBook();
        dataService.createNewBook(book)
                    .editBook()
                    .editName(updatedBook.getName())
                    .editDescription(updatedBook.getDescription())
                    .saveBook().should()
                                .assertBookTitle(updatedBook)
                                .assertBookDescription(updatedBook);
    }
    @Test
    @Tag("UI")
    @Tag("Selenide")
    @Tag("Positive")
    public void copyBookTest() {
        Book newBook = new Book();
        newBook.setName(RandomTestData.getUniqString(book.getName()));
        dataService.createNewBook(book)
                .copyBook()
                .setNewBookName(newBook.getName())
                .confirmBookCopy()
                .getHeader().openBooksPage()
                .getAllBooksTitles().should()
                                    .assertBookAvailable(newBook);
    }
}
