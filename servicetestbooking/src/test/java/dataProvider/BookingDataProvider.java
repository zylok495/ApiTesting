package dataProvider;

import org.testng.annotations.DataProvider;

public class BookingDataProvider {

    @DataProvider (name = "data-provider")
    public Object[][] bookingDataProvider() {
        return new Object[][] {{"{\"username\" : \"admin\",\"password\" : \"password123\"}"}};
    }
}
