package com.Aprendizado.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aprendizado.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
