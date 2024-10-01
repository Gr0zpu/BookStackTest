package selenide.asserts;

import api.models.book.Book;
import api.models.page.Page;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import selenide.pages.BookProfilePage;
import selenide.pages.MainPage;
import utils.AppConfig;

import java.util.List;


public class BookProfileAsserts {
    private BookProfilePage profilePage;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    public BookProfileAsserts(BookProfilePage profilePage) {
        this.profilePage = profilePage;
    }
    @Step
    public BookProfileAsserts assertBookTitle(Book book) {
        Assertions.assertEquals(book.getName(), profilePage.getBookTitle());
        return this;
    }
    @Step
    public BookProfileAsserts assertBookDescription(Book book) {
        Assertions.assertEquals(book.getDescription(), profilePage.getBookDescription());
        return this;
    }
    @Step
    public BookProfileAsserts assertPageOrChapterName(Page page) {
        System.out.println(profilePage.getAllPageAndChapterNames().toString());
        System.out.println(page.getName());
        Assertions.assertTrue(profilePage.getAllPageAndChapterNames().contains(page.getName()));
        return this;
    }

    @Step
    public BookProfileAsserts assertPageOrChapterDescription(Page page) {
        if (!page.getHtml().isEmpty()) {
            List<String> allDescription = profilePage.getAllPageAndChapterDescription();
            String description = page.getHtml().replaceAll("\n", " ");
            if (description.length() > 90) {
                description = description.substring(0, 90);
            }

            Assertions.assertTrue(checkSubstringInList(allDescription, description));
        }
        return this;
    }

    public Boolean checkSubstringInList (List<String> list, String string) {
        return list.stream().anyMatch(x -> x.contains(string));
    }
}
