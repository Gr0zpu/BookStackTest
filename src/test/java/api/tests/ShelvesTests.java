package api.tests;

import api.assertions.Conditions;
import api.models.shelve.Shelve;
import api.services.ShelveService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomTestData;

import static io.restassured.RestAssured.given;

public class ShelvesTests extends BaseTest {
    private Shelve shelve;
    @BeforeEach
    public void initTestShelve() {
        shelve = RandomTestData.getRandomShelve();
    }

    @Test
    @Tag("API")
    @Tag("Positive")
    public void shelveCreateTest(){
        getShelveService().addNewShelve(shelve)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/shelve/newShelve.json"));
    }
    @Test
    @Tag("API")
    @Tag("Positive")
    public void getShelveById() {
        getShelveService().addNewShelve(shelve)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/shelve/newShelve.json"));

        getShelveService().getShelveById(shelve)
                .should(Conditions.hasStatusCode(200))
                .should(Conditions.jsonScheme("jsonScheme/user/shelve/getShelveById.json"))
                .should(Conditions.idCondition(shelve.getId()));
    }
}
