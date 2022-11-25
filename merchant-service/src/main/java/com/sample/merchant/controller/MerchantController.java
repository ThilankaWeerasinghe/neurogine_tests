package com.sample.merchant.controller;

import com.sample.merchant.dto.CommonResponse;
import com.sample.merchant.entity.Merchant;
import com.sample.merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("merchant")
public class MerchantController {

   @Autowired
   MerchantService service;

    @PostMapping
    public ResponseEntity<CommonResponse<Merchant>> createMerchant(@RequestBody Merchant merchant) throws Exception {
        CommonResponse<Merchant> response = CommonResponse.<Merchant>builder().resultCode("SUCCESS").results(service.createMerchant(merchant.getMerchantName(), merchant.getMerchantId())).build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CommonResponse> deleteMerchant(@PathVariable String id) throws Exception {
        service.deleteMerchant(id);
        CommonResponse response = CommonResponse.builder().resultCode("SUCCESS").build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
