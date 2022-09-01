package com.lahermandad.hermanomayor.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lahermandad.hermanomayor.model.dto.PerfilDto;
import com.lahermandad.hermanomayor.model.entity.Perfil;
import com.lahermandad.hermanomayor.repository.PerfilRepository;
import com.lahermandad.hermanomayor.service.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService {
	
	@Autowired
	PerfilRepository perfilRepository;

	@Override
	public PerfilDto crear(PerfilDto perfilDto) {
		ModelMapper modelMapper = new ModelMapper();
		
		Perfil perfil = modelMapper.map(perfilDto, Perfil.class);
		Perfil perfilGuardado = perfilRepository.save(perfil);
		
		PerfilDto perfilDtoGuardado = modelMapper.map(perfilGuardado, PerfilDto.class);
		return perfilDtoGuardado;
	}
	
	public PerfilDto consultar(Long id) {
		ModelMapper modelMapper = new ModelMapper();
		
		Perfil perfil = perfilRepository.getReferenceById(id);
		PerfilDto perfilDto = modelMapper.map(perfil, PerfilDto.class);
		
		return perfilDto;
	}
	
	public PerfilDto editar(PerfilDto perfilDto) {
		ModelMapper modelMapper = new ModelMapper();
		
		Perfil perfil = modelMapper.map(perfilDto, Perfil.class);
		Perfil perfilGuardado = perfilRepository.save(perfil);
		
		PerfilDto perfilDtoGuardado = modelMapper.map(perfilGuardado, PerfilDto.class);
		return perfilDtoGuardado;
	}

	public void borrar(PerfilDto perfilDto) {
		ModelMapper modelMapper = new ModelMapper();
		
		Perfil perfil = modelMapper.map(perfilDto, Perfil.class);

		perfilRepository.delete(perfil);
	}

	@Override
	public List<Perfil> listar() {
		return perfilRepository.findAll();
	}

}
