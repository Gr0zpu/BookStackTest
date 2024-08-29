package api.assertions.conditions;

import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import api.models.user.User;
import org.junit.jupiter.api.Assertions;

@RequiredArgsConstructor
public class UserUdatedCondition implements Condition{
    private final User baseUser;
    @Override
    public void check(ValidatableResponse response) {
        User updatedUser = response.extract().as(User.class);
        Assertions.assertFalse(updatedUser.equals(baseUser));
    }
}
