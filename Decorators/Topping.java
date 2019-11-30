package Decorators;

import Products.Product;

public abstract class Topping extends Product{

    private Product base;

    Topping(Product base,String description,double cost){
        super(description, cost);
    }

    public Product getBase(){
        return base;
    }


}