/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

/**
 *
 * @author tansr
 */
public class guiProduct {
   private Object det;
   private Object toppingList;
   
   public guiProduct(Object details, Object topList) {
       this.det = details;
       this.toppingList = topList;
   }
   
   public Object getDet(){
       return this.det;
   }
   
   public Object getTList(){
       return this.toppingList;
   }
}
