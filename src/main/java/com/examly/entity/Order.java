package com.examly.entity;

public class Order {
    private int orderId;
    private int customerId;
    private int restaurantId;
    private String orderStatus;
    private double totalPrice;
    private String deliveryAddress;

    // Default Constructor
    public Order() {}

    // Parameterized Constructor
    public Order(int orderId, int customerId, int restaurantId, String orderStatus, double totalPrice, String deliveryAddress){
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.orderStatus = orderStatus;
        this.totalPrice = totalPrice;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters and Setters for the Order
    public int getOrderId(){return orderId;}
    public void setOrderId(int orderId){this.orderId = orderId;}

    public int getCustomerId(){return customerId;}
    public void setCustomerId(int customerId){this.customerId = customerId;}

    public int getRestaurantId(){return restaurantId;}
    public void setRestaurantId(int restaurantId){this.restaurantId = restaurantId;}

    public String getOrderStatus(){return orderStatus;}
    public void setOrderStatus(String orderStatus){this.orderStatus = orderStatus;}

    public double getTotalPrice(){return totalPrice;}
    public void setTotalPrice(double totalPrice){this.totalPrice = totalPrice;}

    public String getDeliveryAddress(){return deliveryAddress;}
    public void setDeliveryAddress(String deliveryAddress){this.deliveryAddress = deliveryAddress;}

}
