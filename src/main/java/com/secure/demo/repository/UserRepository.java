package com.secure.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.demo.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	Optional<User> findByUsername(String username);
}
