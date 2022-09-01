package com.lahermandad.hermanomayor.model.dto;

import java.io.Serializable;

public class PerfilDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idPerfil;
	
	private String codigo;
	
	private String nombre;
	
	private String descripcion;
	
	private Integer estado;
	
	public PerfilDto() {
		super();
	}

	public PerfilDto(Long idPerfil, String codigo, String nombre, String descripcion, Integer estado) {
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
