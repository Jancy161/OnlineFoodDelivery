package com.examly.entity;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    // Default Constructor
    public Customer() {}

    // Parameterized Constructor
    public Customer(int customerId, String name, String email, String phoneNumber, String password){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // Getters and Setters for the Customer
    public int getCustomerId(){return customerId;}
    public void setCustomerId(int customerId){this.customerId = customerId;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

}
