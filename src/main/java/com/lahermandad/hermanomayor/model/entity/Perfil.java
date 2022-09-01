package com.lahermandad.hermanomayor.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPerfil;
	
	@Column(length = 10, unique = false)
	private String codigo;
	
	@Column(length = 40)
	private String nombre;
	
	@Column(length = 200)
	private String descripcion;
	
	private Integer estado;

	public Perfil() {
		super();
	}

	public Perfil(Long idPerfil, String codigo, String nombre, String descripcion, Integer estado) {
		super();
		this.idPerfil = idPerfil;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
