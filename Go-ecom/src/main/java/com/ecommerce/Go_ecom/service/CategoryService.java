package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.model.Category;
import com.ecommerce.Go_ecom.payload.CategoryDTO;
import com.ecommerce.Go_ecom.payload.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String order);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long  categoryid);
    CategoryDTO updateCategory (CategoryDTO categoryDTO, Long categoryId);

}
