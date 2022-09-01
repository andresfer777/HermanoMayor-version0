package com.lahermandad.hermanomayor.serviceTask;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lahermandad.hermanomayor.model.dto.PerfilDto;
import com.lahermandad.hermanomayor.model.entity.Perfil;

public interface PerfilServiceTask {
	
	public ResponseEntity<Object> crear(PerfilDto perfilDto);
	
	public PerfilDto consultar(Long id);
	
	public PerfilDto editar(PerfilDto perfilDto);

	public void borrar(PerfilDto perfilDto);

	public List<Perfil> listar();
}
