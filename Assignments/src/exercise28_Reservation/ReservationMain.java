package exercise28_Reservation;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("RSV001", "Carlos", "2025-11-01", 202);
        RailwayReservation rail = new RailwayReservation("RSV002", "Maria", "2025-11-02", "A12");

        resort.displayReservation();
        resort.modifyRoom(305);
        System.out.println();
        rail.displayReservation();
        rail.modifySeat("B15");
    }
}
