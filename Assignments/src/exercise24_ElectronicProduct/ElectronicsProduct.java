package exercise24_ElectronicProduct;

public class ElectronicsProduct {
    protected String productId;
    protected String name;
    protected double price;

    public ElectronicsProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountPercent) {
        price -= price * (discountPercent / 100);
    }

    public double getFinalPrice() {
        return price;
    }
}


 