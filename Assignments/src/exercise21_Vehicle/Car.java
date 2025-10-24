package exercise21_Vehicle;

public class Car extends Vehicle {
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: - Car.java:14" + trunkSize + " cubic feet");
    }
}
