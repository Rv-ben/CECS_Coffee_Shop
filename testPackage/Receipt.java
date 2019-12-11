package testPackage;

import java.util.ArrayList;
import Products.*;

/**
 * Respresents a receipt object
 */
public class Receipt{


    ArrayList<Product> listOfProducts;

    public double subTotal=0,total=0,tax = 1;

    Coupon coupon;

    Receipt(ArrayList<Product> products,double tax){
        this.listOfProducts = products;
        this.tax = tax;
        this.coupon = new Coupon();
    }

    Receipt(ArrayList<Product> products,double tax,Coupon coupon){
        this.listOfProducts = products;
        this.tax = tax;
        this.coupon = coupon;
    }

    public void setCoupon (Coupon c){
        this.coupon = c;
    }

    public void printReceipt(){
        String message ="";
        double productPrice;

        for(Product i : listOfProducts){

            message = "Coupon Applied:   ";
            productPrice = 0;

            if(coupon.drink && i instanceof Drink)
                productPrice += i.getCost() - i.getCost() * coupon.percent;
            else if(coupon.pastry && i instanceof Pastry)
                productPrice += i.getCost() - i.getCost() * coupon.percent;
            else{
                message = "";
                productPrice += i.getCost();
            }

            subTotal += productPrice;
            
            System.out.println(message + i.getDescription() + " - " + productPrice);

        }
        System.out.println("Subtotal: "+ subTotal);
        System.out.println("Total: "+ (subTotal + subTotal*tax));
        subTotal = 0;
        total = 0;
    }
    
}

