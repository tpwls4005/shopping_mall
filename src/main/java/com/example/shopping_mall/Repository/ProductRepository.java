package com.example.shopping_mall.Repository;

import com.example.shopping_mall.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
