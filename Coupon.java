

public class Coupon{
    
    public boolean drink = false ,pastry = false;

    public double percent = 1;

    Coupon(){
    }

    Coupon(boolean drink, boolean pastry,double percent){
        this.drink = drink;
        this.pastry = pastry;
        this.percent = percent;
    }
    
}