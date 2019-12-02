import java.util.ArrayList;

import Factories.*;
import Products.*;
import enums.*;

public class test{
    public static void main(String args[]) {
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();
        //listOfToppingTypes = null;

        DrinkFactory Dfactory = new DrinkFactory();

        TypeSizeStruct tea = new TypeSizeStruct();

        TypeSizeStruct coffee = new TypeSizeStruct();

        tea.size = Sizes.large;
        tea.type = DrinkTypes.tea;
        tea.spec = DrinkTypes.summerMintTea;

        coffee.size = Sizes.medium;
        coffee.type = DrinkTypes.coffee;
        coffee.spec = DrinkTypes.almondLatte;

        Product p = Dfactory.createProduct(tea,listOfToppingTypes);

        Product p1 = Dfactory.createProduct(coffee, listOfToppingTypes);;

        System.out.println(p.getCost());
        System.out.println(p1.getCost());
    }
}