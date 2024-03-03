package com.tahahanci.ecommerce.services.concretes;

import com.tahahanci.ecommerce.entities.Category;
import com.tahahanci.ecommerce.entities.Customer;
import com.tahahanci.ecommerce.repositories.abstracts.CustomerRepository;
import com.tahahanci.ecommerce.services.abstracts.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public Customer findByID(int id) {
        return customerRepository.findByID(id);
    }

    @Override
    public void add(Customer customer) {
        if (isCustomerExist(customer))
            throw new RuntimeException("Customer is already added!");
        customerRepository.add(customer);
    }

    @Override
    public void delete(int id) {
        Customer customerToDelete = findByID(id);
        if (customerToDelete == null)
            throw new RuntimeException("There is no such an customer!");
        customerRepository.delete(id);
    }

    @Override
    public void update(int id, Customer customer) {
        if (isCustomerExist(customer))
            throw new RuntimeException("This customer is already added!");
        if (isNameBlank(customer))
            throw new RuntimeException("Please enter a valid name");
        if (findByID(id) == null)
            throw new RuntimeException("There is no such a customer!");

    }

    private boolean isCustomerExist(Customer customerToCheck) {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            if (customer.getId() == customerToCheck.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean isNameBlank(Customer customer) {
        return customer.getCustomerName().isBlank();
    }

}
