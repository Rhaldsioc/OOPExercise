package exercise21_Vehicle;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: - Vehicle.java:15" + make + ", Model: " + model + ", Year: " + year);
    }
}
