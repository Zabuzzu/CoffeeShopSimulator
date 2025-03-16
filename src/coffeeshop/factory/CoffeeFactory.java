package coffeeshop.factory;

import coffeeshop.model.Coffee;
import coffeeshop.model.Espresso;
import coffeeshop.model.Latte;

public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "latte" -> new Latte();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}