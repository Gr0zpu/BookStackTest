package api.assertions.conditions;

import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import api.models.user.User;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
public class UserIdCondition extends ValidateStep implements Condition{
    private final User user;
    @Override
    public void check(ValidatableResponse response) {
        User getUser = response.extract().as(User.class);

        validateStep("Validate user ID condition",
                () -> assertEquals(getUser.getId(), user.getId()));
    }
}
