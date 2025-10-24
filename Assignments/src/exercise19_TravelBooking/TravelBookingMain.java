package exercise19_TravelBooking;

public class TravelBookingMain {
    public static void main(String[] args) {
        TravelBooking booking = new TravelBooking();
        booking.searchFlights("Japan");
        booking.searchHotels("Tokyo");
        booking.bookReservation("Flight", "Alice");
        booking.cancelReservation("Hotel", "Alice");
    }
}
