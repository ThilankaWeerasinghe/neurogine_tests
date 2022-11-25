package com.product.management.respository;

import com.product.management.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {

}
