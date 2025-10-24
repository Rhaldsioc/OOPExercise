package exercise22_Costumer;

import java.util.ArrayList;

public class Customer {
    protected String name;
    protected String email;
    protected ArrayList<Double> purchases = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(double amount) {
        purchases.add(amount);
    }

    public double getTotalExpenditure() {
        double total = 0;
        for (double p : purchases) total += p;
        return total;
    }
}
