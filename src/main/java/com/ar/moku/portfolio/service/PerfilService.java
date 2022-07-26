package com.ar.moku.portfolio.service;

import com.ar.moku.portfolio.model.Perfil;
import com.ar.moku.portfolio.repo.PerfilRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    private final PerfilRepo perfilRepo;

    @Autowired
    public PerfilService(PerfilRepo perfilRepo) {
        this.perfilRepo = perfilRepo;
    }

    public List<Perfil> findAllPerfiles() {
        return perfilRepo.findAll();
    }

    public Perfil updatePerfil(Perfil perfil) {
        return perfilRepo.save(perfil);
    }

}
