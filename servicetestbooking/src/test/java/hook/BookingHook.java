package hook;

import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BookingHook {

    private final Logger LOGGER = LoggerFactory.getLogger(Slf4j.class);

    @BeforeSuite(alwaysRun = true)
    public void startSuite() {
        LOGGER.info("Booking Service Test Suite started");
    }

    @AfterSuite(alwaysRun = true)
    public void finishSuite() {
        LOGGER.info("Booking Service Test Suite finished");
    }
}
