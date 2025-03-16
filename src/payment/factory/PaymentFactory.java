package payment.factory;

import payment.service.PaymentMethod;
import payment.service.CreditCardPayment;
import payment.adapter.PayPalAdapter;
import java.util.Map;

public class PaymentFactory {
    public PaymentMethod createPayment(String type, Map<String, String> details) {
        return switch (type.toLowerCase()) {
            case "credit" -> new CreditCardPayment(
                    details.get("cardNumber"),
                    details.get("cvv")
            );
            case "paypal" -> new PayPalAdapter(details.get("email"));
            default -> throw new IllegalArgumentException("Unknown payment type: " + type);
        };
    }
}