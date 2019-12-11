package Products;
import enums.PastryTypes;

public class Macaroon extends Pastry{
    
    PastryTypes spec;
    int qty;
    
    public Macaroon(PastryTypes general, PastryTypes spec,int qty){
        super("Macaroon", general);
        this.spec = spec;
        this.qty = qty;
    }

    public double getCost(){
        double cost = super.getCost();

        if(qty%6 == 0){
            cost = (int)(qty/6) * PastryPrices.getCost(PastryTypes.sixMac);
            //cost = int(qty/6) * 
        }
        else if(qty%6 != 0 ){
            cost = (int)(qty/6)*  PastryPrices.getCost(PastryTypes.sixMac) + cost*(qty%6);
        }

        return cost;
    }
    public String getDescription(){
       return spec.name() + "\n";
    }
}