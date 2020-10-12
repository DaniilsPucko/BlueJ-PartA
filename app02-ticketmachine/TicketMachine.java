import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Daniils Pucko
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //The arraylist for the all tickets.
    private ArrayList<Ticket> tickets;
    
    
    private Date today = new Date();
    //SimpleDateFormat
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
    //Tickets date
    String date = formatter.format(today);
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        tickets = new ArrayList<Ticket>();
    }
    
    /**
     * Add a ticket to ticket machine.
     */
    public void addTicket(Ticket newTicket)
    {
        tickets.add(newTicket);
    }
    
    /**
     * Print available tickets.
     */
    public void printList()
    {
        for(Ticket ticket : tickets)
        {
            ticket.print();
        }
    }
    
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void buyTicket(Ticket ticket)
    {
        if(balance >=ticket.price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("Ticket destination: " + ticket.destination);
            System.out.println("Ticket price: " + ticket.price + " pennies");
            System.out.println("Date: " + date);
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + ticket.price;
            // Reduce the balance by the price.
            balance = balance - ticket.price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (ticket.price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /**
     * Adds a coin to balance
     */
    public void addCoin(Coin coin)
    {
       balance = balance + coin.getValue(); 
    }
}
