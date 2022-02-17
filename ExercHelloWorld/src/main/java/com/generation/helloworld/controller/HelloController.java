package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
		
	@GetMapping
	
	public String getHello() {
		return " Habilidades e mentalidades usadas: PersistÃªncia, Orientação ao Futuro e adaptalidade";
	}
	
	@GetMapping ("/Semana")
	
	public String getHello2 () {
		return "Desenvolver melhor minhas habilidades em MySQL e Java ";
		
		
	}
		
	}
	

