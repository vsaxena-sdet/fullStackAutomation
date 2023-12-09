package com.vaibhav.core.executor;

import com.vaibhav.enums.HttpMethods;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;

@Getter
public class ApiBuilderBase {

    private final RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    private HttpMethods method;

    public ApiBuilderBase() {
    }

    public void setMethod(HttpMethods method) {
        this.method = method;
    }

    public Response execute() {
        RequestSpecification spec = this.requestSpecBuilder.build();
        Response apiResponse;
        RestAssured.defaultParser = Parser.JSON;
        RestAssuredConfig config = RestAssured.config();

        switch (this.method) {
            case GET:
                apiResponse = RestAssured.given().filter(new RequestLoggingFilter()).config(config).spec(spec).when().get();
                break;
            case POST:
                apiResponse = RestAssured.given().filter(new RequestLoggingFilter()).config(config).spec(spec).when().post();
                break;
            default:
                throw new RuntimeException("Method is not specified");
        }
        return apiResponse;
    }
}