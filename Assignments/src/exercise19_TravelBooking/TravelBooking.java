package exercise19_TravelBooking;

public class TravelBooking {

    public void searchFlights(String destination) {
        System.out.println("Searching flights to - TravelBooking.java:6" + destination + "...");
    }

    public void searchHotels(String destination) {
        System.out.println("Searching hotels in - TravelBooking.java:10" + destination + "...");
    }

    public void bookReservation(String type, String name) {
        System.out.println(type + "reservation booked for - TravelBooking.java:14" + name);
    }

    public void cancelReservation(String type, String name) {
        System.out.println(type + "reservation cancelled for - TravelBooking.java:18" + name);
    }
}
