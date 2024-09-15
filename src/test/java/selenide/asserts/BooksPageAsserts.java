package selenide.asserts;

import api.models.book.Book;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import selenide.pages.BooksPage;

@AllArgsConstructor
public class BooksPageAsserts {
    private BooksPage booksPage;
@Step
    public BooksPageAsserts bookNotAvailable(Book book) {
        Assertions.assertFalse(booksPage.getBooksTitles().contains(book.getName()));
        return new BooksPageAsserts(booksPage);
    }
}
