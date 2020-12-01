package com.tambolsa.team.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tambolsa.team.modelo.Equipo;
import com.tambolsa.team.repositorio.EquipoRepositorio;

@Service
@Transactional
public class EquipoServicio {

    @Autowired
    private EquipoRepositorio repo;
     
    public List<Equipo> listAll() {
        return repo.findAll();
    }
     
    public void save(Equipo equipo) {
        repo.save(equipo);
    }
     
    public Equipo get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
    
}
