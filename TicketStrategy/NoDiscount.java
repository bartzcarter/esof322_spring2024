/**
 * NoDiscount.java
 * Class for no discount behavior
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public class NoDiscount implements DiscountBehavior{

    public void Determine(Ticket ticket){
        ticket.setPrice(ticket.getPrice());
        System.out.println("There is no discount for this ticket");
    }
}