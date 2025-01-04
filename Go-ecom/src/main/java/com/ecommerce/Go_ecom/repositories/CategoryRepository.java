package com.ecommerce.Go_ecom.repositories;

import com.ecommerce.Go_ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long>{
    Category findByCategoryName( String categoryName);
}
