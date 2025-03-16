package coffeeshop.decorator;

import coffeeshop.model.Coffee;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate";
    }
}