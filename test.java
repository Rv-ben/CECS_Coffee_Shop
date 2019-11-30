import java.util.ArrayList;

import Factories.DrinkFactory;
import Products.Product;
import enums.DrinkTypes;
import enums.Sizes;
import enums.ToppingTypes;

public class test{
    public static void main(String args[]) {
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();

        listOfToppingTypes.add(ToppingTypes.milk);

        DrinkFactory Dfactory = new DrinkFactory();

        Product p = Dfactory.createProduct(DrinkTypes.coffee,listOfToppingTypes,Sizes.medium);

        System.out.println(p.getCost());

    }
}