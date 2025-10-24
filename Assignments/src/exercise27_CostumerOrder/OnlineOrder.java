package exercise27_CostumerOrder;

public class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String status;

    public OnlineOrder(String orderId, String customer, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderId, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.status = "Processing";
    }

    public void updateTrackingStatus(String newStatus) {
        this.status = newStatus;
    }

    public void calculateDeliveryTime() {
        System.out.println("Estimated delivery: 35 business days to - OnlineOrder.java:20" + deliveryAddress);
    }

    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Delivery Address: - OnlineOrder.java:26" + deliveryAddress);
        System.out.println("Tracking #: - OnlineOrder.java:27" + trackingNumber);
        System.out.println("Status: - OnlineOrder.java:28" + status);
    }
}
