package com.example.shopping_mall.Repository;

import com.example.shopping_mall.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
