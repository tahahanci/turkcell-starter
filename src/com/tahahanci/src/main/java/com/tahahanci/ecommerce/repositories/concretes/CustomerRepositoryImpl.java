package com.tahahanci.ecommerce.repositories.concretes;

import com.tahahanci.ecommerce.entities.Category;
import com.tahahanci.ecommerce.entities.Customer;
import com.tahahanci.ecommerce.repositories.abstracts.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private List<Customer> customerList = new ArrayList<>();

    public CustomerRepositoryImpl(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public Customer findByID(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void delete(int id) {
        Customer customer = findByID(id);
        customerList.remove(customer);
    }

    @Override
    public void update(int id, Customer customerToUpdate) {
        int i = 0;
        for (Customer customer : customerList) {
            if (customerToUpdate.getId() == id) {
                i = customerList.indexOf(customer);
                break;
            }
        }
        customerList.set(i, customerToUpdate);
    }
}
