import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int health;
    private int score;
    private String name;
    private ArrayList<Items> inventory;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name1)
    {
        this.name = name1;
        score = 0;
        health = 100;
        inventory = new ArrayList<>();
    }

    /**
     * Prints score of the player
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * Prints health of the player
     */
    public int getHealth()
    {
        return health;
    }
    
    /**
     * Prints name of the player
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method which affects player's health
     */
    public int affectHealth(int h)
    {
        health = health + h;
        return health;
    }
    
    /**
     * Method which affects player's score
     */
    public int affectScore(int s)
    {
        score = score + s;
        return score;
    }
    
    /**
     * Remove item from players inventory
     */
    public Items removeItem(String name)
    {
        for(Items item : inventory){
            if (item.getName().contains(name)){
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }
    
    /**
     * Add item to player's inventory
     */
    public void addItem(Items item)
    {
        inventory.add(item);
    }
    
    /**
     * Checks inventory for an item
     */
    public boolean findItem(String name)
    {
        for(Items item : inventory){
            if (item.getName().contains(name)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Prints all available items in the inventory
     */
    public void printItems()
    {
        for(Items item : inventory) {
            item.printItem();
        }
    }
}


