package com.ar.moku.portfolio;

import com.ar.moku.portfolio.model.Habilidad;
import com.ar.moku.portfolio.service.HabilidadService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidad")
public class HabilidadResource {

    private final HabilidadService habilidadService;

    public HabilidadResource(HabilidadService habilidadService) {
        this.habilidadService = habilidadService;
    }

    @CrossOrigin(origins="*")
    @GetMapping("/all")
    public ResponseEntity<List<Habilidad>> getAllHabilidades() {
        List<Habilidad> habilidades = habilidadService.findAllHabilidades();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }

    @CrossOrigin(origins="*")
    @PostMapping("/add")
    public ResponseEntity<Habilidad> addHabilidad(@RequestBody Habilidad habilidad) {
        Habilidad newHabilidad = habilidadService.addHabilidad(habilidad);
        return new ResponseEntity<>(newHabilidad, HttpStatus.CREATED);
    }

    @CrossOrigin(origins="*")
    @PutMapping("/update")
    public ResponseEntity<Habilidad> updateHabilidad(@RequestBody Habilidad habilidad) {
        Habilidad updateHabilidad = habilidadService.updateHabilidad(habilidad);
        return new ResponseEntity<>(updateHabilidad, HttpStatus.OK);
    }

    @CrossOrigin(origins="*")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHabilidad(@PathVariable("id") Long id) {
        habilidadService.deleteHabilidad(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
