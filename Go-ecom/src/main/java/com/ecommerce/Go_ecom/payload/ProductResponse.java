package com.ecommerce.Go_ecom.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private List<ProductDTO> content;
    private Integer pageNumber;
    private Long totalElements;
    private Integer pageSize;
    private Integer totalPages;
    private boolean LastPage;
}
