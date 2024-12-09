package com.Aprendizado.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Anotation para configurar esse projeto pra que ele seja uma aplicação de spring boot.
public class CursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args); //Método para rodar a aplicação do Spring boot.
	}
	
	// Para rodar a aplicação de spring boot, deve-se ir no boot dashboard e apertar em "local", depois clicar no "start"
	// a porta de entrada está ao lado do nome do projeto, nesse caso "curso[:8080]"
	// aí é só ir no goole e colocar localhost

}
