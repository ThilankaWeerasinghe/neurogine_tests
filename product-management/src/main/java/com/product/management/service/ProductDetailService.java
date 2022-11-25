package com.product.management.service;

import com.product.management.entity.ProductDetail;
import com.product.management.respository.ProductDetailRepository;
import lombok.AllArgsConstructor;
import org.apache.tomcat.jni.Proc;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductDetailService {

    ProductDetailRepository productDetailRepository;

    public List<ProductDetail> getAllProductDetail() {
        return productDetailRepository.findAll();
    }

    public ProductDetail updateProductDetail(ProductDetail productDetail) {
        Optional<ProductDetail> productDetail1 = productDetailRepository.findById(productDetail.getId());
        if (productDetail1.isPresent() && productDetail1.get().getId().equals(productDetail.getId())){
                return productDetailRepository.save(productDetail);
            }

        return null;  // we should throw an exception at this point and send a proper error message to the api consumer
    }

    public ProductDetail getProductDetailById(Long id) {
        return productDetailRepository.findById(id).get(); // here also we must check the presence of the object and if its not available an exception should be thrown and it should populate to the consumer
    }
}
