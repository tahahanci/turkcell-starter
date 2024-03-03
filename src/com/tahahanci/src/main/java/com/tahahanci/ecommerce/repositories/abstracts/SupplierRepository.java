package com.tahahanci.ecommerce.repositories.abstracts;

import com.tahahanci.ecommerce.entities.Supplier;

import java.util.List;

public interface SupplierRepository {

    List<Supplier> getAll();
    Supplier findByID(int id);
    void add(Supplier supplier);
    void delete(int id);
    void update(int id, Supplier supplier);
}
