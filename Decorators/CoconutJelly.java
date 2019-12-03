/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorators;

import Products.Drink;

/**
 *
 * @author tansr
 */
public class CoconutJelly extends Topping {
    
    public CoconutJelly(Drink base){
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + "Added: Coconut Jelly";
    }

    @Override
    public double getCost() {
        return base.getCost() + .50;
    }
}
