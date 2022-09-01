package com.lahermandad.hermanomayor.service;

import java.util.List;

import com.lahermandad.hermanomayor.model.dto.PerfilDto;
import com.lahermandad.hermanomayor.model.entity.Perfil;

public interface PerfilService {
	
	public PerfilDto crear(PerfilDto perfilDto);
	
	public PerfilDto consultar(Long id);
	
	public PerfilDto editar(PerfilDto perfilDto);

	public void borrar(PerfilDto perfilDto);

	public List<Perfil> listar();
}
