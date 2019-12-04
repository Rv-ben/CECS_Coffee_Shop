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

    public double getCost(PastryTypes spec){
        double cost = super.getCost();

        if(qty%6 == 0){
            cost = cost* (int)(qty/6) * 9;
        }
        else if(qty%6 != 0 ){
            cost = cost*(int)(qty/6)* 9 + cost*(qty%6);
        }

        return cost;
    }
    public String getDescription(){
       return spec.name() + "\n";
    }
}