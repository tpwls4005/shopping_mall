package com.example.shopping_mall.Repository;

import com.example.shopping_mall.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}