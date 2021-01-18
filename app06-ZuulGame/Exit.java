
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit
{
    private int id;
    private String roads;

    /**
     * Constructor for objects of class Exit
     */
    public Exit(int number, String road)
    {
        id = number;
        roads = road;
    }

    /**
     * Prints id of an exit.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Prints where is an exit.
     */
    public String getRoad()
    {
        return roads;
    }
}
