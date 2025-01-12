package testing.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static constants.Constants.BASE_URL;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class BookingService {

    public static final Logger LOGGER = Logger.getLogger(BookingService.class);

    public Response postAuthToken(String userParams) {
        LOGGER.info("Post Auth Token");

        return given()
                .headers("Content-Type", "application/json")
                .body(userParams)
                .when()
                .post(BASE_URL + "/auth")
                .then()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }

    public Response getBooking() {
        LOGGER.info("Get Booking");

        return  given()
                .headers("Content-Type", "application/json")
                .when()
                .get(BASE_URL + "/booking")
                .then()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }


}
