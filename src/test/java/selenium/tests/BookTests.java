package selenium.tests;

import api.models.book.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import selenium.base.BaseTest;
import selenium.pages.LoginPage;
import selenium.services.DataService;
import utils.RandomTestData;

public class BookTests extends BaseTest {
    private Book book;
    private DataService dataService;

    @BeforeEach
    public void openSiteAndLogin() {
        book = RandomTestData.getRandomBook();
        dataService = new DataService(getDriver());
        getDriver().get(getBaseUrl() + "login");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterLogin(getAppConfig().webAdminLogin())
                .enterPassword(getAppConfig().webAdminPassword())
                .clickLoginBtn();
    }
    @Test
    @Tag("UI")
    @Tag("Positive")
    @Tag("Positive")
    public void createNewBookTest() {
        dataService
                .createNewBook(book)
                .should().assertBookTitle(book)
                         .assertBookDescription(book);
    }
    @Test
    @Tag("UI")
    @Tag("Selenium")
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
    @Tag("Selenium")
    @Tag("Positive")
    public void editBookTest() {
        Book dataBookForEdit = RandomTestData.getRandomBook();
        dataService.createNewBook(book).editBook()
                .editName(dataBookForEdit.getName())
                .editDescription(dataBookForEdit.getDescription())
                .saveBook().should()
                            .assertBookDescription(dataBookForEdit)
                            .assertBookTitle(dataBookForEdit);
    }

    @Test
    @Tag("UI")
    @Tag("Selenium")
    @Tag("Positive")
    public void copyBookTest() {
        Book newBook = new Book();
        newBook.setName(RandomTestData.getUniqString(book.getName()));
        dataService.createNewBook(book)
                .copyBook()
                .setNewBookName(newBook.getName())
                .confirmCopyBook()
                .getHeader().openBooksPage()
                .getAllBooksTitles().should()
                                    .assertBookAvailable(newBook);
    }

    @Test
    @Tag("UI")
    @Tag("Selenium")
    @Tag("Positive")
    public void addPageTest() {

    }
}
