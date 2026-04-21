public class TenPercentDiscount implements DiscountStrategy{
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }

}
