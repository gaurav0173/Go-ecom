package com.ecommerce.Go_ecom.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {              //RESPONSE OBJECT
    private List<CategoryDTO> Content;
}
