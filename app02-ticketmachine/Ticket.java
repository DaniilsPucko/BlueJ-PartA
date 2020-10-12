import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Ticket here.
 * 
 * @author (Daniils Pucko) 
 * @version (06.10.2020)
 */
 
public class Ticket
{
    //Ticket Price
    public int price;
    //Ticket destination
    public String destination;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(int cost, String location)
    {
        price = cost;
        destination = location;
    }
    
    public static final Ticket aylesbury = new Ticket(220,"Aylesbury");
    public static final Ticket amersham = new Ticket(300,"Amersham");
    public static final Ticket highwycombe = new Ticket(330,"High Wycombe");
    
    public void print()
    {
        System.out.println("Ticket price: " + price + " pennies" + ", ticket destination: " + destination);
    }
}
