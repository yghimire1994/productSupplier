package com.yubraj.hackthon.productsupply.exampratcise.repository;

import com.yubraj.hackthon.productsupply.exampratcise.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
