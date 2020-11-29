
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Daniils Pucko
 * @version 29.11.2020
 */
public class StockApp
{
    public static final String QUIT = "quit";
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
     * Checks choice to start or quit program.
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput();
            if (choice.equals("quit")){
                finished = true;
            }
            else {
                startChoiceMenu(choice);
            }
        }
    }

    /**
     * Executes program that is written by user.
     */
    private void startChoiceMenu(String choice)
    {
                if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
        }
        
        else if(choice.equals(PRINT_PRODUCTS))
        {
            manager.printAllProducts();
        }
        else if(choice.equals(DELIVER))
        {
            deliverProduct();
        }
        else if(choice.equals(SELL))
        {
            sellProduct();
        }
        else if(choice.equals(SEARCH))
        {
            printMatchingProduct();
        }
        else if(choice.equals(LOW_STOCK))
        {
            printLowStockdetails();
        }
        else if(choice.equals(RE_STOCK))
        {
            ReStock();
        }
        System.out.println("Input anything to continue");
        String value = input.getInput();
    }
    
    /**
     * Added functions for all choices in menu
     */
    //Searches for product in stock.
    private void printMatchingProduct()
    {
        System.out.println("Search for products");
        
        System.out.println("Please enter String");
        String name = input.getInput();
        
        manager.findByName(name);
        
    }
    
    //Restocks products.
    private void ReStock()
    {
        System.out.println("Re-stock products");
        
        manager.ReStock();
        manager.printAllProducts();
        
        
    }
    
    //Sells product.
    private void sellProduct()
    {
        System.out.println("Selling product...");
        
        System.out.println("Please enter the product ID");
        String value = input.getInput();
        int id = Integer.parseInt(value);
        String value2 = input.getInput();
        int amount = Integer.parseInt(value2);
        manager.sellProduct(id,amount);
        Product product = manager.findProduct(id);
        
        System.out.println("Product: " + product + "was sold");
        System.out.println();
    }
    
    //Prints info about products whose stock level are less than 5
    private void printLowStockdetails()
    {
        System.out.println("Low stock for products");
        
        manager.printLowStock();
       
    }
    
    //Adds product to stock list.
    private void addProduct()
    {
        System.out.println("Adding new product");
        System.out.println("\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getInput();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter name of the product");
        String name = input.getInput();
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println("\n");
        System.out.println(" You have addded " + product);
        System.out.println();
    }
    
    //Delivers products.
    private void deliverProduct()
    {
        System.out.println("Deliver new product");
        System.out.println("\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getInput();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the amount");
        value = input.getInput();
        int amount = Integer.parseInt(value);
        manager.delivery(id, amount);
        Product product = manager.findProduct(id);
        
        System.out.println("\n");
        System.out.println("You have delivered " + product);
        System.out.println();
    }
    
    //Removes product from stock list.
    private void removeProduct()
    {
        System.out.println("Remove product");
        System.out.println("\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getInput();
        int id = Integer.parseInt(value);
        
        Product product = manager.findProduct(id);
        
        manager.removeProduct(id);
        
        System.out.println("\n");
        System.out.println("You have removed " + product);
        System.out.println();
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:         Add a new product");
        System.out.println("    Remove:      Remove an old product");
        System.out.println("    PrintAll:    Print all products");
        System.out.println("    Quit:        Quit the program");
        System.out.println("    Deliver:     Delivers products");
        System.out.println("    Search:      Searches for products");
        System.out.println("    Low stock:   Shows low stock products");
        System.out.println("    Re-stock:    Re-stocks products");
        System.out.println("    Sell:        Sells products");
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
