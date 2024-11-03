package com.edu.pe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.edu.pe.dtos.DTOUser;
import com.edu.pe.entities.*;
import com.edu.pe.services.*;

@SpringBootApplication
public class SecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJwtApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(
		UserService userService,
		AuthorityService authorityService
	) {
		return args -> {

			authorityService.addAuthority(new Authority(0L,"ADMIN",null));
			authorityService.addAuthority(new Authority(0L,"VENDEDOR",null));

			userService.addUser(new DTOUser(0L,"admin","123456",true,"ADMIN;VENDEDOR"));
			userService.addUser(new DTOUser(0L,"vendedor","123456",true,"VENDEDOR"));
		};
	}
}
