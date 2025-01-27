package com.ecommerce.Go_ecom.repositories;

import com.ecommerce.Go_ecom.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
