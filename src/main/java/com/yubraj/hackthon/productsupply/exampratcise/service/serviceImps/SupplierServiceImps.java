package com.yubraj.hackthon.productsupply.exampratcise.service.serviceImps;

import com.yubraj.hackthon.productsupply.exampratcise.model.Supplier;
import com.yubraj.hackthon.productsupply.exampratcise.repository.SupplierRepository;
import com.yubraj.hackthon.productsupply.exampratcise.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImps implements SupplierService {

    @Autowired
    private SupplierRepository repository;
    @Override
    public List<Supplier> getAllSupplier() {
        return repository.findAll();
    }
}
