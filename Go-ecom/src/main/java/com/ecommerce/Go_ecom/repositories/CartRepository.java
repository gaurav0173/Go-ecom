package com.ecommerce.Go_ecom.repositories;

import com.ecommerce.Go_ecom.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
