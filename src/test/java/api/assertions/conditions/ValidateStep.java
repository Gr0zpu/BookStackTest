package api.assertions.conditions;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class ValidateStep {
    @Step("{description}")
    public void validateStep(String description, Runnable assertion) {
        try {
            assertion.run();
            Allure.addAttachment(description, "Assertion passed");
        } catch (AssertionError e) {
            Allure.addAttachment(description, "Assertion failed: " + e.getMessage());
            throw e;
        }
    }
}
