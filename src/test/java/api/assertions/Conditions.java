package api.assertions;

import api.assertions.conditions.JsonSchemeValidate;
import api.assertions.conditions.StatusCodeCondition;
import api.assertions.conditions.UserIdCondition;
import api.assertions.conditions.UserUpdatedCondition;
import api.models.user.User;

public class Conditions {
    public static StatusCodeCondition hasStatusCode(Integer expectedStatusCode){
        return new StatusCodeCondition(expectedStatusCode);
    }

    public static UserIdCondition idIsEqual(User user){
        return new UserIdCondition(user);
    }

    public static UserUpdatedCondition userUpdated(User user){
        return new UserUpdatedCondition(user);
    }

    public static JsonSchemeValidate jsonScheme(String jsonSchemePath){

        return new JsonSchemeValidate(jsonSchemePath);
    }
}
