package org.testing.BookingService;

import dataProvider.BookingDataProvider;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import testing.services.BookingService;

import java.util.Map;

import static org.apache.http.HttpStatus.SC_OK;

public class GetBookingTests extends BookingService {

    @Test(description = "Get /booking - happy path",
            dataProviderClass = BookingDataProvider.class,
            dataProvider = "queryParamsForGetBooking")
    public void getBookingHappyPath(String firstname, String value) {
        Response response = getBooking(Map.of(firstname, value));
        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }
}
