import com.vaibhav.core.executor.ApiExecutor;
import com.vaibhav.requests.GetUserApiRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUsersTest {

    @Test
    public void testGetUsersList(){
        GetUserApiRequest getUserApiRequest = new GetUserApiRequest();
        Response response = new ApiExecutor(getUserApiRequest).execute();
        System.out.println(response);

    }
}
