package exercise28_Reservation;

public class Reservation {
    protected String reservationId;
    protected String customerName;
    protected String date;

    public Reservation(String reservationId, String customerName, String date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

    public void displayReservation() {
        System.out.println("Reservation ID: - Reservation.java:15" + reservationId + " | Customer: " + customerName + " | Date: " + date);
    }
}

class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationId, String customerName, String date, int roomNumber) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
    }

    public void modifyRoom(int newRoom) {
        this.roomNumber = newRoom;
        System.out.println("Room updated to: - Reservation.java:29" + newRoom);
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Room Number: - Reservation.java:35" + roomNumber);
    }
}

class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationId, String customerName, String date, String seatNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
    }

    public void modifySeat(String newSeat) {
        this.seatNumber = newSeat;
        System.out.println("Seat updated to: - Reservation.java:49" + newSeat);
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Seat Number: - Reservation.java:55" + seatNumber);
    }
}
