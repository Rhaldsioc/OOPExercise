package exercise24_ElectronicProduct;

public class WashingMachine extends ElectronicsProduct {
    private int warrantyYears;

    public WashingMachine(String productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    public void extendWarranty(int extraYears) {
        warrantyYears += extraYears;
    }

    public void displayDetails() {
        System.out.println("Product: - WashingMachine.java:16" + name + ", Price: " + price + ", Warranty: " + warrantyYears + " years");
    }
}
