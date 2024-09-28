package api.assertions;

import api.assertions.conditions.*;
import api.models.book.Book;
import api.models.shelve.Shelve;
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
    public static IdCondition idCondition(Integer id) {
        return new IdCondition(id);
    }
    public static BookUpdateCondition bookUpdated(Book book) {
        return new BookUpdateCondition(book);
    }
    public static IdInListCondition checkIdInList(Integer id) {
        return new IdInListCondition(id);
    }
    public static ShelveUpdateCondition shelveUpdateCondition(Shelve shelve) {
        return new ShelveUpdateCondition(shelve);
    }
}
