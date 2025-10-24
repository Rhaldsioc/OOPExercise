package exercise27_CostumerOrder;

public class CustomerOrder {
    protected String orderId;
    protected String customer;
    protected String orderDate;

    public CustomerOrder(String orderId, String customer, String orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public void displayOrder() {
        System.out.println("Order ID: - CustomerOrder.java:15" + orderId + ", Customer: " + customer + ", Date: " + orderDate);
    }
}
