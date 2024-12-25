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


@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/public/categories")
    public ResponseEntity<CategoryResponse> getAllCategories(
            @RequestParam(name = "pageNumber") Integer pageNumber,
            @RequestParam(name = "pageSize")  Integer pageSize){

         CategoryResponse categoryResponse= categoryService.getAllCategories(pageNumber , pageSize);
        return new ResponseEntity<>(categoryResponse, HttpStatus.OK);

    }

    @PostMapping("/public/categories")
    public ResponseEntity<CategoryDTO> creatCategory(@Valid @RequestBody CategoryDTO categoryDTO) {
       CategoryDTO  savedCategoryDTO =categoryService.createCategory(categoryDTO);
        return new ResponseEntity<>(savedCategoryDTO , HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/categories/{categoryId}")
    public ResponseEntity<CategoryDTO> deleteCategory(@PathVariable Long categoryId) {

            CategoryDTO deletedCategory = categoryService.deleteCategory(categoryId);
            return new ResponseEntity<>(deletedCategory, HttpStatus.OK);

    }
    @PutMapping("/public/categories/{categoryId}")

        public ResponseEntity<CategoryDTO> updateCategory( @Valid @RequestBody CategoryDTO categoryDTO, @PathVariable Long categoryId) {
        CategoryDTO savedCategoryDTO = categoryService.updateCategory(categoryDTO,categoryId);
        return new ResponseEntity<>(savedCategoryDTO , HttpStatus.OK);
    }
}