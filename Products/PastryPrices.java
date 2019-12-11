/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

import enums.PastryTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tansr
 */
public class PastryPrices {

    private static HashMap<PastryTypes, Double> prices = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
  
    
    static {
        for (PastryTypes top : PastryTypes.values()) { 
           System.out.println("Price for : " + top);
           prices.put(top, Double.valueOf(input.nextLine()));
      }
        System.out.println("Price for three cookies");
        prices.put(PastryTypes.threeCookie,Double.valueOf(input.nextLine()));
        System.out.println("Price for six macaroons");
        prices.put(PastryTypes.sixMac,Double.valueOf(input.nextLine()));
        
        
     System.out.println(Arrays.asList(prices));
    }
    public void init() {}
    public static double getCost(PastryTypes top){
        return prices.get(top);
    }
    
}
