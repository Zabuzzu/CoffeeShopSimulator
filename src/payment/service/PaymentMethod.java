package payment.service;

public interface PaymentMethod {
    boolean processPayment(double amount);
}