package com.lahermandad.hermanomayor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lahermandad.hermanomayor.model.dto.PerfilDto;
import com.lahermandad.hermanomayor.model.entity.Perfil;
import com.lahermandad.hermanomayor.serviceTask.PerfilServiceTask;

@RestController
public class PerfilController {

	@Autowired
	PerfilServiceTask perfilServiceTask;
	
	@PostMapping("/perfil")
	ResponseEntity<Object> crearPerfil(@RequestBody PerfilDto perfilDto) {
		return perfilServiceTask.crear(perfilDto);
	}
	
	@GetMapping("/perfil/{id}")
	public PerfilDto consultarPerfil(@PathVariable(name = "id", required = true) Long id) {
		return perfilServiceTask.consultar(id);
	}
	
	@PutMapping("/perfil")
	public PerfilDto editar(@RequestBody PerfilDto perfilDto){
		return perfilServiceTask.editar(perfilDto);
	}

	@DeleteMapping("/perfil")
	public void borrar(@RequestBody PerfilDto perfilDto) {
		perfilServiceTask.borrar(perfilDto);
	}

	@GetMapping("/perfiles")
	List<Perfil> listar() {
		return perfilServiceTask.listar();
	}
}
