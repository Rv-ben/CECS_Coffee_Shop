package Products;
import enums.PastryTypes;

public class Cookie extends Pastry{
    
    PastryTypes spec;
    
    public Cookie(PastryTypes general, PastryTypes spec){
        super("Cookie", general);
        this.spec = spec;
    }

    public double getCost(PastryTypes spec){
        double cost = super.getCost();
        switch(spec) {
            case oatmeal:
                cost += 0.50;
                break;
        }
        return cost;
    }
    public String getDescription(){
       return spec.name();
    }
}