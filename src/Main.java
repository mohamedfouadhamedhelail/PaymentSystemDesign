//Factory Pattern
enum PaymentType {
    CASH, CREDIT_CARD, WALLET
}

public class Main {
    public static void main(String[] args) {

        PaymentMethod method = PaymentFactory.createPayment(PaymentType.CREDIT_CARD);
        DiscountStrategy discount = new TenPercentDiscount();

        PaymentProcessor processor = new PaymentProcessor(method, discount);

        processor.process(1000);


    }
}