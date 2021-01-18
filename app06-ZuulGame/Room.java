import java.util.ArrayList;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Room 
{
    private String description;
    private String name;
    private int id;
    private ArrayList<Exit> exits;
    private ArrayList<Items> items;
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(int number, String title, String description) 
    {
        name = title;
        id = number;
        this.description = description;
        exits = new ArrayList<>();
        items = new ArrayList<>();
    }
    
    /**
     * Prints id of a room.
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Prints name of the room
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return description of the room
     * (the one that was defined in the constructor).
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Sets exits of the room.
     */
    public void setExit(String road, int id)
    {
        Exit exit = new Exit(id, road);
        exits.add(exit);
    }
    
    /**
     * Prints exits id.
     */
    public int getExit(String road)
    {
        for (Exit exit : exits) {
            if (exit.getRoad().contains(road)){
                return exit.getId();
            }
        }
        return 0;
    }
    
    /**
     * Prints all available exits in the room
     */
    public void printExits()
    {
        for(Exit exit : exits) {
            System.out.println(exit.getRoad());
        }
    }
    
    /**
     * Sets items in the room.
     */
    public void setItem(String name, String description)
    {
        Items item = new Items(name, description);
        items.add(item);
    }
    
    /**
     * Takes items for the room.
     */
    public Items takeItem(String name)
    {
        for(Items item : items) {
            if (item.getName().contains(name)){
                items.remove(item);
                return(item);
            }
        }
        return null;
    }
    
    /**
     * Prints available items in the room.
     */
    
    public void printItems()
    {
        for(Items item : items){
            item.printItem();
        }
    }
    
    /**
     * Prints all information about the room.
     */
    public void printRoom()
    {
        System.out.println("You are in " + this.name);
        System.out.println(this.description);
        System.out.println("You can go to the :");
        this.printExits();
        System.out.println("In the room there are: ");
        this.printItems();
    }

}

