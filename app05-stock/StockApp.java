
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    public static final String OUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_PRODUCTS = "printproducts";
    public static final String REMOVE = "remove";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String SEARCH = "search";
    public static final String LOW_STOCK = "lowstock";
    public static final String RE_STOCK = "restock";
    
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
    }

    /**
     * 
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput();
            if (choice.equals("quit"))
                finished = true;
        }
    }
    
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Daniils Pucko");
        System.out.println("******************************");
    }
}
