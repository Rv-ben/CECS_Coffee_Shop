package Products;
import enums.PastryTypes;

public class Croissant extends Pastry{
    
    PastryTypes spec;
    
    public Croissant(PastryTypes general, PastryTypes spec){
        super("Croissant", general);
        this.spec = spec;
    }

    public double getCost(PastryTypes spec){
        double cost = super.getCost();
        switch(spec) {
            case chocolateNut:
                cost += 1.00;
                break;
            case plain:
                break;
        }
        return cost;
    }
    public String getDescription(){
       return spec.name() + "\n";
    }
}