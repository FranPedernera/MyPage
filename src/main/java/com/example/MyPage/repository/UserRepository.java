package com.example.MyPage.repository;

import com.example.MyPage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String nombre , String apellido , String email , String contraseña);
}
