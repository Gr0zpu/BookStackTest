package selenium.tests;

import api.models.book.Book;
import api.models.page.Page;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import selenium.base.BaseTest;
import selenium.pages.LoginPage;
import selenium.services.DataService;
import utils.RandomTestData;

public class PageTests extends BaseTest {
    private Book book;
    private DataService dataService;
    private Page page;

    @BeforeEach
    public void openSiteAndLogin() {
        book = RandomTestData.getRandomBook();
        page = RandomTestData.getRandomPage(1);
        dataService = new DataService(getDriver());
        getDriver().get(getBaseUrl() + "login");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterLogin(getAppConfig().webAdminLogin())
                .enterPassword(getAppConfig().webAdminPassword())
                .clickLoginBtn();
    }

    @Test
    @Tag("UI")
    @Tag("Selenium")
    @Tag("Positive")
    public void addPageTest() {
        dataService.createNewBook(book)
                .createPage()
                .setPageName(page.getName())
                .enterPageContent(page.getHtml())
                .savePage().openBookPage()
                .should().assertPageOrChapterName(page)
                         .assertsPageOrChapterDescription(page);
    }
}
