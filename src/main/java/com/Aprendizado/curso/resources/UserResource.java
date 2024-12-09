package com.Aprendizado.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aprendizado.curso.entities.User;

// Essa classse vai disponibilizar um recurso web correspondente a entidade User.

// Para falarmos que essa classe é um recurso web que é implementada por um controlador rest, vamos colocar uma anotation em cima da classe 
// Depois vamos dar um nome para o nosso recurso que é o RequestMapping
@RestController
@RequestMapping(value = "/Users") // caminho users
public class UserResource {

// Método que vai ser um endpoint para acessar os usuários e usaremos o ResponseEntity, pois ele serve para retornar respostas de requisições web
    @GetMapping //serve para indicar que esse método abaixo será um método que responde a requisição do tipo Get do http.
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}

    // Esse é nosso controlador Rest que responde no caminho Users
}
