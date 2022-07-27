package com.ar.moku.portfolio;

import com.ar.moku.portfolio.model.Perfil;
import com.ar.moku.portfolio.service.PerfilService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
public class PerfilResource {

    private final PerfilService perfilService;

    public PerfilResource(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @CrossOrigin(origins="*")
    @GetMapping("/all")
    public ResponseEntity<List<Perfil>> getAllPerfiles() {
        List<Perfil> perfiles = perfilService.findAllPerfiles();
        return new ResponseEntity<>(perfiles, HttpStatus.OK);
    }

    @CrossOrigin(origins="*")
    @PutMapping("/update")
    public ResponseEntity<Perfil> updatePerfil(@RequestBody Perfil perfil){
        Perfil updatePerfil = perfilService.updatePerfil(perfil);
        return new ResponseEntity<>(updatePerfil, HttpStatus.OK);
    }

}
