package com.example.shopping_mall.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name = "Product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private double price;

  @Column(nullable = false)
  private String description;

  @Column(nullable = false)
  private String imageUrl;

  // 생성자, getter 및 setter
}

