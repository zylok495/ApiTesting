package org.testing.BookingService;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import testing.services.BookingService;

import static org.apache.http.HttpStatus.SC_OK;

public class GetBookingTests extends BookingService {

    @Test(description = "Get /booking - happy path")
    public void getBookingHappyPath() {
        Response response = getBooking();
        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }
}
