package com.tahahanci.ecommerce.controllers;

import com.tahahanci.ecommerce.entities.Supplier;
import com.tahahanci.ecommerce.services.abstracts.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> getAll() {
        return supplierService.getAll();
    }

    @GetMapping("/id")
    public Supplier findByID(@RequestParam int id) {
        return supplierService.findByID(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Supplier supplier) {
        supplierService.add(supplier);
    }

    @DeleteMapping("/delete/id")
    public void delete(@RequestParam int id) {
        supplierService.delete(id);
    }

    @PutMapping("/update/id")
    public void update(@RequestParam int id, @RequestBody Supplier supplier) {
        supplierService.update(id, supplier);
    }


}
