/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Huawei P40 Pro"));
        manager.addProduct(new Product(105, "Honor 10"));
        manager.addProduct(new Product(106, "Samsung A5"));
        manager.addProduct(new Product(107, "Xiaomi Mi 10"));
        manager.addProduct(new Product(108, "Xiaomi RedMi Note"));
        manager.addProduct(new Product(109, "Samsung Galaxy Tab 2"));
        manager.addProduct(new Product(110, "Apple IPOD"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProducts()
    {
        // Show details of all of the products before delivery.
        manager.printAllProducts();
        
        // Take delivery of 10 items of one of the products.
        manager.delivery(101, 5);
        manager.delivery(102, 23);
        manager.delivery(103, 14);
        manager.delivery(104, 12);
        manager.delivery(105, 17);
        manager.delivery(106, 1);
        manager.delivery(107, 22);
        manager.delivery(108, 29);
        manager.delivery(109, 34);
        manager.delivery(110, 40);
        
        // Show the list of all products after delivery
        System.out.println("Updated list of products.");
        manager.printAllProducts();
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demoSell(int id, int amount)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            showDetails(id);
            product.sell(amount);
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }
    
    /**
     * Test product rename method.
     */
    public void demoRename()
    {
        manager.printProduct(101);
        manager.renameProduct(101, "Samsung Galaxy S30");
        System.out.println(" ");
        System.out.println("Products name was changed to: ");
        manager.printProduct(101);
    }
    
    /**
     * Test product remove method.
     */
    public void demoRemove()
    {
        manager.printAllProducts();
        manager.removeProduct(102);
        System.out.println(" ");
        System.out.println("Product list after removing: ");
        manager.printAllProducts();
    }
    
    /**
     * Test finding product by name part.
     */
    public void demoFindByName()
    {
        manager.printAllProducts();
        Product product = manager.findByName("Apple");
        System.out.println("");
        System.out.println("Products found by name: ");
        System.out.println(product.toString() );
    }
    
    /**
     * Test finding product by low stock level.
     */
    public void demoLowStock(int amount)
    {
        manager.printLowStock(amount);
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
