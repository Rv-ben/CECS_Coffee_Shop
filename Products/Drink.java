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
            case small: return 1;
            case medium: return 2;
            case large: return 3;
        }
        return 0;
    }

}