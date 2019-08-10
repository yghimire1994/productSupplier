package com.yubraj.hackthon.productsupply.exampratcise.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private long productNumber;
    private String productName;
    private double unitPrice;
    private int quantityInStock;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateSupplied;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplierId")
    private Supplier supplier;


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantityInStock=" + quantityInStock +
                ", dateSupplied=" + dateSupplied +
                ", supplier=" + supplier +
                '}';
    }
}
