/**
 * MilitaryDiscount.java
 * class for military discount behavior
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public class MilitaryDiscount implements DiscountBehavior{

    public void Determine(Ticket ticket){
        ticket.setPrice(ticket.getPrice() * 0.9);
        System.out.println("This ticket has a 10% discount");
    }
}