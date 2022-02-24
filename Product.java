/**
 * Assignment 1, exercise 4
 * Product Class:
 *  Should contain the following fields: product name, product 
 *      description, product price, maximum quantity allowed to be ordered.
 *  Should contain getters for all its attributes and also needs a fully 
 *      parameterized constructor.
 * 
 * @author Thuy Tran
 *  February 21,2022
 */

public class Product {
    // variables
    private String name;
    private String description;
    private double price;
    private int maximum;

    /**
     * Constructor of Product Class
     * @param name product name
     * @param description product description
     * @param price product price
     * @param maximum maximum quantity allowed to be ordered
     */
    public Product(String name, String description, double price, int maximum) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.maximum = maximum;
    }

    /**
     * getter for the product name
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for the product name
     * @param name product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for the product description
     * @returm product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for the product description
     * @param description product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter for the product price 
     * @return product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setter for the product price
     * @param price product price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for the maximum quantity allowed to be ordered
     * @return maximum quantity allowed to be ordered
     */
    public int getMaximun() {
        return maximum;
    }

    /**
     * setter for the maximum quantity allowed to be ordered
     * @param maximum maximum quantity allowed to be ordered
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    /**
     * convert a product into string 
     * in the format:
     * Product Name: <name>
     * Product Description: <description>
     * Product Price: <price>
     * Maximum Quantity: <maximum>
     */
    @Override
    public String toString() {
        return "Product Name: " + name +
                "\nProduct Description: " + description +
                "\nProduct Price: " + price +
                "\nMaximum Quantity: " + maximum;
    }

}