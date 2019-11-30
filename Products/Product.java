package Products;

public abstract class Product{

    private String description;

    private double cost;
    
    public Product(String description, double cost){
        this.description = description;
        this.cost = cost;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

}