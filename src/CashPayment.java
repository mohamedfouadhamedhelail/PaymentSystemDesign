// Cach payment
public class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("paid" + amount + "using Cach");
    }

}





