package coffeeshop.model;

public class Latte implements Coffee {
    @Override
    public double getCost() { return 3.0; }

    @Override
    public String getDescription() { return "Latte"; }
}