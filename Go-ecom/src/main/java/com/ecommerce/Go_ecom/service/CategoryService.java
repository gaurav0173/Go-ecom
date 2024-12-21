package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long  categoryid);
    Category updateCategory (Category category, Long categoryId);

}
