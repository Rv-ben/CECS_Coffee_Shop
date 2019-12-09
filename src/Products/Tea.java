package Products;

import enums.*;

public class Tea extends Drink {
	DrinkTypes spec;
	
	double sweetness;
	
    public Tea(Sizes size,DrinkTypes spec,double sweetness){
        super("Tea", size);
		this.spec = spec;
		this.sweetness = sweetness;
    }

    public double getCost(){
    	double cost = super.getCost();
    	switch(spec) {
    	case jasmineGreenTea:
    		cost += 1.00;
    		break;
    	case summerMintTea:
    		cost += 1.00;
    		break;
    	case milkTea:
    		cost += 0.50;
    		break;
    	}
        return cost;
    }
    public String getDescription(){
    	
       return spec.name() + " Sweetness: "+ sweetness+ "\n";
    }
}