import java.util.ArrayList;

import Factories.*;
import Products.*;
import enums.*;

public class test{
    public static void main(String args[]) {
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();
        //listOfToppingTypes = null;

        DrinkFactory Dfactory = new DrinkFactory();

        TypeSizeStruct typeSize = new TypeSizeStruct();

        typeSize.size = Sizes.large;
        typeSize.type = DrinkTypes.tea;
        typeSize.spec = DrinkTypes.summerMintTea;

        Product p = Dfactory.createProduct(typeSize,listOfToppingTypes);

        System.out.println(p.getCost());
    }
}