package com.ar.moku.portfolio;

import com.ar.moku.portfolio.model.Proyecto;
import com.ar.moku.portfolio.service.ProyectoService;
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
@RequestMapping("/proyecto")
public class ProyectoResource {

    private final ProyectoService proyectoService;

    public ProyectoResource(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> getAllProyectos() {
        List<Proyecto> proyectos = proyectoService.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @CrossOrigin(origins="*")
    @PostMapping("/add")
    public ResponseEntity<Proyecto> addProyecto(@RequestBody Proyecto proyecto) {
        Proyecto newProyecto = proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    @CrossOrigin(origins="*")
    @PutMapping("/update")
    public ResponseEntity<Proyecto> updateProyecto(@RequestBody Proyecto proyecto) {
        Proyecto updateProyecto = proyectoService.updateProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable("id") Long id) {
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
