package com.yubraj.hackthon.productsupply.exampratcise.repository;

import com.yubraj.hackthon.productsupply.exampratcise.model.Product;
import com.yubraj.hackthon.productsupply.exampratcise.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
