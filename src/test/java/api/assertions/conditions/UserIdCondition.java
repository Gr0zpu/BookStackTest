package api.assertions.conditions;

import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import api.models.user.User;
import org.junit.jupiter.api.Assertions;

@RequiredArgsConstructor
public class UserIdCondition implements Condition{
    private final User user;
    @Override
    public void check(ValidatableResponse response) {
        User getUser = response.extract().as(User.class);
        Assertions.assertEquals(getUser.getId(), user.getId());
    }
}
