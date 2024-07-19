package traning;

public class PayPalPayment implements Payment {
    private String paypalAccount;

    public PayPalPayment(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + paypalAccount);
    }
}
