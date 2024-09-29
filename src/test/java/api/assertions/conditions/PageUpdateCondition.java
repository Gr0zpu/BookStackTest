package api.assertions.conditions;

import api.models.page.Page;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;

import static org.junit.jupiter.api.Assertions.assertFalse;

@RequiredArgsConstructor
public class PageUpdateCondition extends ValidateStep implements Condition {
    private final Page basePage;
    @Override
    public void check(ValidatableResponse response) {
        Page updatedPage = response.extract().as(Page.class);

        validateStep("Validate page update condition",
                () -> assertFalse(updatedPage.equals(basePage)));
    }
}
