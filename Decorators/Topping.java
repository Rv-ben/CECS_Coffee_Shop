package Decorators;

import Products.Drink;

public abstract class Topping extends Drink{

    protected Drink base;

    Topping(Drink base){
        this.base = base;
    }

    public Drink getBase(){
        return base;
    }


}