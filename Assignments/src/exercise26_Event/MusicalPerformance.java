package exercise26_Event;

import java.util.ArrayList;

public class MusicalPerformance extends Event {
    private ArrayList<String> performers;

    public MusicalPerformance(String eventName, String date, String location) {
        super(eventName, date, location);
        performers = new ArrayList<>();
    }

    public void addPerformer(String name) {
        performers.add(name);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: - MusicalPerformance.java:20" + performers);
    }
}
