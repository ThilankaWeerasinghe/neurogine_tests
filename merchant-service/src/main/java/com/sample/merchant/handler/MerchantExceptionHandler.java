package com.sample.merchant.handler;

import com.sample.merchant.dto.CommonResponse;
import com.sample.merchant.model.exception.MerchantCreateException;
import com.sample.merchant.model.exception.MerchantDeleteException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MerchantExceptionHandler {


    //you can either return resposne entity object or customized response object. here I have used customized response object for demonstration purposes


    @ExceptionHandler(MerchantCreateException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public CommonResponse<String> handleMerchantCreateException(MerchantCreateException e){
         return  CommonResponse.<String>builder().resultCode("FAILED").errors(e.getLocalizedMessage()).build();
    }

    @ExceptionHandler(MerchantDeleteException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public CommonResponse<String> handleMerchantDeletionException(MerchantDeleteException e){
        return CommonResponse.<String>builder().resultCode("FAILED").errors(e.getLocalizedMessage()).build();
    }
}
