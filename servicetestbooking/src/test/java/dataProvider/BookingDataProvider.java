package dataProvider;

import org.testng.annotations.DataProvider;

public class BookingDataProvider {

    @DataProvider (name = "valid-credentials")
    public Object[][] validCredentialsDataProvider() {
        return new Object[][] {{"{\"username\" : \"admin\",\"password\" : \"password123\"}"}};
    }

    @DataProvider (name = "invalid-username")
    public Object[][] invalidUsernameDataProvider() {
        return new Object[][] {{"{\"username\" : \"bad\",\"password\" : \"password123\"}"}};
    }
}
