package com.ecommerce.Go_ecom.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {       //REQUST OBJECT
    private Long CategoryId;
    private String CategoryName;
}
