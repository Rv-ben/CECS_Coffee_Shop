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
                cost = PastryPrices.getCost(PastryTypes.croissant);
                break;
            case cookie:
                cost = PastryPrices.getCost(PastryTypes.cookie);
                break;
            case macaroon:
                cost = PastryPrices.getCost(PastryTypes.macaroon);
                break;
        }
        return cost;
    }

    

}