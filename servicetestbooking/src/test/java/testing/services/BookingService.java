package testing.services;

import groovy.util.logging.Slf4j;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Map;

import static constants.Constants.BASE_URL;
import static io.restassured.RestAssured.given;

public class BookingService {

    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4j.class);

    public Response postAuthToken(String userParams) {
        LOGGER.info("Post Auth Token");

        return given().log().all()
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

    public Response getBooking(Map<String, String> queryParams) {
        LOGGER.info("Get Booking");

        if (queryParams.isEmpty()) {
            return given().log().all()
                    .headers("Content-Type", "application/json")
                    .when()
                    .get(BASE_URL + "/booking")
                    .then()
                    .log()
                    .all()
                    .contentType(ContentType.JSON)
                    .extract()
                    .response();
        } else {

            return given().log().all()
                    .headers("Content-Type", "application/json")
                    .when()
                    .queryParams(queryParams)
                    .get(BASE_URL + "/booking")
                    .then()
                    .log()
                    .all()
                    .contentType(ContentType.JSON)
                    .extract()
                    .response();
        }
    }


}
