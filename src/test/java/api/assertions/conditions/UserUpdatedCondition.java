package api.assertions.conditions;

import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import api.models.user.User;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@RequiredArgsConstructor
public class UserUpdatedCondition extends ValidateStep implements Condition{
    private final User baseUser;
    @Override
    public void check(ValidatableResponse response) {
        User updatedUser = response.extract().as(User.class);

        validateStep("Validate user update condition",
                () -> assertFalse(updatedUser.equals(baseUser)));
    }
}
