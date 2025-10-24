package exercise22_Costumer;

public class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer c1 = new LoyalCustomer("Maria", "maria@gmail.com", 10);
        c1.addPurchase(500);
        c1.addPurchase(1500);

        System.out.println("Total before discount: - CustomerMain.java:9" + c1.getTotalExpenditure());
        System.out.println("Total after discount: - CustomerMain.java:10" + c1.applyDiscount());
    }
}
