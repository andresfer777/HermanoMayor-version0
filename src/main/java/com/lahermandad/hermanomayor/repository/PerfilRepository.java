package com.lahermandad.hermanomayor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lahermandad.hermanomayor.model.entity.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}
