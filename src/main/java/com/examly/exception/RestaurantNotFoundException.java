package com.examly.exception;

public class RestaurantNotFoundException extends Exception {
    public RestaurantNotFoundException(String message){
        super(message);
    }
}
