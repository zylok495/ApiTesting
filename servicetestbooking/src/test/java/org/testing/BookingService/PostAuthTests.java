package org.testing.BookingService;

import dataProvider.BookingDataProvider;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testing.services.BookingService;

import static constants.Constants.TOKEN_GENERATION_FAILED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;


public class PostAuthTests extends BookingService {


    @Test(description = "POST /auth - happy path", dataProvider = "validCredentialsDataProvider",
            dataProviderClass = BookingDataProvider.class)
    public void postAuthHappyPath(String val) {
        Response response = postAuthToken(val);
        assertThat(TOKEN_GENERATION_FAILED, response.getStatusCode() == SC_OK);
        System.out.println(response.print());
    }

    @Test(description = "POST /auth - invalid username", dataProvider = "invalid-username",
            dataProviderClass = BookingDataProvider.class)
    public void postAuthInvalidUsername(String val) {
        Response response = postAuthToken(val);
        assertThat(TOKEN_GENERATION_FAILED, response.getStatusCode() == SC_OK);

        System.out.println(response.print());
    }

}
