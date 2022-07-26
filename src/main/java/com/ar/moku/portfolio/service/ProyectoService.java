package com.ar.moku.portfolio.service;

import com.ar.moku.portfolio.model.Proyecto;
import com.ar.moku.portfolio.repo.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {

    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto addProyecto(Proyecto proyecto) {
//        proyecto.setPersonaId("28911551");
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> findAllProyectos() {
        return proyectoRepo.findAll();
    }

    public Proyecto updateProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }
}
