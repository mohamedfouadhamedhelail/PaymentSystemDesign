public class WalletPayment implements PaymentMethod{
    private double balance;

    public WalletPayment(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount){
        if (amount > balance) {
            System.out.println("Payment failed: Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Paid " + amount + " using Wallet");
        }
    }



}
