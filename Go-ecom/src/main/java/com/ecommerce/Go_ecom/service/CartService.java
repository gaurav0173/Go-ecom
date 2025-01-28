package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.payload.CartDTO;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
