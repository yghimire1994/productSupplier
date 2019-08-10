package com.yubraj.hackthon.productsupply.exampratcise.controller;

import com.yubraj.hackthon.productsupply.exampratcise.model.Product;
import com.yubraj.hackthon.productsupply.exampratcise.model.Supplier;
import com.yubraj.hackthon.productsupply.exampratcise.service.ProductService;
import com.yubraj.hackthon.productsupply.exampratcise.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @Autowired
    private SupplierService supplierService;

    @GetMapping(value = "/displayProcuctList")
    public String displayProducts(ModelMap modelMap) {
        List<Product> productList = service.getAllProduct();
        modelMap.addAttribute("productList", productList);
        return "ProductList";
    }
    @GetMapping(value = "/showCreateProduct")
    public String displayCreatePage(Model model){
        List<Supplier> suppliers=supplierService.getAllSupplier();
        model.addAttribute("suppliers",suppliers);
        model.addAttribute("product", new Product());
       // List<Supplier>
        return "createProductPage";
    }

    @PostMapping(value = "/saveproduct")
    public String saveProducts(@ModelAttribute("product") Product product, ModelMap modelMap) {
        Product productSaved = service.saveProduct(product);
        String message = "Student saved with id" + productSaved.getProductId();
        modelMap.addAttribute("message", message);
        return "createProductPage";
    }

}
