package com.example.shopping_mall.Repository;


import com.example.shopping_mall.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}