package coffeeshop.demo;

import coffeeshop.factory.CoffeeFactory;
import coffeeshop.model.Coffee;
import coffeeshop.decorator.MilkDecorator;
import coffeeshop.decorator.ChocolateDecorator;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.createCoffee("espresso");
        coffee = new MilkDecorator(coffee);
        coffee = new ChocolateDecorator(coffee);

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());
    }
}