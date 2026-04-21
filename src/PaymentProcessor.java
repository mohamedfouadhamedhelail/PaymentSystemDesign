public class PaymentProcessor {

    private PaymentMethod paymentMethod;
    private DiscountStrategy discountStrategy;

    public PaymentProcessor(PaymentMethod paymentMethod, DiscountStrategy discountStrategy) {
        this.paymentMethod = paymentMethod;
        this.discountStrategy = discountStrategy;
    }

    public void process(double amount) {
        double finalAmount = discountStrategy.applyDiscount(amount);
        paymentMethod.pay(finalAmount);
    }
}
