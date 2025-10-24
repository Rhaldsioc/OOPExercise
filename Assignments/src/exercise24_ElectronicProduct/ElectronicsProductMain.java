package exercise24_ElectronicProduct;

public class ElectronicsProductMain {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("WM01", "Samsung Turbo", 25000, 2);
        wm.applyDiscount(10);
        wm.extendWarranty(1);
        wm.displayDetails();
    }
}
