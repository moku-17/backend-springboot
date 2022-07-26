package com.ar.moku.portfolio.repo;

import com.ar.moku.portfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadRepo extends JpaRepository<Habilidad, Long> {

    void deleteHabilidadById(Long id);

}
