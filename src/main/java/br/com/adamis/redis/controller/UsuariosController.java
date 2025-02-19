package br.com.adamis.redis.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adamis.redis.model.UsuariosModel;
import br.com.adamis.redis.service.UsuariosServices;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosServices usuariosServices;	
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<UsuariosModel>> pesquisar(@PathVariable long id) {		
		return ResponseEntity.ok(usuariosServices.findAll(id));
	}
	
}
