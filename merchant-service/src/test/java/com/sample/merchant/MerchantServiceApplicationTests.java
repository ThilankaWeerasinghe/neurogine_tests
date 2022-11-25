package com.sample.merchant;

import com.sample.merchant.model.exception.MerchantCreateException;
import com.sample.merchant.model.exception.MerchantDeleteException;
import com.sample.merchant.service.MerchantService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MerchantServiceApplicationTests {

    @Autowired
    MerchantService service;

    @Test
    void merchantCreationTest_success(){

       MerchantCreateException ex = Assertions.assertThrows(MerchantCreateException.class, () -> {
            service.createMerchant("Test merchant","1");
        },"Merchant Creation Exception occured");
        Assertions.assertEquals("Merchant Creation Failed 1 Test merchant",ex.getLocalizedMessage());
    }

    @Test
    void merchantCreationTest_failure(){

        MerchantCreateException ex = Assertions.assertThrows(MerchantCreateException.class, () -> {
            service.createMerchant("Test merchant","1");
        },"Merchant Creation Exception occured");
        Assertions.assertNotEquals("Merchant Creation Failed Test merchant",ex.getLocalizedMessage());
    }

    @Test
    void merchantDeletionTest_success(){

        MerchantDeleteException ex = Assertions.assertThrows(MerchantDeleteException.class, () -> {
            service.deleteMerchant("1");
        },"Merchant deletion Exception occured");
        Assertions.assertEquals("Merchant Deletion failed 1",ex.getLocalizedMessage());
    }

    @Test
    void merchantDeletionTest_failure(){

        MerchantDeleteException ex = Assertions.assertThrows(MerchantDeleteException.class, () -> {
            service.deleteMerchant("1");
        },"Merchant deletion Exception occured");
        Assertions.assertNotEquals("Merchant Deletion failed",ex.getLocalizedMessage());
    }




}
