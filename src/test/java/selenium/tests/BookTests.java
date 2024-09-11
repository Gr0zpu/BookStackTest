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
    private Book book = RandomTestData.getRandomBook();
    @BeforeEach
    public void openSiteAndLogin() {
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
}
