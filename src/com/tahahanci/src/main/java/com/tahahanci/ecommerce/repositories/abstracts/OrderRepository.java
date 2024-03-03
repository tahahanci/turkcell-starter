package com.tahahanci.ecommerce.repositories.abstracts;

import com.tahahanci.ecommerce.entities.Order;

import java.util.List;

public interface OrderRepository {

    List<Order> getAll();

    Order findByID(int id);

    void add(Order order);
    void delete(int id);
    void update(int id, Order orderToUpdate);
}
