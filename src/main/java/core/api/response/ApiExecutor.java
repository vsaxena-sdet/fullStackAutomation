package core.api.response;

import core.api.request.Request;
import core.api.request.RequestBuilder;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiExecutor {


    public static Response makeGetApiCall(RequestSpecBuilder request){
        return RestAssured
                .given()
                .log()
                .all()
                .when()
                .spec(request.build())
                .log()
                .all()
                .request(Method.GET);


    }


}
