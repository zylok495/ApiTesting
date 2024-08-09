package testing;

import testing.services.BookingService;

public class BookingBench {

    private final BookingService bookingService;

    public BookingBench() {
        bookingService = new BookingService();
    }

    public BookingService getBookingService() {
        return bookingService;
    }

}
