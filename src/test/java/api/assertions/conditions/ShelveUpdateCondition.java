package api.assertions.conditions;

import api.models.shelve.Shelve;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;

import static org.junit.jupiter.api.Assertions.assertFalse;

@RequiredArgsConstructor
public class ShelveUpdateCondition extends ValidateStep implements Condition{
    private final Shelve baseShelve;
    @Override
    public void check(ValidatableResponse response) {
        Shelve updatedShelve = response.extract().as(Shelve.class);
        validateStep("Validate shelve update condition",
                ()-> assertFalse(updatedShelve.equals(baseShelve)));
    }
}
