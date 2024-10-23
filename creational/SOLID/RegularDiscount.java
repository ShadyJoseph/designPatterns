package SOLID;

// Regular customer discount implementation
public class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double orderAmount) {
        return orderAmount - (orderAmount * 0.1);
    }
}