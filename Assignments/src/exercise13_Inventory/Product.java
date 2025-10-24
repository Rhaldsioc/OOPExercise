package exercise13_Inventory;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name + " (Qty: " + quantity + ")";
    }
}
