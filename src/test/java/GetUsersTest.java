import core.api.request.Request;
import core.api.request.RequestBuilder;
import core.api.response.ApiExecutor;
import core.api.response.ApiResponse;
import core.listners.TestListener;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetUsersTest {

    ApiResponse response = new ApiResponse();

    @Test
    public void testGetUsersList(){
        Response resp = response.getUsersListResponse();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(resp.jsonPath().getInt("page"),2);
        softAssert.assertEquals(resp.jsonPath().getInt("per_page"),6);
        softAssert.assertAll();

    }

    @Test
    public void testGetUsersLis_perPage(){
        Response resp = response.getUsersListResponse();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(resp.jsonPath().getInt("per_page"),7);
        softAssert.assertAll();

    }
}
