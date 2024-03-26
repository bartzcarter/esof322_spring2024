/**
 * Ticket.java
 * Abstract class for ticket
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public abstract class Ticket{
    private double price;
    private DiscountBehavior discount;

    public abstract void DisplayPrice();

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setDiscount(DiscountBehavior discount){
        this.discount = discount;
    }

    public void DetermineDiscount(){
        discount.Determine(this);
    }

}