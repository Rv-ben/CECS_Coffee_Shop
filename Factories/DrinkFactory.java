package Factories;

import Products.Product;

import java.util.*;

import Decorators.*;
import enums.*;
import Products.*;

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
    HashMap<String,Double> priceMap;
 
    
    public Product createProduct(Object typeSize, Object decorators) {

        Drink drink;
        Details details = (Details)typeSize;


        drink = drinkType(details);

        //Checks if there decorators
        if(decorators != null){
        
            for(ToppingTypes i: (ArrayList<ToppingTypes>)decorators){
                drink = addDecorators(i, drink);
            }

        }

        return drink;
    }
    
    public Product createProduct(guiProduct g) {

        Drink drink;
        Details details = (Details)g.getDet();
        ArrayList<ToppingTypes> decorators = (ArrayList<ToppingTypes>)g.getTList();


        drink = drinkType(details);

        //Checks if there decorators
        if(decorators != null){
        
            for(ToppingTypes i: (ArrayList<ToppingTypes>)decorators){
                drink = addDecorators(i, drink);
            }

        }

        return drink;
    }

    /**
     * Selects base drink object given type and size
     * @param type DrinkType Enum
     * @param size Size Enum
     * @return Drink Object, null if not listed
     */
    public Drink drinkType(Details details){

        switch(details.type){
            case coffee: return new Coffee(details.size,details.spec);
            case tea: return new Tea(details.size, details.spec,details.sweetness);
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
            case soyMilk: return new SoyMilk(drink);
            case halfHalf: return new HalfHalf(drink);
            case boba: return new Boba(drink);
            case poppingBoba: return new PoppingBoba(drink);
            case passionFruitJelly: return new PassionFruitJelly(drink);
            case lycheeJelly: return new LycheeJelly(drink);
            case grassJelly: return new GrassJelly(drink);
            case coconutJelly: return new CoconutJelly(drink);
            case whipCream: return new WhipCream(drink);
            case freshStrawberry: return new FreshStrawberry(drink);
        }
        return drink;
    }
}