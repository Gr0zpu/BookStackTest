package api.assertions;

import api.assertions.conditions.*;
import api.models.user.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

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
    public static IdCondition idCondition(Integer id) {
        return new IdCondition(id);
    }
}
