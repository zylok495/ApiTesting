package org.testing.tests;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
import testing.services.BookingService;

public class BookingServiceTest {

    public BookingService getBookingService = new BookingService();

    @Test
    public void asd() {
        String userParams = "{\"name\" : \"kanak\",\"password\" : \"kanak123\"}";
        Response response = getBookingService.postAuthToken(userParams);
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        System.out.println(response.getStatusCode());

    }

}
