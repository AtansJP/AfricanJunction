package com.africanjunction.groceryapi.services;

import com.africanjunction.groceryapi.models.Order;
import java.util.List;
import java.util.Optional;

public interface OrderManagementService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    void deleteOrder(Long id);
}
