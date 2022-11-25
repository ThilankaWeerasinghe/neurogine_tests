package com.product.management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productCode;
    private String productDesc;
    private String updatedOn;
//    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
//    @JoinColumn(name="productId")
//    private Product product;
}
