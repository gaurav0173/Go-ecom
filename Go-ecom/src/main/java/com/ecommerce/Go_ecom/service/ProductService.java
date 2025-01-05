package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.model.Product;
import com.ecommerce.Go_ecom.payload.ProductDTO;
import com.ecommerce.Go_ecom.payload.ProductResponse;


public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, Product product);

    ProductDTO deleteProduct(Long productId);
}
