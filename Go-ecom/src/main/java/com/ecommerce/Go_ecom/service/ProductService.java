package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.model.Product;
import com.ecommerce.Go_ecom.payload.ProductDTO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);
}
