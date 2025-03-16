package payment.util;

import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private final List<String> logs = new ArrayList<>();

    public void log(String message) {
        logs.add(message);
    }

    public void printHistory() {
        logs.forEach(System.out::println);
    }
}