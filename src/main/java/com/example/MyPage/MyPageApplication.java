package com.example.MyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MyPage.service.UserService;

@SpringBootApplication
public class MyPageApplication {
	
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(MyPageApplication.class, args);
	}

	@GetMapping("/register")
	public String mostrarRegistro(){
		return "register";
	}

	@PostMapping("/register")
	public String register (@RequestParam String emial ,@RequestParam String nombre ,
				@RequestParam String apellido , @RequestParam String contraseña ){
					userService.resgisterUser(nombre, apellido, contraseña, contraseña);
					return "redirect : login ";
	}

	@GetMapping("/login")
	public String mostrarLogin (){
		return "login";
	}

}
