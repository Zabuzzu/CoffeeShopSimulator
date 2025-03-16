package payment.adapter;

import payment.service.PaymentMethod;
import payment.service.PayPalAPI;

public class PayPalAdapter implements PaymentMethod {
    private final PayPalAPI payPalAPI;
    private final String email;

    public PayPalAdapter(String email) {
        this.payPalAPI = new PayPalAPI();
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        return payPalAPI.sendPayment(amount, email);
    }
}