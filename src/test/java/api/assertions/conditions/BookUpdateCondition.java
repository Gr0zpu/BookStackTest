package api.assertions.conditions;

import api.models.book.Book;
import io.restassured.response.ValidatableResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import static org.junit.jupiter.api.Assertions.assertFalse;
@RequiredArgsConstructor
public class BookUpdateCondition extends ValidateStep implements Condition {
    private final Book baseBook;
    @Override
    public void check(ValidatableResponse response) {
        Book updatedBook = response.extract().as(Book.class);
        validateStep("Validate book update condition",
                () -> assertFalse(updatedBook.equals(baseBook)));
    }
}
