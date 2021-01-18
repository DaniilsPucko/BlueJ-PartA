
/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;

    /**
     * Constructor for objects of class Item
     */
    public Items(String n, String d)
    {
        name = n;
        description = d;
    }

    /**
     * Prints name of the item;
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Prints info about item;
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Prints item name with description
     */
    public void printItem()
    {
        System.out.println(name +" - "+  description);
    }
}
