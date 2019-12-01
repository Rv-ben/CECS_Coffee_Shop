package Products;

import enums.*;

public class Coffee extends Drink {

    public Coffee(Sizes size,DrinkTypes spec){
        super("Coffee", size, spec);
    }

    public double getCost(){
        return super.getCost();
    }

    public String getDescription(){
        return "Just a coffee dogg";
    }
}