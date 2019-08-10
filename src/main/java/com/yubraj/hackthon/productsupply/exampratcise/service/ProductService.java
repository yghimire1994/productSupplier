package com.yubraj.hackthon.productsupply.exampratcise.service;

import com.yubraj.hackthon.productsupply.exampratcise.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProduct();
}
