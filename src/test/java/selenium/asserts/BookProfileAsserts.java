package selenium.asserts;

import api.models.book.Book;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import selenium.pages.BookProfilePage;
import selenium.pages.BooksPage;

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

}
