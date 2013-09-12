package edu.uno.csci4661.grocerylist.model;

/**
 * Created by danielward on 9/12/13.
 */
public class GroceryItem {
    String name;
    String description;
    int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
