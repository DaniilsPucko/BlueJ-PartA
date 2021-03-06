/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modified by Daniils Pucko (29.11.2020)
 */
public class Product
{
    // An identifying number for this product.
    public int id;
    // The name of this product.
    public String name;
    // The quantity of this product in stock.
    public int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }
    
    /**
     * Rename a product
     */
    public void rename (String newName)
    {
        this.name=newName;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sell(int amount)
    {
        if(quantity > amount) 
        {
            quantity-= amount;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
    
    /**
     * Prints info about product.
     */
    public void print()
    {
        System.out.println("Product ID: " + id);
        System.out.println("Product name: " + name);
        System.out.println("Product quantity:" + quantity);
    }
}
