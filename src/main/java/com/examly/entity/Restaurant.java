package com.examly.entity;

public class Restaurant {
    private int restaurantId;
    private String name;
    private String address;
    private String cuisineType;
    private String contactNumber;

    // Default Constructor
    public Restaurant() {}

    // Parameterized Constructor
    public Restaurant(int restaurantId, String name, String address, String cuisineType, String contactNumber){
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters for the Restaurant
    public int getRestaurantId(){return restaurantId;}
    public void setRestaurantId(int restaurantId){this.restaurantId = restaurantId;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public String getCuisineType(){return cuisineType;}
    public void setCuisineType(String cuisineType){this.cuisineType = cuisineType;}

    public String getContactNumber(){return contactNumber;}
    public void setContactNumber(String contactNumber){this.contactNumber = contactNumber;}

}
