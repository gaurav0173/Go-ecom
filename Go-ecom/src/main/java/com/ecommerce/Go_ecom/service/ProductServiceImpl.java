package com.ecommerce.Go_ecom.service;

import com.ecommerce.Go_ecom.exceptions.ResourceNotFoundException;
import com.ecommerce.Go_ecom.model.Category;
import com.ecommerce.Go_ecom.model.Product;
import com.ecommerce.Go_ecom.payload.ProductDTO;
import com.ecommerce.Go_ecom.payload.ProductResponse;
import com.ecommerce.Go_ecom.repositories.CategoryRepository;
import com.ecommerce.Go_ecom.repositories.ProductRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

 @Autowired
 private ProductRepository productRepository;

 @Autowired
 private CategoryRepository categoryRepository;

 @Autowired
 private ModelMapper modelMapper;



    @Override
    public ProductDTO addProduct(Long categoryId,  Product product) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category", "categoryid", categoryId));
        product.setImage("default.png");
        product.setCategory(category);
        double specialPrice = product.getPrice() -
                ((product.getDiscount() * 0.01) * product.getPrice());
        product.setSpecialPrice(specialPrice);
       Product savedProduct = productRepository.save(product);
       return modelMapper.map(savedProduct, ProductDTO.class);
    }
    @Override
    public ProductResponse getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOS = products.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class)).toList();

        ProductResponse productResponse = new ProductResponse();
        productResponse.setContent(productDTOS);
        return productResponse;
    }

    @Override
    public ProductResponse searchByCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category", "categoryid", categoryId));

        List<Product> products = productRepository.findByCategoryOrderByPriceAsc(category);

        List<ProductDTO> productDTOS = products.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class)).toList();

        ProductResponse productResponse = new ProductResponse();
        productResponse.setContent(productDTOS);
        return productResponse;

    }


}
