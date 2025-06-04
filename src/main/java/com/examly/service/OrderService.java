package com.examly.service;

import java.util.List;

import com.examly.entity.Order;
import com.examly.entity.OrderItem;

public interface OrderService {
    boolean createOrder(Order order, List<OrderItem> orderedItems);
    List<Order> getOrdersByCustomer(int customerId);
    Order getOrderById(int orderId);
    boolean updateOrderStatus(int orderId, String status);
}
