package com.ecommerce.Go_ecom.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Go_ecom.model.OrderItem;



@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}