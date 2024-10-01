package selenium.asserts;

import api.models.book.Book;
import api.models.page.Page;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import selenium.pages.BookProfilePage;

import java.util.List;

public class BookProfileAsserts {
    private BookProfilePage profilePage;

    public BookProfileAsserts(BookProfilePage profilePage) {
        this.profilePage = profilePage;
    }
    @Step
    public BookProfileAsserts assertBookTitle(Book book){
        Assertions.assertEquals(book.getName(),profilePage.getBookTitle());
        return this;
    }
    @Step
    public BookProfileAsserts assertBookDescription(Book book){
        Assertions.assertEquals(book.getDescription(),profilePage.getBookDescription());
        return this;
    }
    @Step
    public BookProfileAsserts assertPageOrChapterName(Page page) {
        Assertions.assertTrue(profilePage.getAllPageAndChapterNames().contains(page.getName()));
        return this;
    }

    @Step
    public BookProfileAsserts assertsPageOrChapterDescription(Page page) {
        if (!page.getHtml().isEmpty()) {
            List<String> allDescription = profilePage.getAllPageAndChapterDescription();
            String description;
            if (page.getHtml().length() > 90) {
                description = page.getHtml().substring(0, 90).replaceAll("\n", " ");
            } else {
                description = page.getHtml().replaceAll("\n", " ");
            }
            Assertions.assertTrue(checkSubstringInList(allDescription, description));
        }

        return this;
    }


    public Boolean checkSubstringInList(List<String> list, String string) {
        return list.stream().anyMatch(x -> x.contains(string));
    }

}
