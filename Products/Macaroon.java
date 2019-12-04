package Products;
import enums.PastryTypes;

public class Macaroon extends Pastry{
    
    PastryTypes spec;
    
    public Macaroon(PastryTypes general, PastryTypes spec){
        super("Macaroon", general);
        this.spec = spec;
    }

    public double getCost(PastryTypes spec){
        double cost = super.getCost();
        switch(spec) {
            case variety:
                break;
        }
        return cost;
    }
    public String getDescription(){
       return spec.name() + "\n";
    }
}