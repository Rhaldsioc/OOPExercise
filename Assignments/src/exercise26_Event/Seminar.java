package exercise26_Event;

public class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Speakers: - Seminar.java:14" + numberOfSpeakers);
    }
}
