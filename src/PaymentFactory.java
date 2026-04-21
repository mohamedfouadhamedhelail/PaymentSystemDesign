public class PaymentFactory {

public static PaymentMethod createPayment(PaymentType type) {
    switch (type) {
        case CASH:
            return new CashPayment();
        case CREDIT_CARD:
            return new CreditCardPayment(5000);
        case WALLET:
            return new WalletPayment(1000);
        default:
            throw new IllegalArgumentException("Invalid payment type");
    }
}
}