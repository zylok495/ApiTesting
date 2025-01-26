package org.testing.BookingService;

import dataProvider.BookingDataProvider;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import testing.services.BookingService;

import java.util.Collections;
import java.util.Map;

import static constants.Constants.REGRESSION;
import static org.apache.http.HttpStatus.SC_OK;

public class GetBookingTests extends BookingService {

    @Test(description = "Get /booking - happy path", groups = REGRESSION)
    public void getBookingHappyPath() {
        Response response = getBooking(Collections.emptyMap());
        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }

    @Test(description = "Get /booking with firstname query - happy path",
            dataProviderClass = BookingDataProvider.class,
            dataProvider = "firstnameQueryParams",
            groups = REGRESSION)
    public void getBookingWithFirstnameQueryHappyPath(String firstname, String value) {
        Response response = getBooking(Map.of(firstname, value));
        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }

    @Test(description = "Get /booking with lastname query - happy path",
            dataProvider = "lastnameQueryParams",
            dataProviderClass = BookingDataProvider.class,
            groups = REGRESSION)
    public void getBookingWithLastnameQueryHappyPath(String lastname, String value) {
        Response response = getBooking(Map.of(lastname, value));
        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }

    @Test(description = "Get /booking with firstname and lastname query - happy path",
            dataProviderClass = BookingDataProvider.class,
            dataProvider = "firstnameAndLastnameQueryParams",
            groups = REGRESSION)
    public void getBookingWithFirstnameAndLastnameQueryHappyPath(String firstname, String fValue,
                                                                 String lastname, String lValue) {
        Response response = getBooking(Map.of(firstname, fValue, lastname, lValue));
        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }
}
