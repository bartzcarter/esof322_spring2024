/**
 * AarpDiscount.java
 * class for AARP discount behavior
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public class AarpDiscount implements DiscountBehavior{

    public void Determine(Ticket ticket){
        ticket.setPrice(ticket.getPrice() * 0.8);
        System.out.println("This ticket has a 20% discount");
    }

}