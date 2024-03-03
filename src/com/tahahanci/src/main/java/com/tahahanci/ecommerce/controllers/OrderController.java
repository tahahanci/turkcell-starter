package com.tahahanci.ecommerce.controllers;

import com.tahahanci.ecommerce.entities.Order;
import com.tahahanci.ecommerce.services.abstracts.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/id")
    public Order findByID(@RequestParam int id) {
        return orderService.findByID(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Order order) {
        orderService.add(order);
    }

    @DeleteMapping("/delete/id")
    public void delete(@RequestParam int id) {
        orderService.delete(id);
    }

    @PutMapping("/update/id")
    public void update(@RequestParam int id, @RequestBody Order order) {
        orderService.update(id, order);
    }
}
