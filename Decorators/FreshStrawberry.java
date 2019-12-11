package Decorators;

import Products.Drink;
import enums.ToppingTypes;

public class FreshStrawberry  extends Topping{

	public FreshStrawberry(Drink base) {
		super(base);
	}

	@Override
	public String getDescription() {
		return base.getDescription() + "Added: Fresh Strawberry\n";
	}
	
	@Override
    public double getCost() {
        return base.getCost() + ToppingPrices.getCost(ToppingTypes.freshStrawberry);
    }
}
