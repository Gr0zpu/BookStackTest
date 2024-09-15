package selenium.tests;

import api.models.book.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenium.base.BaseTest;
import selenium.pages.LoginPage;
import selenium.pages.MainPage;
import utils.RandomTestData;

public class BookTests extends BaseTest {
    private Book book;

    @BeforeEach
    public void openSiteAndLogin() {
        book = RandomTestData.getRandomBook();
        getDriver().get(getBaseUrl() + "login");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterLogin(getAppConfig().webAdminLogin())
                .enterPassword(getAppConfig().webAdminPassword())
                .clickLoginBtn();
    }
    @Test
    public void createNewBookTest() {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.getHeader().openBooksPage()
                .createNewBook()
                .enterBookName(book.getName())
                .enterDescription(book.getDescription())
                .addCover()
                .addTags(book.getTags())
                .saveBook()
                .should().assertBookTitle(book)
                         .assertBookDescription(book);
    }
    @Test
    public void deleteBookTest() {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.getHeader().openBooksPage()
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
    @Test
    public void editBookTest() {
        Book dataBookForEdit = RandomTestData.getRandomBook();
        new MainPage(getDriver()).getHeader().openBooksPage()
                .createNewBook()
                .enterBookName(book.getName())
                .enterDescription(book.getDescription())
                .addCover()
                .addTags(book.getTags())
                .saveBook().editBook()
                .editName(dataBookForEdit.getName())
                .editDescription(dataBookForEdit.getDescription())
                .saveBook().should()
                            .assertBookDescription(dataBookForEdit)
                            .assertBookTitle(dataBookForEdit);
    }
}
