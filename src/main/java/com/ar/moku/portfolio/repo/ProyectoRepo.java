package com.ar.moku.portfolio.repo;

import com.ar.moku.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {

    public void deleteProyectoById(Long id);

}
