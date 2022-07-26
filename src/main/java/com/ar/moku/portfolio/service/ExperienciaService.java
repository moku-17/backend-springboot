package com.ar.moku.portfolio.service;

import com.ar.moku.portfolio.model.Experiencia;
import com.ar.moku.portfolio.repo.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {

    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia) {
//        experiencia.setPersonaId("28911551");
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> findAllExperiencias() {
        return experienciaRepo.findAll();
    }

    public Experiencia updateExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void deleteExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }
}
