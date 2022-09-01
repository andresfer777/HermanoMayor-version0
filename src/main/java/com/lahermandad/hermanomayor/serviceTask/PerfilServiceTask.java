package com.lahermandad.hermanomayor.serviceTask;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lahermandad.hermanomayor.exception.DatoNoEncontradoException;
import com.lahermandad.hermanomayor.model.dto.PerfilDto;
import com.lahermandad.hermanomayor.model.entity.Perfil;

public interface PerfilServiceTask {
	
	public ResponseEntity<Object> crear(PerfilDto perfilDto);
	
	public ResponseEntity<Object> consultar(Long id) throws DatoNoEncontradoException;
	
	public PerfilDto editar(PerfilDto perfilDto);

	public void borrar(PerfilDto perfilDto);

	public List<Perfil> listar();
}
