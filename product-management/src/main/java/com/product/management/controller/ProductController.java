package com.product.management.controller;

import com.product.management.entity.Product;
import com.product.management.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {


    //Since the application is basically focused on CRUD operations common response entity did not used. but in the best practice we should use common response entity instead of returning generic table entities

    // in best practice we should not use entity classes as response Body or request body we should use dto instead of entity classes =

    ProductService service;

    @PostMapping("create")
    public Product createProduct(@RequestBody Product product) {
        return service.createProduct(product);
    }

    @GetMapping("get")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("get/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return  service.getProductById(id);
    }

    @PutMapping("update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }


    @DeleteMapping("delete/{id}")
    public Product deteleProduct(@PathVariable Long id){
        return service.deleteProduct(id);
    }
}
