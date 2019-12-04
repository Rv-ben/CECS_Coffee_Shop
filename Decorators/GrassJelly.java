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
public class GrassJelly extends Topping {
    
    public GrassJelly(Drink base){
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + "Added: Grass Jelly\n";
    }

    @Override
    public double getCost() {
        return base.getCost() + .50;
    }
}
