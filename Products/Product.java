package Products;
  /** Product - represents products that we will add toppings to
  * 
  */
public interface Product{
  /**
  * getDescription
  * @return a string with all the topping descriptions appended
  */
    public abstract String getDescription();
  /**
  * getCost
  * @return a double that contains the current cost of this product plus the price of toppings if any.
  */
    public abstract double getCost();
    

}
