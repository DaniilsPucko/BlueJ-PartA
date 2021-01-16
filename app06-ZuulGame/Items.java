
/**
 * Write a description of class Items here.
 * 
 * @author (Daniils Pucko) 
 * @version (16.01.2021)
 */
public class Items
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;

    /**
     * Constructor for objects of class Items
     */
    public Items(String x, String y)
    {
        name = x;
        description = y;
    }
    
    
    /**
     * Returns name of the item.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns description of the item
     */
    public String getDescription()
    {
        return description;
    }
    
    
    /**
     * Prints information about the item.
     */
    public void printItem()
    {
        System.out.println(name + " - "+ description);
    }
}
