package Factories;

import Products.Product;

import java.util.ArrayList;

import Decorators.Milk;
import enums.*;
import Products.Coffee;
import Products.Drink;

public class DrinkFactory implements Factory{


    @Override
    public Product createProduct() {
        return null;
    }

    public Product createProduct(Object type, Object decorators,Object size) {
        Drink drink;

        drink = drinkType((DrinkTypes)type, (Sizes)size);

        
        for(ToppingTypes i: (ArrayList<ToppingTypes>)decorators){
            drink = addDecorators(i, drink);
        }

        return drink;
    }

    public Drink drinkType(DrinkTypes type,Sizes size){
        switch(type){
            case coffee: return new Coffee(size);
        }
        return null;
    }

    public Drink addDecorators(ToppingTypes toppings,Drink drink){
        switch(toppings){
            case milk: return new Milk(drink);
        }
        return drink;
    }
}