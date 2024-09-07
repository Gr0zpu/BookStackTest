package api.assertions.conditions;

import com.github.fge.jsonschema.main.JsonSchema;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JsonSchemeValidate extends ValidateStep implements Condition {
    private final String jsonSchemeName;
    @Override
    public void check(ValidatableResponse response) {

        validateStep("Validate JSON response against schema",
                () -> response.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(jsonSchemeName)));
    }

}