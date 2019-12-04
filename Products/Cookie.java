package Products;
import enums.PastryTypes;

public class Cookie extends Pastry{
    
    PastryTypes spec;
    int qty;
    
    public Cookie(PastryTypes general, PastryTypes spec,int qty){
        super("Cookie", general);
        this.spec = spec;
    }

    public double getCost(PastryTypes spec){
        double cost = super.getCost();
        if(qty%6 == 0){
            cost = cost*(int)(qty/6) * 9;
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