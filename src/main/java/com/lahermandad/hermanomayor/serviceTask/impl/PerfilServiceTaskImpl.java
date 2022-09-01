package com.lahermandad.hermanomayor.serviceTask.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.lahermandad.hermanomayor.exception.DatoNoEncontradoException;
import com.lahermandad.hermanomayor.model.dto.PerfilDto;
import com.lahermandad.hermanomayor.model.entity.Perfil;
import com.lahermandad.hermanomayor.response.ResponseHandler;
import com.lahermandad.hermanomayor.service.PerfilService;
import com.lahermandad.hermanomayor.serviceTask.PerfilServiceTask;

@Service
public class PerfilServiceTaskImpl implements PerfilServiceTask {

	@Autowired
	PerfilService perfilService;

	@Override
	public ResponseEntity<Object> crear(PerfilDto perfilDto) {
		try {
			PerfilDto perfilCreado = perfilService.crear(perfilDto);
			return ResponseHandler.generarRespuesta("¡Operación satisfactoria!", HttpStatus.CREATED, perfilCreado);
		}catch(Exception e) {
			return ResponseHandler.generarRespuesta("¡Error en la creación del registro!", HttpStatus.MULTI_STATUS, null);
		}
		
	}
	
	@Override
	public PerfilDto consultar(Long id) throws DatoNoEncontradoException {
		return perfilService.consultar(id);
	}
	
	@Override
	public PerfilDto editar(PerfilDto perfilDto) {
		return perfilService.editar(perfilDto);
	}

	@Override
	public void borrar(PerfilDto perfilDto) {
		perfilService.borrar(perfilDto);
	}

	@Override
	public List<Perfil> listar(){
		return perfilService.listar();
	}
}
