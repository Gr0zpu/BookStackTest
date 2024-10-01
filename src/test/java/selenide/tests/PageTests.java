package selenide.tests;

import api.models.book.Book;
import api.models.page.Page;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import selenide.base.BaseTest;
import selenide.services.DataService;
import utils.RandomTestData;

public class PageTests extends BaseTest {
    private Book book;
    private DataService dataService;
    private Page page;
    @BeforeEach
    public void testSetUp() {
        dataService = new DataService();
        book = RandomTestData.getRandomBook();
        page = RandomTestData.getRandomPage(1);
        login();
        Selenide.open();
    }

    @Test
    @Tag("UI")
    @Tag("Selenide")
    @Tag("Positive")
    public void addPageTest() {
        dataService.createNewBook(book)
                .createNewPage()
                .setPageName(page)
                .setPageContent(page)
                .savePage().openBookPage()
                .should().assertPageOrChapterName(page)
                .assertPageOrChapterDescription(page);
    }
}
