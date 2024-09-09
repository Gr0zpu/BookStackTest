package api.assertions.conditions;

import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
public class IdCondition extends ValidateStep implements Condition{
    private final Integer userId;
    @Override
    public void check(ValidatableResponse response) {
        Integer getIdFromResponse = response.extract().jsonPath().getInt("id");
        validateStep("Validate user ID condition",
                () -> assertEquals(userId, getIdFromResponse));
    }
}
