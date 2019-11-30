package Decorators;

import Products.Drink;

public class Milk extends Topping {

    public Milk(Drink base){
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + "Added: Milk";
    }

    @Override
    public double getCost() {
        return base.getCost() + 1;
    }
}