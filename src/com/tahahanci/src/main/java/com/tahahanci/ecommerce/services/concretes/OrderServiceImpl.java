package com.tahahanci.ecommerce.services.concretes;

import com.tahahanci.ecommerce.entities.Order;
import com.tahahanci.ecommerce.repositories.abstracts.OrderRepository;
import com.tahahanci.ecommerce.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    @Override
    public Order findByID(int id) {
        return orderRepository.findByID(id);
    }

    @Override
    public void add(Order order) {
        if (isOrderExist(order))
            throw new RuntimeException("This is already ordered!");
        orderRepository.add(order);
    }

    @Override
    public void delete(int id) {
        Order orderToDelete = findByID(id);
        if (orderToDelete == null)
            throw new RuntimeException("There is no such an order!");
        orderRepository.delete(id);
    }

    @Override
    public void update(int id, Order orderToUpdate) {
        if (findByID(id) == null)
            throw new RuntimeException("There is no such an order!");
        orderRepository.update(id, orderToUpdate);
    }

    private boolean isOrderExist(Order orderToCheck) {
        List<Order> orderList = orderRepository.getAll();
        for (Order order : orderList) {
            if (order.getId() == orderToCheck.getId()) {
                return true;
            }
        }
        return false;
    }
}
