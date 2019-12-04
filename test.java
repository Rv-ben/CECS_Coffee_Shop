import java.util.ArrayList;

import Factories.*;
import Products.*;
import enums.*;

public class test{
    public static void main(String args[]) {
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();
        //listOfToppingTypes = null;

        ArrayList<Product> listOfProducts = new ArrayList<Product>();

        DrinkFactory Dfactory = new DrinkFactory();

        TypeSizeStruct tea = new TypeSizeStruct();

        TypeSizeStruct coffee = new TypeSizeStruct();

        tea.size = Sizes.large;
        tea.type = DrinkTypes.tea;
        tea.spec = DrinkTypes.summerMintTea;
        listOfToppingTypes.add(ToppingTypes.coconutJelly);
        listOfToppingTypes.add(ToppingTypes.boba);
        listOfToppingTypes.add(ToppingTypes.freshStrawberry);
        
        coffee.size = Sizes.medium;
        coffee.type = DrinkTypes.coffee;
        coffee.spec = DrinkTypes.almondLatte;

        PastryFactory croissant = new PastryFactory();
        Product p3 = croissant.createProduct(PastryTypes.croissant, PastryTypes.chocolateNut, true);
        System.out.println(p3.getCost());
        System.out.println(p3.getDescription());

        Product p = Dfactory.createProduct(tea,listOfToppingTypes);
        Product p1 = Dfactory.createProduct(coffee, listOfToppingTypes);
         listOfProducts.add(p);
         listOfProducts.add(p1);
         listOfProducts.add(p3);
         for (int i = 0; i < listOfProducts.size(); i++){
             System.out.println(listOfProducts.get(i).getCost());
             System.out.println(listOfProducts.get(i).getDescription());
         }
    }
}