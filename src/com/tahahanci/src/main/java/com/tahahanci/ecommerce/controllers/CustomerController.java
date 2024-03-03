package com.tahahanci.ecommerce.controllers;

import com.tahahanci.ecommerce.entities.Customer;
import com.tahahanci.ecommerce.services.abstracts.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @GetMapping("/id")
    public Customer findByID(@RequestParam int id) {
        return customerService.findByID(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Customer customer) {
        customerService.add(customer);
    }

    @DeleteMapping("/delete/id")
    public void delete(@RequestParam int id) {
        customerService.delete(id);
    }

    @PutMapping("/update/id")
    public void update(@RequestParam int id, @RequestBody Customer customer) {
        customerService.update(id, customer);
    }

}
