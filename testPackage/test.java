package testPackage;


import Decorators.ToppingPrices;
import Factories.*;
import Products.*;
import enums.*;
import java.util.ArrayList;

public class test{
    public static void main(String args[]) {
        PastryPrices p = new PastryPrices();
        ToppingPrices t = new ToppingPrices();

        p.init();
        t.init();
        System.out.println("hello");
        ArrayList<ToppingTypes> listOfToppingTypes = new ArrayList<ToppingTypes>();
        ArrayList<Product> listOfProducts = new ArrayList<Product>();

        DrinkFactory Dfactory = new DrinkFactory();
        Details details = new Details();
        PastryFactory Pfactory = new PastryFactory();

        details.spec = DrinkTypes.almondLatte;
        details.type = DrinkTypes.coffee;
        details.size = Sizes.medium;
        
        listOfToppingTypes.add(ToppingTypes.whipCream);
        
        guiProduct g = new guiProduct(details,listOfToppingTypes);
        //listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));
        listOfProducts.add(Dfactory.createProduct(g));
        listOfToppingTypes.clear();
        
        
           details.qty = 7;
        details.special = PastryTypes.oatmeal;
        details.pType = PastryTypes.cookie;
    g = new guiProduct(details,listOfToppingTypes);
   listOfProducts.add(Pfactory.createProduct(g));
        listOfToppingTypes.clear();

/*
        details.spec = DrinkTypes.darkRoast;
        details.type = DrinkTypes.coffee;
        details.size = Sizes.large;
        listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));

        details.spec = DrinkTypes.hazelnutLatte;
        details.type = DrinkTypes.coffee;
        details.size = Sizes.small;
        listOfToppingTypes.add(ToppingTypes.soyMilk);
        listOfToppingTypes.add(ToppingTypes.whipCream);
        listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));
        listOfToppingTypes.clear();

        details.spec = DrinkTypes.pumpkinSpiceLatte;
        details.type = DrinkTypes.coffee;
        details.size = Sizes.small;
        listOfToppingTypes.add(ToppingTypes.halfHalf);
        listOfToppingTypes.add(ToppingTypes.whipCream);
        listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));
        listOfToppingTypes.clear();

  
        details.spec = DrinkTypes.summerMintTea;
        details.type = DrinkTypes.tea;
        details.size = Sizes.large;
        details.sweetness = 0.50;
        listOfToppingTypes.add(ToppingTypes.passionFruitJelly);
        listOfToppingTypes.add(ToppingTypes.freshStrawberry);
        listOfToppingTypes.add(ToppingTypes.coconutJelly);
        
        listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));
        listOfToppingTypes.clear();

        details.spec = DrinkTypes.milkTea;
        details.type = DrinkTypes.tea;
        details.size = Sizes.medium;
        details.sweetness = 0.50;
        listOfToppingTypes.add(ToppingTypes.halfHalf);
        listOfToppingTypes.add(ToppingTypes.boba);
        listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));
        listOfToppingTypes.clear();

        details.spec = DrinkTypes.milkTea;
        details.type = DrinkTypes.tea;
        details.size = Sizes.medium;
        details.sweetness = 0.50;
        listOfToppingTypes.add(ToppingTypes.halfHalf);
        listOfToppingTypes.add(ToppingTypes.boba);
        listOfProducts.add(Dfactory.createProduct(details, listOfToppingTypes));
        listOfToppingTypes.clear();

        // making pastries
        details.heated = false;
        details.special = PastryTypes.chocolateNut;
        details.pType = PastryTypes.croissant;
        listOfProducts.add(Pfactory.createProduct(null, details));

        details.heated = true;
        details.special = PastryTypes.plain;
        details.pType = PastryTypes.croissant;
        listOfProducts.add(Pfactory.createProduct(null, details));

 
        details.qty = 7;
        details.special = PastryTypes.variety;
        details.pType = PastryTypes.macaroon;
        listOfProducts.add(Pfactory.createProduct(null, details));

        Receipt r = new Receipt(listOfProducts, .10);

        System.out.println("\n\n\n\n");

        r.printReceipt();

        Coupon drinkCoupon = new Coupon();
        drinkCoupon.drink = true;
        drinkCoupon.percent = .5;

        r.setCoupon(drinkCoupon);

        System.out.println("\n\n\n\n");
        r.printReceipt();

   
        Coupon pastryCoupon = new Coupon();
        pastryCoupon.pastry = true;
        pastryCoupon.drink = false;
        pastryCoupon.percent = .5;

        r.setCoupon(pastryCoupon);

        System.out.println("\n\n\n\n");

        r.printReceipt();


        Coupon coupon = new Coupon();
        coupon.drink = true;
        coupon.pastry = true;
        coupon.percent = .5;

        r.setCoupon(coupon);

        System.out.println("\n\n\n\nAHHHHHHHHHHHH");
*/       Receipt r = new Receipt(listOfProducts, .10);
        r.printReceipt();








        // TypeSizeStruct d = new TypeSizeStruct();
        // d.heated = true;
        // d.special= PastryTypes.chocolateNut;
        // d.pType = PastryTypes.croissant;

        // croissant.createProduct(null, d);

        // d.heated = false;
        // d.special = PastryTypes.cookie;
        // d.pType = PastryTypes.oatmeal;
        // listOfProducts.add(croissant.createProduct(null, d));

        // // creating products
        // Product p = Dfactory.createProduct(tea, listOfToppingTypes);
        // Product p1 = Dfactory.createProduct(coffee, listOfToppingTypes);
        // // final Product p2 = croissant.createProduct(PastryTypes.croissant, PastryTypes.chocolateNut, true);
        // // final Product p3 = cookie.createProduct(PastryTypes.cookie, PastryTypes.oatmeal);

        // // adding products into the arraylist
        // listOfProducts.add(p);
        // listOfProducts.add(p1);
        // // listOfProducts.add(p2);
        // // listOfProducts.add(p3);

        // // displaying the all products
        // for (int i = 0; i < listOfProducts.size(); i++){
        //     System.out.println(listOfProducts.get(0).getCost());
        //     System.out.println(listOfProducts.get(0).getDescription());
        // }
    }
}