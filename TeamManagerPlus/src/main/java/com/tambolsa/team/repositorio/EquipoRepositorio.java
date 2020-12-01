package com.tambolsa.team.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tambolsa.team.modelo.Equipo;

// JpaRepository (Clase Modelo, Tipo Clave) 
// JpaRepository defines standard CRUD methods, plus JPA-specific operations. 
// We don’t have to write implementation code because Spring Data JPA will generate necessary code at runtime, 
// in form of proxy instances.
public interface EquipoRepositorio extends JpaRepository<Equipo,Integer> {

}
