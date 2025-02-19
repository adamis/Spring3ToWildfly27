package br.com.adamis.redis.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alive")
public class HelloWorldController {

	@GetMapping
	public String pesquisar() {
		return "HelloWorld";
	}
	
}
