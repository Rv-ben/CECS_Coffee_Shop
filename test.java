import java.util.ArrayList;

import Factories.*;
import Products.*;
import enums.*;

public class test{
    public static void main(String args[]) {
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();
        ArrayList<Product> listOfProducts = new ArrayList<Product>();

        DrinkFactory Dfactory = new DrinkFactory();
        TypeSizeStruct tea = new TypeSizeStruct();
        TypeSizeStruct coffee = new TypeSizeStruct();
        PastryFactory croissant = new PastryFactory();

        // creating tea
        tea.size = Sizes.large;
        tea.type = DrinkTypes.tea;
        tea.spec = DrinkTypes.summerMintTea;

        // creating coffee
        coffee.size = Sizes.medium;
        coffee.type = DrinkTypes.coffee;
        coffee.spec = DrinkTypes.almondLatte;

        // adding toppings
        listOfToppingTypes.add(ToppingTypes.boba);
        listOfToppingTypes.add(ToppingTypes.poppingBoba);
        listOfToppingTypes.add(ToppingTypes.freshStrawberry);

        // creating products
        final Product p = Dfactory.createProduct(tea, listOfToppingTypes);
        final Product p1 = Dfactory.createProduct(coffee, listOfToppingTypes);
        final Product p2 = croissant.createProduct(PastryTypes.croissant, PastryTypes.chocolateNut, true);

        // adding products into the arraylist
        listOfProducts.add(p);
        listOfProducts.add(p1);
        listOfProducts.add(p2);

        // displaying the all products
        for (int i = 0; i < listOfProducts.size(); i++){
            System.out.println(listOfProducts.get(0).getCost());
            System.out.println(listOfProducts.get(0).getDescription());
        }
    }
}