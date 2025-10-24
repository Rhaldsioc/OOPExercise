package exercise26_Event;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Tech Summit", "2025-05-10", "Cebu City", 5);
        MusicalPerformance concert = new MusicalPerformance("Summer Beats", "2025-05-10", "Cebu City");

        concert.addPerformer("SB19");
        concert.addPerformer("Moira Dela Torre");

        seminar.displayDetails();
        System.out.println();
        concert.displayDetails();

        System.out.println("\nConflict: - EventMain.java:15" + seminar.hasConflict(concert.date, concert.location));
    }
}
