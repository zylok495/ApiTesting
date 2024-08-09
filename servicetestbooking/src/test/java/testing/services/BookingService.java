package testing.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;

import java.util.logging.LogManager;

public class BookingService {

    public static final Logger LOGGER = Logger.getLogger(BookingService.class);

    public Response postAuthToken(String userParams) {
        LOGGER.info("Post Auth Token");

        RequestSpecification request = RestAssured.given();
        request.contentType(ContentType.JSON);
        request.baseUri("https://restful-booker.herokuapp.com/auth");
        request.body(userParams);
        return request.post();
    }


}
