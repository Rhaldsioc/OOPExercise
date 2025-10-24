package exercise22_Costumer;

public class LoyalCustomer extends Customer {
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount() {
        return getTotalExpenditure() * (1 - discountRate / 100);
    }
}
