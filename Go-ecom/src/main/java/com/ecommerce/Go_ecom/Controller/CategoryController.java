package com.ecommerce.Go_ecom.Controller;

import com.ecommerce.Go_ecom.model.Category;
import com.ecommerce.Go_ecom.payload.CategoryDTO;
import com.ecommerce.Go_ecom.payload.CategoryResponse;
import com.ecommerce.Go_ecom.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public ResponseEntity<CategoryResponse> getAllCategories() {
         CategoryResponse categoryResponse= categoryService.getAllCategories();
        return new ResponseEntity<>(categoryResponse, HttpStatus.OK);

    }

    @PostMapping("/api/public/categories")
    public ResponseEntity<CategoryDTO> creatCategory(@Valid @RequestBody CategoryDTO categoryDTO) {
       CategoryDTO  savedCategoryDTO =categoryService.createCategory(categoryDTO);
        return new ResponseEntity<>(savedCategoryDTO , HttpStatus.CREATED);
    }

    @DeleteMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {

            String status = categoryService.deleteCategory(categoryId);
            return new ResponseEntity<>(status, HttpStatus.OK);

    }
    @PutMapping("/api/public/categories/{categoryId}")

        public ResponseEntity<CategoryDTO> updateCategory( @Valid @RequestBody CategoryDTO categoryDTO, @PathVariable Long categoryId) {
        CategoryDTO savedCategoryDTO = categoryService.updateCategory(categoryDTO,categoryId);
        return new ResponseEntity<>(savedCategoryDTO , HttpStatus.OK);
    }
}