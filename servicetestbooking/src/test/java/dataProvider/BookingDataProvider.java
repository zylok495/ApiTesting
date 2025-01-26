package dataProvider;

import org.testng.annotations.DataProvider;

public class BookingDataProvider {

    @DataProvider(name = "valid-credentials")
    public Object[][] validCredentialsDataProvider() {
        return new Object[][]{{"{\"username\" : \"admin\",\"password\" : \"password123\"}"}};
    }

    @DataProvider(name = "invalid-username")
    public Object[][] invalidUsernameDataProvider() {
        return new Object[][]{{"{\"username\" : \"bad\",\"password\" : \"password123\"}"}};
    }

    @DataProvider(name = "firstnameQueryParams")
    public Object[][] firstnameQueryParamsForGetBookingDataProvider() {
        return new Object[][]{{"firstname", "sally"}};
    }

    @DataProvider(name = "lastnameQueryParams")
    public Object[][] lastnameQueryParamsForGetBookingDataProvider() {
        return new Object[][] {{"lastname", "brown"}};
    }

    @DataProvider(name = "firstnameAndLastnameQueryParams")
    public Object[][] firstnameAndLastnameQueryParamsForGetBookingDaraProvider() {
        return new Object[][] {{"firstname", "sally", "lastname", "brown"}};
    }
}
