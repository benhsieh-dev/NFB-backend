package com.nfb.ecommerce.service;

import com.nfb.ecommerce.dto.Purchase;
import com.nfb.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
