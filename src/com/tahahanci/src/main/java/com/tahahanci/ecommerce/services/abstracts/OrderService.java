package com.tahahanci.ecommerce.services.abstracts;

import com.tahahanci.ecommerce.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAll();

    Order findByID(int id);

    void add(Order order);
    void delete(int id);
    void update(int id, Order orderToUpdate);
}
