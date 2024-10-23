package SOLID;

// OrderProcessor class handling order processing
public class OrderProcessor {
    private final Notification notification;

    public OrderProcessor(Notification notification) {
        this.notification = notification;
    }

    public void processOrder(DiscountStrategy discountStrategy, double orderAmount) {
        System.out.println("Processing order of amount: " + orderAmount);
        orderAmount = discountStrategy.applyDiscount(orderAmount);
        notification.send("Order placed. Order amount: " + orderAmount);
    }
}

