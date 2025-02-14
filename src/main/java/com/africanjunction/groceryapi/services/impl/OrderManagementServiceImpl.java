package com.africanjunction.groceryapi.services.impl;

import com.africanjunction.groceryapi.models.Order;
import com.africanjunction.groceryapi.repositories.OrderRepository;
import com.africanjunction.groceryapi.services.OrderManagementService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderManagementServiceImpl implements OrderManagementService {
    private final OrderRepository orderRepository;

    public OrderManagementServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

