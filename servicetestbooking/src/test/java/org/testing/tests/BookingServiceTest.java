package org.testing.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import testing.services.BookingService;

import static org.hamcrest.MatcherAssert.assertThat;


public class BookingServiceTest {

    public BookingService getBookingService = new BookingService();

    @Test
    public void asd() {
        String userParams = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
        Response response = getBookingService.postAuthToken(userParams);
        assertThat("Not successfull", response.getStatusCode() == 200);
        System.out.println(response.print());

    }

}
