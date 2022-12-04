package core.api.request;

import io.restassured.builder.RequestSpecBuilder;

public class Request {

    public static RequestSpecBuilder getUsersListRequest(){
        RequestBuilder request = new RequestBuilder();
        return request.setBaseUri("https://reqres.in/api/users")
                .addQueryParam("page",2);
    }

}
