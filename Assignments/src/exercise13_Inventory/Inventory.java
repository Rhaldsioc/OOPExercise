package exercise13_Inventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public void checkLowInventory(int threshold) {
        System.out.println("Low Inventory Products: - Inventory.java:17");
        for (Product p : products) {
            if (p.getQuantity() < threshold)
                System.out.println("" + p);
        }
    }
}
