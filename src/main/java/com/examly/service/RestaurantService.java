package com.examly.service;

import java.util.List;
import com.examly.entity.Restaurant;

public interface RestaurantService {
    boolean createRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
} 
