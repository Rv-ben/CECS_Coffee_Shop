import java.util.ArrayList;

import Factories.*;
import Products.*;
import enums.*;

public class test{
    public static void main(final String args[]) {
        final ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();
        // listOfToppingTypes = null;
        final ArrayList<Product> listOfProduct = new ArrayList<Product>();

        final DrinkFactory Dfactory = new DrinkFactory();

        final TypeSizeStruct tea = new TypeSizeStruct();

        final TypeSizeStruct coffee = new TypeSizeStruct();

        tea.size = Sizes.large;
        tea.type = DrinkTypes.tea;
        tea.spec = DrinkTypes.summerMintTea;

        listOfToppingTypes.add(ToppingTypes.boba);
        listOfToppingTypes.add(ToppingTypes.poppingBoba);
        listOfToppingTypes.add(ToppingTypes.freshStrawberry);

        coffee.size = Sizes.medium;
        coffee.type = DrinkTypes.coffee;
        coffee.spec = DrinkTypes.almondLatte;

        final Product p = Dfactory.createProduct(tea, listOfToppingTypes);

        final Product p1 = Dfactory.createProduct(coffee, listOfToppingTypes);
        
        listOfProduct.add(p);
        listOfProduct.add(p1);

        for (int i = 0; i < listOfProduct.size(); i++){
            System.out.println(listOfProduct.get(0).getCost());
            System.out.println(listOfProduct.get(0).getDescription());
        }

        

        //Dolly this is a test
    }
}