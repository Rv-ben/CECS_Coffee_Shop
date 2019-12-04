package Decorators;

import Products.Drink;
/** Represents toppings to be put on products
 * @version 1.0
 * @author tansr
 */
public abstract class Topping extends Drink{

    protected Drink base;

  /** Topping constructor
  * @param base takes base to add topping to 
  * 
  */
    Topping(Drink base){
        this.base = base;
    }
    
  /** getBase
  * returns a reference to the base that this topping is added to 
  * 
  */
    public Drink getBase(){
        return base;
    }

    
 /** getDescription
  * @return A string with the topping name appended.
  * 
  */
    public abstract String getDescription();
 /** getCost
  * @return the cost of this topping plus the base price
  * 
  */
    public abstract double getCost();
}
