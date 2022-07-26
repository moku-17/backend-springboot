package com.ar.moku.portfolio.repo;

import com.ar.moku.portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {

    void deleteExperienciaById(Long id);

}
