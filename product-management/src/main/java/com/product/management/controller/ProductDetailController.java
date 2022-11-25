package com.product.management.controller;

import com.product.management.entity.ProductDetail;
import com.product.management.service.ProductDetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("detail")
public class ProductDetailController {

    ProductDetailService service;

    @PutMapping
    public ProductDetail updateProductDetail(@RequestBody ProductDetail productDetail) {
        return service.updateProductDetail(productDetail);
    }

    @GetMapping("get/{id}")
    public ProductDetail getProductDetailById(@PathVariable Long id){
        return service.getProductDetailById(id);
    }

    @GetMapping("get")
    public List<ProductDetail> listProductDetail() {
        return service.getAllProductDetail();
    }


}
