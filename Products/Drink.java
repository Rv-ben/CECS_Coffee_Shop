package Products;

import enums.Sizes;

public abstract class Drink implements Product {
    
    String name;

    Sizes size;


    public Drink(){

    }

    public Drink(String name, Sizes size){
        this.name = name;
        this.size = size;
    }

    public double getCost(){
        switch(this.size){
            case small: return 1.00;
            case medium: return 1.50;
            case large: return 2.00;
        }
        return 0;
    }
    

}