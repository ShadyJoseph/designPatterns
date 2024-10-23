package SOLID;

// Usage example
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Notification emailNotification = new EmailNotification();
        System.out.println();
        OrderProcessor orderProcessor = new OrderProcessor(emailNotification);

        // Process orders for different customer types
        orderProcessor.processOrder(new RegularDiscount(), 100.0);
        System.out.println();
        orderProcessor.processOrder(new PremiumDiscount(), 100.0);
    }
}
