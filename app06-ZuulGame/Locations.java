import java.util.ArrayList;
/**
 * Write a description of class Locations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Locations
{
    private ArrayList<Room> locations;

    /**
     * Constructor for objects of class Locations
     */
    public Locations()
    {
        locations = new ArrayList<>();
        
        Room location = new Room (0, "Outside", "You are outside in the middle of the abandonned city");
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod()
    {
        
    }
}
