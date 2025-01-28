package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.payload.CartDTO;

import java.util.List;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);

    List<CartDTO> getAllCarts();
}
