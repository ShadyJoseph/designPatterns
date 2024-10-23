package SOLID;

// Premium customer discount implementation
public class PremiumDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double orderAmount) {
        return orderAmount - (orderAmount * 0.2);
    }
}
