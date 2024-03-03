package com.tahahanci.ecommerce.repositories.concretes;

import com.tahahanci.ecommerce.entities.Product;
import com.tahahanci.ecommerce.entities.Supplier;
import com.tahahanci.ecommerce.repositories.abstracts.SupplierRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SupplierRepositoryImpl implements SupplierRepository {

    private List<Supplier> supplierList = new ArrayList<>();

    public SupplierRepositoryImpl(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    @Override
    public List<Supplier> getAll() {
        return supplierList;
    }

    @Override
    public Supplier findByID(int id) {
        for (Supplier supplier : supplierList) {
            if (supplier.getId() == id) {
                return supplier;
            }
        }
        return null;
    }

    @Override
    public void add(Supplier supplier) {
        supplierList.add(supplier);
    }

    @Override
    public void delete(int id) {
        Supplier supplierToDelete = findByID(id);
        supplierList.remove(supplierToDelete);
    }

    @Override
    public void update(int id, Supplier supplierToUpdate) {
        int i = 0;
        for (Supplier supplier : supplierList) {
            if (supplierToUpdate.getId() == id) {
                i = supplierList.indexOf(supplier);
                break;
            }
        }
        supplierList.set(i, supplierToUpdate);
    }
}
