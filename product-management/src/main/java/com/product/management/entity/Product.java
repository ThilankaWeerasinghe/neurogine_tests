package com.product.management.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String created;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_detail")
    private ProductDetail detail;
}
