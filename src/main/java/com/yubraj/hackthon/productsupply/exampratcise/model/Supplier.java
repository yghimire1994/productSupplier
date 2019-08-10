package com.yubraj.hackthon.productsupply.exampratcise.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplierId;
    private String supplierNumber;
    private String supplierName;
    private String contactphoneNumber;
    @OneToMany( mappedBy = "supplier", cascade = CascadeType.ALL)
    List<Product> products=new ArrayList<>();

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactphoneNumber() {
        return contactphoneNumber;
    }

    public void setContactphoneNumber(String contactphoneNumber) {
        this.contactphoneNumber = contactphoneNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierNumber='" + supplierNumber + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", contactphoneNumber='" + contactphoneNumber + '\'' +
                ", products=" + products +
                '}';
    }
}
