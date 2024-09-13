package selenium.asserts;

import api.models.book.Book;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import selenium.pages.BooksPage;
@AllArgsConstructor
public class BooksPageAsserts {
    private BooksPage booksPage;

    public BooksPageAsserts bookNotAvailable(Book book) {
        Assertions.assertFalse(booksPage.getBooksTitle().contains(book.getName()));
        return new BooksPageAsserts(booksPage);
    }
}
