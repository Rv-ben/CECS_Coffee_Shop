package Decorators;

import Products.Drink;
/** Represens topping
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


}
