package org.testing.BookingService;

import dataProvider.BookingDataProvider;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import testing.services.BookingService;

import static org.apache.http.HttpStatus.SC_OK;

public class PostAuthTests extends BookingService {


    @Test(description = "POST /auth - happy path", dataProvider = "valid-credentials",
            dataProviderClass = BookingDataProvider.class)
    public void postAuthHappyPath(String userCredentials) {
        Response response = postAuthToken(userCredentials);
        Assert.assertEquals(response.getStatusCode(), SC_OK);

    }

    @Test(description = "POST /auth - invalid username", dataProvider = "invalid-username",
            dataProviderClass = BookingDataProvider.class)
    public void postAuthInvalidUsername(String val) {
        Response response = postAuthToken(val);
        Assert.assertEquals(response.getStatusCode(), SC_OK);
        Assert.assertTrue(response.asString().contains("Bad credentials"));
    }

}
