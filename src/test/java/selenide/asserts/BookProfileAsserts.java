package selenide.asserts;

import api.models.book.Book;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import selenide.pages.BookProfilePage;
import selenide.pages.MainPage;
import utils.AppConfig;


public class BookProfileAsserts {
    private BookProfilePage profilePage;
    private AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    public BookProfileAsserts(BookProfilePage profilePage) {
        this.profilePage = profilePage;
    }
    public BookProfileAsserts assertBookTitle(Book book) {
        Assertions.assertEquals(book.getName(), profilePage.getBookTitle());
        return this;
    }
    public BookProfileAsserts assertBookDescription(Book book) {
        Assertions.assertEquals(book.getDescription(), profilePage.getBookDescription());
        return this;
    }

}
