import com.vaibhav.core.executor.ApiExecutor;
import com.vaibhav.requests.GetPetStoreDog;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetPetStoreDogTests {

    @Test
    public void abc (){
        GetPetStoreDog getPetStoreDog = new GetPetStoreDog();
        Response response = new ApiExecutor(getPetStoreDog).execute();
        response.prettyPrint();
    }
}
