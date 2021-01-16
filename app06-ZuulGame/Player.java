import java.util.ArrayList;
/**
 * Class for player character.
 * 
 * @author (Daniils Pucko) 
 * @version (16.01.2021)
 */
public class Player
{
    private int score;
    private int health;
    private String name;
    private ArrayList<Items> items;
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String name1)
    {
        score = 0;
        health = 100;
        this.name = name1;
        items = new ArrayList<>();
    }
    
    /**
     * Returns score of player.
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * Returns health of player.
     */
    public int getHealth()
    {
        return health;
    }
    
    /**
     * Prints name of player.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Change player's health.
     */
    public int changeHealth(int h)
    {
        health = health + h;
        return health;
    }
    
    /**
     * Change player's score.
     */
    public int changeScore(int s)
    {
        score = score + s;
        return score;
    }
    
    /**
     * Remove item from players inventory.
     */
    public Items removeItem(String name)
    {
        for(Items item : items){
            if (item.getName().contains(name)){
                items.remove(item);
                System.out.println(item + "was removed from players inventory");
            }
        }
        return null;
    }
    
    /**
     * Add item to players inventory.
     */
    public void addItem(Items item)
    {
        items.add(item);
    }
        
    /**
     * Find item in players inventory.
     */
    public boolean findItem(String name)
    {
        for(Items item : items) {
            if (item.getName().contains(name)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Prints all players inventory.
     */
    public void printItems()
    {
        for(Items item : items){
            item.printItem();
        }
    }
}
