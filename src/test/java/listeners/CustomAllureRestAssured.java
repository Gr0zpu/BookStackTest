package listeners;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import io.qameta.allure.Allure;

public class CustomAllureRestAssured extends AllureRestAssured {

    public CustomAllureRestAssured() {
        setRequestTemplate("alt_request.ftl");
        setResponseTemplate("response.ftl");
    }

}