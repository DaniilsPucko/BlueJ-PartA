import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Daniils Pucko) 
 * @version (29.11.2020)
 */
public class StockManager
{
    // A list of the products.
    public ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        int id = item.getID();
        for(Product product : stock) {
            if (product.getID()==id)
            {
                System.out.println("Error: product with this id already exists");
                break;
            }
            else
            {
                stock.add(item);
            }
        }
    }
    
    /**
     * Rename a product in the list by id.
     */
    public void renameProduct(int id, String name)
    {
        for(Product product : stock) {
            if (product.getID()==id)
            {
                product.rename(name);
            }
        }
    }
    
    /**
     * Remove a product from the list by id.
     */
    public void removeProduct(int id)
    {
        for (Product product : stock) {
            if(product.getID()==id)
            {
                stock.remove(product);
                break;
            }
        }
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for (Product product : stock) {
            if (product.getID()==id)
            {
                product.increaseQuantity(amount);
            }
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (Product product : stock) {
            if(product.getID()==id)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * Print a list of product by part of it's name.
     */
    public Product findByName(String name)
    {
        for (Product product : stock) {
            if(product.getName().contains(name))
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Print a list of products whose stock levels are low.
     */
    public void printLowStock()
    {
        for (Product product : stock) {
            if(product.getQuantity()<=5)
            {
                System.out.println(product);
            }
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            printProduct(id);
            product.sell(amount);
            printProduct(id);
        }
    }  
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for (Product product : stock) {
            if(product.getID()==id)
            {
                System.out.println(product.getQuantity());
            }
        }
        return 0;
    }
    
    public void ReStock()
    {
       for(Product p:stock) {
           if(p.getQuantity()<5)
           p.increaseQuantity(10);
        } 
    }
    
    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
        
    }

    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Daniil's Stock List");
        System.out.println("====================");
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
}
