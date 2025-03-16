package payment.demo;

import payment.factory.PaymentFactory;
import payment.service.PaymentMethod;
import payment.util.TransactionLogger;
import java.util.Map;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        TransactionLogger logger = new TransactionLogger();

        Map<String, String> creditDetails = Map.of(
                "cardNumber", "1234123412341234",
                "cvv", "123"
        );

        PaymentMethod creditCard = factory.createPayment("credit", creditDetails);
        boolean success = creditCard.processPayment(50.0);
        logger.log("Credit card payment: " + (success ? "Success" : "Failed"));

        Map<String, String> paypalDetails = Map.of("email", "baglan.karbozov@bk.ru");
        PaymentMethod paypal = factory.createPayment("paypal", paypalDetails);
        success = paypal.processPayment(30.0);
        logger.log("PayPal payment: " + (success ? "Success" : "Failed"));

        logger.printHistory();
    }
}