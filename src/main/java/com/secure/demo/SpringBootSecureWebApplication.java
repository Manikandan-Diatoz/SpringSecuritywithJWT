package com.secure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.secure.demo.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootSecureWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecureWebApplication.class, args);
	}

}
