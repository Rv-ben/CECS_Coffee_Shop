import java.util.ArrayList;

import Factories.DrinkFactory;
import Products.Product;
import enums.DrinkTypes;
import enums.Sizes;
import enums.ToppingTypes;
import enums.TypeSizeStruct;

public class test{
    public static void main(String args[]) {
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();

        listOfToppingTypes.add(ToppingTypes.milk);

        DrinkFactory Dfactory = new DrinkFactory();

        TypeSizeStruct typeSize = new TypeSizeStruct();

        typeSize.size = Sizes.small;
        typeSize.type = DrinkTypes.coffee;

        Product p = Dfactory.createProduct(typeSize,listOfToppingTypes);

        System.out.println(p.getCost());
        //teest2

    }
}