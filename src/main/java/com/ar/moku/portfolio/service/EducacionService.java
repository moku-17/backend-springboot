package com.ar.moku.portfolio.service;

import com.ar.moku.portfolio.model.Educacion;
import com.ar.moku.portfolio.repo.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {

    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
//        educacion.setPersonaId("28911551");
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id) {
        educacionRepo.deleteById(id);
    }
}
