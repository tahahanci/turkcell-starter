package com.tahahanci.ecommerce.services.concretes;

import com.tahahanci.ecommerce.entities.Supplier;
import com.tahahanci.ecommerce.repositories.abstracts.SupplierRepository;
import com.tahahanci.ecommerce.services.abstracts.SupplierService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAll() {
        return supplierRepository.getAll();
    }

    @Override
    public Supplier findByID(int id) {
        return supplierRepository.findByID(id);
    }

    @Override
    public void add(Supplier supplier) {
        if (isSupplierExist(supplier))
            throw new RuntimeException("These supplier is already added!");
        if (isNameBlank(supplier))
            throw new RuntimeException("Please enter a valid name!");
        supplierRepository.add(supplier);
    }

    @Override
    public void delete(int id) {
        Supplier supplierToDelete = findByID(id);
        if (supplierToDelete == null)
            throw new RuntimeException("There is no such a customer!");
        supplierRepository.delete(id);
    }

    @Override
    public void update(int id, Supplier supplierToAdded) {
        if (isSupplierExist(supplierToAdded))
            throw new RuntimeException("This supplier is already added!");
        if (isNameBlank(supplierToAdded))
            throw new RuntimeException("Please enter a valid name!");
        if (findByID(id) == null)
            throw new RuntimeException("There is no such a supplier");
        supplierRepository.add(supplierToAdded);
    }

    private boolean isSupplierExist(Supplier supplierToCheck) {
        List<Supplier> supplierList = supplierRepository.getAll();
        for (Supplier supplier : supplierList) {
            if (supplierToCheck.getSupplierName().equals(supplier.getSupplierName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isNameBlank(Supplier supplier) {
        return supplier.getSupplierName().isBlank();
    }
}
