package exercise21_Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Vios", 2023, 13.5);
        Truck truck = new Truck("Isuzu", "D-Max", 2022, 3.0);

        car.displayDetails();
        System.out.println();
        truck.displayDetails();
    }
}
