package br.com.adamis.redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adamis.redis.model.UsuariosModel;

public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long> {

}
