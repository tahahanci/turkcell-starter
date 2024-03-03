package com.tahahanci.ecommerce.repositories.concretes;

import com.tahahanci.ecommerce.entities.Order;
import com.tahahanci.ecommerce.repositories.abstracts.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private List<Order> orderList = new ArrayList<>();

    public OrderRepositoryImpl(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }

    @Override
    public Order findByID(int id) {
        for (Order order : orderList) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public void add(Order order) {
        orderList.add(order);
    }

    @Override
    public void delete(int id) {
        Order order = findByID(id);
        orderList.remove(order);
    }

    @Override
    public void update(int id, Order orderToUpdate) {
        int i = 0;
        for (Order order : orderList) {
            if (orderToUpdate.getId() == id) {
                i = orderList.indexOf(order);
                break;
            }
        }
        orderList.set(i, orderToUpdate);
    }
}
