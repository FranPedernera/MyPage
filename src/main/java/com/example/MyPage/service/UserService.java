package com.example.MyPage.service;

import com.example.MyPage.entity.User;
import com.example.MyPage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void resgisterUser(String nombre , String apellido , String contraseña ,String email){
        User user = new User();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setEmail(email);
        user.setConstraseña(passwordEncoder.encode(contraseña));
        userRepository.save(user);
    }
    
}
