package Products;
import enums.PastryTypes;

public class Croissant extends Pastry{
    boolean heated;
    PastryTypes spec;
    
    public Croissant(PastryTypes general, PastryTypes spec, boolean heated){
        super("Croissant", general);
        this.spec = spec;
        this.heated = heated;
    }

    public double getCost(PastryTypes spec){
        double cost = super.getCost();
        if (heated == true)
            cost += 0.50;
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
       return spec.name();
    }
}