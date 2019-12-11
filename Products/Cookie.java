package Products;
import enums.PastryTypes;

public class Cookie extends Pastry{
    
    PastryTypes spec;
    int qty;
    
    public Cookie(PastryTypes general, PastryTypes spec,int qty){
        super("Cookie", general);
        this.spec = spec;
        this.qty = qty;
    }

    public double getCost(){
        double cost = super.getCost();
        if(qty%3 == 0){
            cost = (int)(qty/3)*  PastryPrices.getCost(PastryTypes.threeCookie);
        }  else if(qty%3 != 0 ){
            cost = (int)(qty/3)*  PastryPrices.getCost(PastryTypes.threeCookie) + PastryPrices.getCost(PastryTypes.cookie)*(qty%3);
        }

        return cost;
    }
    public String getDescription(){
       return spec.name() + "\n";
    }
}