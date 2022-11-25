package com.sample.merchant.entity;

import lombok.Data;


// insert inside entity package by making an assumption as this is basically a table
@Data
public class Merchant {
    private String merchantId;
    private String merchantName;
}
