package com.examly.service;

import java.util.List;
import com.examly.entity.MenuItem;
import com.examly.exception.RestaurantNotFoundException;

public interface MenuService {
    boolean createMenuItem(MenuItem menuItem) throws RestaurantNotFoundException;
    List<MenuItem> getMenuItemsByRestaurant(int restaurantId);
} 
