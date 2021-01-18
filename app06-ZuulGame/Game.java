
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * 
 * Modified and extended by Student Name
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    private Locations location;
    private Player player;
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        location = new Locations();
        parser = new Parser();
        player = new Player("Reporter Mike");
        currentRoom = location.startingRoom();
    }
    
    /**
     * Starts the game and does not end until player will say quit.
     */
    public void play()
    {
        printWelcome();
        boolean playing = true;
        while(playing){
            currentRoom.printRoom();
            player.printPlayer();
            System.out.println("In your inventory you have: ");
            player.printItems();
            String[] command1 = parser.getCommand();
            if (command1[0].equalsIgnoreCase("quit")){
                playing = false;
            }
            else
            {
                this.update(command1, player, currentRoom);
            }
        }
    }
    
    /**
     * Updates current player status.
     */
    public void update(String[] command1, Player p1, Room location1)
    {
        if (command1[0].equalsIgnoreCase("go"))
        {
            if (command1.length > 1)
            {
                int id = location1.getExit(command1[1]);
                if (id == -1) 
                {
                    System.out.println("Exit is locked, try to find something to open it.");
                }
                else if (id == 6)
                {
                    String name;
                    name = "Key";
                    if (p1.findItem(name) == true) {
                        currentRoom = location.getLocation(id);
                        System.out.println("You have used a key");
                    }
                    else {
                        System.out.println("You need a key to open this door");
                    }
                }
                else if (id == 7)
                {
                    String name;
                    name = "Card";
                    if (p1.findItem(name) == true) {
                        currentRoom = location.getLocation(id);
                        System.out.println("You have swiped a card and entered a room");
                        name = "Documentation";
                        if(p1.findItem(name) == true) {
                            System.out.println("Congratulations!");
                            System.out.println("You have found documentation.");
                            System.out.println("Now everyone will know, what is the reason of all deaths");
                            boolean playing = false;
                        }
                    }
                    else
                    {
                        System.out.println("You need a card to enter this room");
                    }
                }
                else if (id == 2)
                {
                    System.out.println("You can go this way");
                    p1.affectHealth(-20);
                    p1.printPlayer();
                }
                else
                {
                    System.out.println("You can go this way");
                    
                    currentRoom = location.getLocation(id);
                }
            }
            else 
            {
                System.out.println("You still have not typed where you want to go?");
            }
        }
        else if (command1[0].equalsIgnoreCase("take"))
        {
            if (command1.length > 1) 
            {
                Items item = location1.takeItem(command1[1]);
                if (item == null) 
                {
                    System.out.println("No such item in this room");
                }
                else if (item.getName().contains("Energy Drink"))
                {
                    p1.affectHealth(+20);
                    p1.printPlayer();
                }
                else
                {
                System.out.println("The" + item + " has been taken");
                player.addItem(item);
                }
            }
            else 
            {
            System.out.println("You have not said what to take");
            }
        }
    }   

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println("----Death Inc : Beginning ----");
        System.out.println("You are playing as Reporter Mike.");
        System.out.println("Corporation Death Inc invented deadly virus and spreaded it across the world");
        System.out.println("Your task is to find documentation, to prove that they are guilty");
        System.out.println("To do this, you went to abandonned city, where all this started");
        System.out.println("Good luck!");
        System.out.println("-------------------------------");
    }
}
