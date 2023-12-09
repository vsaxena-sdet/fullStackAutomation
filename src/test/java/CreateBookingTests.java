import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaibhav.core.executor.ApiExecutor;
import com.vaibhav.models.createBooking.BookingDates;
import com.vaibhav.models.createBooking.CreateBooking;
import com.vaibhav.requests.CreateBookingRequest;
import com.vaibhav.utils.JsonHelperUtil;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateBookingTests {

    @Test
    public void testCreateBooking (){
        CreateBooking createBooking = new CreateBooking();
        BookingDates bookingDates = new BookingDates();
        createBooking.setFirstname("Vaibhav");
        createBooking.setLastname("Saxena");
        createBooking.setTotalprice(111);
        createBooking.setDepositpaid(true);
        bookingDates.setCheckin("2018-01-01");
        bookingDates.setCheckout("2019-01-01");
        createBooking.setBookingdates(bookingDates);
        createBooking.setAdditionalneeds("Breakfast");
        String jsonString = JsonHelperUtil.convertObjectToJsonString(createBooking);
        CreateBookingRequest createBookingRequest = new CreateBookingRequest(jsonString);
        Response apiResponse = new ApiExecutor(createBookingRequest).setRequestContext().updateRequestContext().execute();
    }
}
