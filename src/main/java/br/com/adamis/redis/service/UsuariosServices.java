package br.com.adamis.redis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.adamis.redis.model.UsuariosModel;
import br.com.adamis.redis.repository.UsuariosRepository;

@Service
public class UsuariosServices {

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	
	@Cacheable(value = "usuarios_id", key = "#userId")
	public List<UsuariosModel> findAll(long userId) {
		Optional<UsuariosModel> usuariosModel = usuariosRepository.findById(userId);
		
		List<UsuariosModel> list = new ArrayList<>();
		list.add(usuariosModel.get());
		
		return list;
	}

	
	
}
