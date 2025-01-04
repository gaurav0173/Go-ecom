package com.ecommerce.Go_ecom.repositories;


import com.ecommerce.Go_ecom.model.Category;
import com.ecommerce.Go_ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByCategoryOrderByPriceAsc(Category category);
}
