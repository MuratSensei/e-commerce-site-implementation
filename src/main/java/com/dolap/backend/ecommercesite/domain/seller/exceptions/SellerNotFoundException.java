package com.dolap.backend.ecommercesite.domain.seller.exceptions;

import com.dolap.backend.ecommercesite.contracts.exception.ECommerceException;

public class SellerNotFoundException extends ECommerceException {

    public SellerNotFoundException() {
        super("Seller not found.");
    }

}
