package Products;
import enums.PastryTypes;

public abstract class Pastry implements Product {
    
    String name;

    PastryTypes general;

    public Pastry(){

    }

    public Pastry(String name, PastryTypes general){
        this.name = name;
        this.general = general;
    }

    public double getCost() {
        double cost = 0;
        switch (general) {
           case croissant:
                cost = 2;
                break;
            case cookie:
                cost = 1.50;
                break;
            case macaroon:
                cost = 2.00;
                break;
        }
        return cost;
    }

    

}