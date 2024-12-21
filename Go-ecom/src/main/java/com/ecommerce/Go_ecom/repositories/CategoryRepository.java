package com.ecommerce.Go_ecom.repositories;

import com.ecommerce.Go_ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CategoryRepository extends JpaRepository<Category,Long>{
}
