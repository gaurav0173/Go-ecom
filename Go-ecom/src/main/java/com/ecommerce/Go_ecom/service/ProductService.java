package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.payload.ProductDTO;
import com.ecommerce.Go_ecom.payload.ProductResponse;


public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, ProductDTO product);

    ProductDTO deleteProduct(Long productId);
}
