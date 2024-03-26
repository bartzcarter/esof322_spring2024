/**
 * TicketTest.java
 * @author Carter Bartz
 * 3/25/2024
 * @version 1.0
 * Driver to test Ticket system using Strategy pattern
 */

public class TicketTest{
    public static void main(String[]args){
        if(Integer.parseInt(args[0]) < 16){
            Ticket ticket = new ChildTicket();
            ticket.setDiscount(new NoDiscount());
            ticket.DetermineDiscount();
            ticket.DisplayPrice();
        }
        else if(Integer.parseInt(args[0]) >= 16 && Integer.parseInt(args[0]) < 65){
            Ticket ticket = new AdultTicket();
            if(args[1].equals("yes")){
                ticket.setDiscount(new MilitaryDiscount());
                ticket.DetermineDiscount();
            }
            else{
                ticket.setDiscount(new NoDiscount());
                ticket.DetermineDiscount();
            }
            ticket.DisplayPrice();
        }
        else if(Integer.parseInt(args[0]) >= 65){
            Ticket ticket = new SeniorTicket();
            if(args[1].equals("yes")){
                ticket.setDiscount(new AarpDiscount());
                ticket.DetermineDiscount();
            }
            else{
                ticket.setDiscount(new NoDiscount());
                ticket.DetermineDiscount();
            }
            ticket.DisplayPrice();
        }
     
    }
}