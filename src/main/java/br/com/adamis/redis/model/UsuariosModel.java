package br.com.adamis.redis.model;
// Generated 13 de jun. de 2024 22:51:25 by Hibernate Tools 4.3.6.Final

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "usuarios")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class UsuariosModel implements java.io.Serializable {

	private static final long serialVersionUID = 2570964325083103749L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_create", length = 19)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_update", length = 19)
	private Date dateUpdate;
	
	@Getter
	@Setter
	@Column(name = "root_user", length = 6)
	private boolean root;
	
	@PrePersist
	private void preSave() {
		dateCreate = new Date();
		dateUpdate = new Date();
	} 
	
	@PreUpdate
	private void preUpdate() {
		dateUpdate = new Date();
	}
}
