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
        locations.add(location);
        location.setExit("Shop", 3);
        location.setExit("Pub", 1);
        location.setExit("Lab", 6);
        location.setExit("Theatre", 2);
        
        location = new Room(1, "Pub", "You are now in a destroyed pub.");
        locations.add(location);
        location.setItem("Energy Drink", "Restore 20hp");
        location.setExit("Outside", 0);
        
        location = new Room(2, "Theater", "You are now in a burned theater. You cross a wire and a wooden plank hits your head, dealing 20 hp damage");
        locations.add(location);
        location.setItem("Wire", "It might be useful later.");
        location.setExit("Outside", 0);
        
        location = new Room(3, "Shop", "You entered an old building, which looks like a shop");
        locations.add(location);
        location.setExit("Outside", 0);
        location.setExit("Backyard", 4);
        location.setExit("Warehouse", 5);
        
        location = new Room(4, "Shop's backyard", "You are on the shop's backyard with a bunch of trash boxes");
        locations.add(location);
        location.setItem("Key", "Looks like a key from a door");
        location.setExit("Shop", 3);
        
        location = new Room(5, "Warehouse", "You are in the shop's ware house.");
        locations.add(location);
        location.setItem("Wooden doll", "Might be useful later.");
        location.setExit("Shop", 3);
        
        location = new Room(6, "Death Inc Lab", "You are in the building, where the virus was invented");
        locations.add(location);
        location.setItem("Card", "Looks like a card of Death Inc's scientist Mark Oliver");
        location.setExit("Outside", 0);
        location.setExit("Office", 7);
        
        location = new Room(7, "Death Inc office", "Here you can find all the truth about what happened");
        locations.add(location);
        location.setExit("Lab", 6);
        location.setItem("Documentation", "Documentation, with proves that Death Inc is guilty");
        
    }
    
    /**
     * Prints your current all the locations.
     */
    public void printLocations()
    {
        for(Room room : locations) {
            System.out.println("----GPS----");
            System.out.println(room.getName());
            System.out.println(room.getDescription());
            System.out.println("Exits: ");
            room.printExits();
        }
    }
    
    /**
     * Spawnpoint.
     */
    public Room startingRoom()
    {
        return locations.get(3);
    }
    
    /**
     * Returns room's id.
     */
    public Room getLocation(int id)
    {
        return locations.get(id);
    }
}
