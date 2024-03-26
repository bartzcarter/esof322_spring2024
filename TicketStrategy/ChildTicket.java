/**
 * ChildTicket.java
 * Class for child ticket
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 */

public class ChildTicket extends Ticket{

    public ChildTicket(){
        setPrice(10.00);
    }

    public void DisplayPrice(){
        System.out.printf("This child's ticket will cost $%.2f\n", getPrice());
    }
}