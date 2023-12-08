package com.vaibhav.core.executor;

import com.vaibhav.enums.HttpMethods;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.Date;

public class BuilderBase {

    private final RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    private HttpMethods method;

    public BuilderBase() {
    }

    public HttpMethods getMethod() {
        return this.method;
    }

    public RequestSpecBuilder getRequestSpecBuilder(){
        return this.requestSpecBuilder;
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
                throw new RuntimeException("API Method not specified");
        }
        return apiResponse;
    }
}