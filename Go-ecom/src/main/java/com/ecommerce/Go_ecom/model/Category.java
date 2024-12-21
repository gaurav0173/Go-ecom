package com.ecommerce.Go_ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
 public class Category {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long categoryId;
     private String categoryName;



}
