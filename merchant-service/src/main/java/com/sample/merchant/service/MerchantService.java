package com.sample.merchant.service;

import com.sample.merchant.entity.Merchant;
import com.sample.merchant.model.exception.MerchantCreateException;
import com.sample.merchant.model.exception.MerchantDeleteException;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    public Merchant createMerchant(String name, String merchantId) throws MerchantCreateException{
        throw new MerchantCreateException("Merchant Creation Failed " + merchantId + " " +name);
    }

    public void deleteMerchant(String merchantId) throws MerchantDeleteException {
        throw new MerchantDeleteException("Merchant Deletion failed " + merchantId);

    }
}
