package Products;

import enums.*;

public class Coffee extends Drink {

	DrinkTypes spec;
	
    public Coffee(Sizes size,DrinkTypes spec){
        super("Coffee", size);
        this.spec = spec;
    }

    public double getCost(){
    	double cost = super.getCost();
    	switch(spec) {
    	case almondLatte:
    		cost += 0.50;
    		break;
    	case darkRoast:
    		cost += 0.50;
    		break;
    	case hazelnutLatte:
    		cost += 1.00;
    		break;
    	case pumpkinSpiceLatte:
    		cost += 1.00;
    		break;
    	}
        return cost;
    }

    public String getDescription(){
        return spec.name() + "\n";
    }
}