package payment.service;

public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;
    private final String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing credit card payment: $%.2f%n", amount);
        return isValidCard();
    }

    private boolean isValidCard() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }
}