package exercise27_CostumerOrder;

public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("ORD123", "Juan Dela Cruz", "2025-04-01", "Manila, Philippines", "TRK001");
        order.displayOrder();
        order.calculateDeliveryTime();

        System.out.println("\nUpdating status...  CostumerOrderMain.java:9 - CustomerOrderMain.java:9");
        order.updateTrackingStatus("Delivered");
        order.displayOrder();
    }
}
