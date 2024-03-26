/**
 * AdultTicket.java
 * Class for adult ticket
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public class AdultTicket extends Ticket{
    private double price;

    public AdultTicket(){
        setPrice(20.00);
    }

    public void DisplayPrice(){
        System.out.printf("This adult ticket will cost $%.2f\n", getPrice());
    }
}