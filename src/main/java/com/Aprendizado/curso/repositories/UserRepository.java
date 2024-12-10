package com.Aprendizado.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aprendizado.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
