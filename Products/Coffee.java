package Products;

import enums.Sizes;

public class Coffee extends Drink {

    public Coffee(Sizes size){
        super("Coffee", size);
    }

    public double getCost(){
        return super.getCost();
    }

    public String getDescription(){
        return "Just a coffee dogg";
    }
}