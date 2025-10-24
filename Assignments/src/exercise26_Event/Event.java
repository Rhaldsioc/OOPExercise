package exercise26_Event;

public class Event {
    protected String eventName;
    protected String date;
    protected String location;

    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event: - Event.java:15" + eventName + ", Date: " + date + ", Location: " + location);
    }

    public boolean hasConflict(String otherDate, String otherLocation) {
        return this.date.equals(otherDate) && this.location.equalsIgnoreCase(otherLocation);
    }
}
