package com.yubraj.hackthon.productsupply.exampratcise.service.serviceImps;

import com.yubraj.hackthon.productsupply.exampratcise.model.Product;
import com.yubraj.hackthon.productsupply.exampratcise.repository.ProductRepository;
import com.yubraj.hackthon.productsupply.exampratcise.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImps implements ProductService {

    @Autowired
    private ProductRepository repository;
    @Override

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return repository.findAll();
    }
}
