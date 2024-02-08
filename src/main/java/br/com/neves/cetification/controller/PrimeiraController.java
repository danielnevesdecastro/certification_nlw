package br.com.neves.cetification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
	
	@GetMapping("/getPrimeiraController")
	public Usuario getPrimeiraController() {
		Usuario usuario = new Usuario("Daniel Neves",29);
		return usuario;
	}
	
	record Usuario(String nome, int idade) {} 
}
