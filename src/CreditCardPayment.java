
public class CreditCardPayment implements PaymentMethod{
    private double limit;
    public CreditCardPayment(double limit){
        this.limit=limit;
    }
    @Override
    public  void  pay(double amount){
        if (amount>limit){
            System.out.println("Payment faild : Exceeds credit limit");
        }else {
            limit -=amount;
            System.out.println("Paid" +amount+ "using credit Card");
        }
    }
}
