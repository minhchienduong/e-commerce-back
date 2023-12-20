package com.vincent.ecommerce.service;

import com.vincent.ecommerce.dto.Purchase;
import com.vincent.ecommerce.entity.PurchaseResponse;
import org.springframework.stereotype.Service;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
