
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit
{
    public String roads;
    public int id;
    /**
     * Constructor for objects of class Exit
     */
    public Exit(String road, int number)
    {
        roads = road;
        id = number;
    }

    /**
     * Prints id of an exit.
     */
    public int getId()
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
