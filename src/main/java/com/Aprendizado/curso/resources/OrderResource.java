package com.Aprendizado.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aprendizado.curso.entities.Order;
import com.Aprendizado.curso.services.OrderService;

// Essa classse vai disponibilizar um recurso web correspondente a entidade Order.

// Para falarmos que essa classe é um recurso web que é implementada por um controlador rest, vamos colocar uma anotation em cima da classe 
// Depois vamos dar um nome para o nosso recurso que é o RequestMapping
@RestController
@RequestMapping(value = "/orders") // caminho Orders
public class OrderResource {
	
	@Autowired
	private OrderService service;

// Método que vai ser um endpoint para acessar os usuários e usaremos o ResponseEntity, pois ele serve para retornar respostas de requisições web
    @GetMapping //serve para indicar que esse método abaixo será um método que responde a requisição do tipo Get do http.
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
    
    @GetMapping(value= "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
    	Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
    }

    // Esse é nosso controlador Rest que responde no caminho Orders
}
