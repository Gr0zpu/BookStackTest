package api.assertions;

import api.assertions.conditions.StatusCodeCondition;
import api.assertions.conditions.UserIdCondition;
import api.assertions.conditions.UserUdatedCondition;
import api.models.user.User;

public class Conditions {
    public static StatusCodeCondition hasStatusCode(Integer expectedStatusCode){
        return new StatusCodeCondition(expectedStatusCode);
    }

    public static UserIdCondition idIsEqual(User user){
        return new UserIdCondition(user);
    }

    public static UserUdatedCondition userUpdated(User user){
        return new UserUdatedCondition(user);
    }
}
