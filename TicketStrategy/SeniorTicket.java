/**
 * SeniorTicket.java
 * Class for senior ticket 
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public class SeniorTicket extends Ticket{
    private double price;

    public SeniorTicket(){
        setPrice(15.00);
    }

    public void DisplayPrice(){
        System.out.printf("This senior ticket will cost $%.2f\n", getPrice());
    }
}