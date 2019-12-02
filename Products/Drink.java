package Products;

import enums.*;

public abstract class Drink implements Product {
    
    String name;

    Sizes size;

    DrinkTypes spec;

    public Drink(){

    }

    public Drink(String name, Sizes size, DrinkTypes spec){
        this.name = name;
        this.size = size;
        this.spec = spec;
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