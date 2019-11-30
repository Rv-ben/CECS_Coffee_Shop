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
public class HalfHalf extends Milk {
     public HalfHalf(Drink base){
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
