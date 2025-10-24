package exercise13_Inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product("Rice", 50));
        inv.addProduct(new Product("Sugar", 10));
        inv.addProduct(new Product("Salt", 5));

        inv.checkLowInventory(15);
    }
}
