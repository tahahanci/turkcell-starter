package com.tahahanci.ecommerce.repositories.abstracts;

import com.tahahanci.ecommerce.entities.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAll();
    Customer findByID(int id);
    void add(Customer customer);
    void delete(int id);
    void update(int id, Customer customer);
}
