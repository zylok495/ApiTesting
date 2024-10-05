package org.testing.BookingService;

import dataProvider.BookingDataProvider;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testing.services.BookingService;

import static org.hamcrest.MatcherAssert.assertThat;


public class PostAuthTests {

    public BookingService getBookingService = new BookingService();

    @Test(description = "POST /auth - happy path", dataProvider = "data-provider",
            dataProviderClass = BookingDataProvider.class)
    public void postAuthHappyPath(String val) {
        Response response = getBookingService.postAuthToken(val);
        assertThat("Not successfull", response.getStatusCode() == 200);
        System.out.println(response.print());
    }

}
