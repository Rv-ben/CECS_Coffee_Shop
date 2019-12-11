/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorators;

import Products.Drink;
import enums.ToppingTypes;

/**
 *
 * @author tansr
 */
public class LycheeJelly extends Topping {
    
    public LycheeJelly(Drink base){
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + "Added: Lychee Jelly\n";
    }

    @Override
    public double getCost() {
        return base.getCost() + ToppingPrices.getCost(ToppingTypes.lycheeJelly);
    }


}