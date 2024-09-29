package api.tests;

import api.assertions.Conditions;
import api.assertions.conditions.Condition;
import api.models.book.Book;
import api.models.page.Page;
import api.services.PageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomTestData;

public class PageTests extends BaseTest{
    private Page page;
    private Book book;
    @BeforeEach
    public void initTestData() {
        book = RandomTestData.getRandomBook();
        getBookService().addNewBook(book);
        page = RandomTestData.getRandomPage(book.getId());
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void pageCreateTest() {
        getPageService().addNewPage(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/newPage.json"));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void pageDeleteTest() {
        getPageService().addNewPage(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/newPage.json"));

        getPageService().deletePage(page)
                .should(Conditions.hasStatusCode(204));

        getPageService().getPageById(page)
                .should(Conditions.hasStatusCode(404));
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void pageGetById() {
        getPageService().addNewPage(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/newPage.json"));

        getPageService().getPageById(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/newPage.json"));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void pagesGetList() {
        getPageService().addNewPage(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/newPage.json"));

        getPageService().getPagesList()
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/pagesList.json"))
                .should(Conditions.checkIdInList(page.getId()));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void pageUpdateById() {
        getPageService().addNewPage(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/page/newPage.json"));

        getPageService().updatePageById(page)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.idCondition(page.getId()))
                .should(Conditions.pageUpdateCondition(page));
    }

}
