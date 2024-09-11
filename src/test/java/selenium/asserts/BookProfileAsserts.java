package selenium.asserts;

import api.models.book.Book;
import org.junit.jupiter.api.Assertions;
import selenium.pages.BookProfilePage;
import selenium.pages.BooksPage;

public class BookProfileAsserts {
    private BookProfilePage profilePage;

    public BookProfileAsserts(BookProfilePage profilePage) {
        this.profilePage = profilePage;
    }

    public BookProfileAsserts assertBookTitle(Book book){
        Assertions.assertEquals(book.getName(),profilePage.getBookTitle());
        return this;
    }
    public BookProfileAsserts assertBookDescription(Book book){
        Assertions.assertEquals(book.getDescription(),profilePage.getBookDescription());
        return this;
    }

}
