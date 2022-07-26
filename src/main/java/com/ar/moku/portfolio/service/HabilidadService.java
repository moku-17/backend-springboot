package com.ar.moku.portfolio.service;

import com.ar.moku.portfolio.model.Habilidad;
import com.ar.moku.portfolio.repo.HabilidadRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService {

    private final HabilidadRepo habilidadRepo;

    @Autowired
    public HabilidadService(HabilidadRepo habilidadRepo) {
        this.habilidadRepo = habilidadRepo;
    }

    public Habilidad addHabilidad(Habilidad habilidad) {
        return habilidadRepo.save(habilidad);
    }

    public List<Habilidad> findAllHabilidades() {
        return habilidadRepo.findAll();
    }

    public Habilidad updateHabilidad(Habilidad habilidad) {
        return habilidadRepo.save(habilidad);
    }

    public void deleteHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }
}
