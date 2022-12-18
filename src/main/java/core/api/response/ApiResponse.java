package core.api.response;

import core.api.request.Request;
import io.restassured.response.Response;

public class ApiResponse {

    public Response getUsersListResponse(){
        return ApiExecutor.makeGetApiCall(Request.getUsersListRequest());
    }
}
