package com.examly.entity;

public class MenuItem {
    private int itemId;
    private int restaurantId;
    private String name;
    private double price;
    private String description;
    private int availableQuantity;

    // Default Constructor
    public MenuItem() {}

    // Parameterized Constructor
    public MenuItem(int itemId, int restaurantId, String name, double price, String description, int availableQuantity){
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.availableQuantity = availableQuantity;
    }

    // Getters and Setters for the MenuItem
    public int getItemId(){return itemId;}
    public void setItemId(int itemId){this.itemId = itemId;}

    public int getRestaurantId(){return restaurantId;}
    public void setRestaurantId(int restaurantId){this.restaurantId = restaurantId;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public double getPrice(){return price;}
    public void setPrice(double price){this.price = price;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public int getAvailableQuantity(){return availableQuantity;}
    public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}

}
