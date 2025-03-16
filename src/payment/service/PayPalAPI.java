package payment.service;

public class PayPalAPI {
    public boolean sendPayment(double amount, String email) {
        System.out.printf("Sending $%.2f to PayPal account: %s%n", amount, email);
        return true;
    }
}
