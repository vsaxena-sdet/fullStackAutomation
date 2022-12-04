import core.api.request.Request;
import core.api.request.RequestBuilder;
import core.api.response.ApiExecutor;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class testClass {

    @Test
    public void testGetUsersList(){
        Response response = ApiExecutor.makeGetApiCall(Request.getUsersListRequest());
        response.prettyPrint();
    }
}
