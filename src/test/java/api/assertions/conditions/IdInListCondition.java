package api.assertions.conditions;

import io.restassured.response.ValidatableResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@RequiredArgsConstructor
public class IdInListCondition extends ValidateStep implements Condition{
    private final Integer dataId;
    @Override
    public void check(ValidatableResponse response) {
        List<Integer> idList = response.extract().jsonPath().getList("data.id", Integer.class);

        validateStep("Validate Id list contains ID",
                () -> assertTrue(idList.contains(dataId)));

    }
}
