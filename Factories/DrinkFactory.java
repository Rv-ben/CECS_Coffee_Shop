package Factories;

import Products.Product;

import java.util.ArrayList;

import Decorators.Milk;
import enums.*;
import Products.Coffee;
import Products.Drink;

/**
 * Drink Factory class, implements Factory
 * @author Ruben Bramasco
 * @version 1.0.0
 * @since 11-30-2019
 */
public class DrinkFactory implements Factory{

    /**
     * Creates Drink Product given details of size/type and decoratorators
     * @param typeSize TypeSizeStruct Object
     * @param decorators ArrayList<ToppingType> Object
     * @return Product Object 
     */
    public Product createProduct(Object typeSize, Object decorators) {
        Drink drink;
        TypeSizeStruct details = (TypeSizeStruct)typeSize;


        drink = drinkType(details.type, details.size);

        
        for(ToppingTypes i: (ArrayList<ToppingTypes>)decorators){
            drink = addDecorators(i, drink);
        }

        return drink;
    }

    /**
     * Selects base drink object given type and size
     * @param type DrinkType Enum
     * @param size Size Enum
     * @return Drink Object, null if not listed
     */
    public Drink drinkType(DrinkTypes type,Sizes size){
        switch(type){
            case coffee: return new Coffee(size);
        }
        return null;
    }

    /**
     * Adds decorator given topping and base drink
     * @param toppings 
     * @param drink
     * @return Drink Object, base drink if not found
     */
    public Drink addDecorators(ToppingTypes topping,Drink drink){
        switch(topping){
            case milk: return new Milk(drink);
        }
        return drink;
    }
}