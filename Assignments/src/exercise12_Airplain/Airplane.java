package exercise12_Airplain;
public class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public void delayFlight() {
        delayed = true;
    }

    public void checkStatus() {
        if (delayed)
            System.out.println("Flight - Airplane.java:21" + flightNumber + " is delayed.");
        else
            System.out.println("Flight - Airplane.java:23" + flightNumber + " is on time.");
    }
}
