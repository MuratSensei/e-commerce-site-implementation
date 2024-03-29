package com.dolap.backend.ecommercesite.domain.product.exceptions;

import com.dolap.backend.ecommercesite.contracts.exception.ECommerceException;

public class ProductNotFoundException extends ECommerceException {

    public ProductNotFoundException() {
        super("Product not found.");
    }

}
