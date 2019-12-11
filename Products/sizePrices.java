/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

import enums.Sizes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tansr
 */
public class sizePrices {
     private static HashMap<Sizes, Double> prices = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
  
    
    static {
        for (Sizes top : Sizes.values()) { 
           System.out.println("Price for : " + top);
           prices.put(top, Double.valueOf(input.nextLine()));
      }
        
        
     System.out.println(Arrays.asList(prices));
    }
    public void init() {}
    public static double getCost(Sizes top){
        return prices.get(top);
    }
    
}
