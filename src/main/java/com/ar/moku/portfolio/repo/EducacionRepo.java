package com.ar.moku.portfolio.repo;

import com.ar.moku.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepo extends JpaRepository<Educacion, Long> {

    void deleteEducacionById(Long id);

}
