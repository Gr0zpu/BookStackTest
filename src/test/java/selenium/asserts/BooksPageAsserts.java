package selenium.asserts;

import api.models.book.Book;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import selenium.pages.BooksPage;
@AllArgsConstructor
public class BooksPageAsserts {
    private BooksPage booksPage;
    @Step
    public BooksPageAsserts assertBookNotAvailable(Book book) {
        Assertions.assertFalse(booksPage.getBooksTitle().contains(book.getName()));
        return new BooksPageAsserts(booksPage);
    }
    @Step
    public BooksPageAsserts assertBookAvailable(Book book) {
        Assertions.assertTrue(booksPage.getBooksTitle().contains(book.getName()));
        return new BooksPageAsserts(booksPage);
    }
}
