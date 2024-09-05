package api.assertions.conditions;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
public class StatusCodeCondition extends ValidateStep implements Condition {
    private final Integer statusCode;
    @Override
    public void check(ValidatableResponse response) {
        int actualStatus = response.extract().statusCode();

        validateStep("Validate status code condition",
                () -> assertEquals(statusCode, actualStatus));
    }
}
