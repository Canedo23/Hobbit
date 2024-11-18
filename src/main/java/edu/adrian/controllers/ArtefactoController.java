package edu.adrian.controllers;

import org.springframework.web.bind.annotation.RestController;

import edu.adrian.entities.Artefacto;
import edu.adrian.entities.Personaje;
import edu.adrian.servicios.IArtefactosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/artefactos")
public class ArtefactoController {
@Autowired
IArtefactosService artefactoService;

@GetMapping("/all")
public List<Artefacto> getArtefactos() {
    return artefactoService.getArtefactos();
}

@GetMapping("/{id}")
public Artefacto getArtefacto(@PathVariable("id") Long idUrl) {
    return artefactoService.getArtefacto(idUrl);
}

@DeleteMapping("/{id}")
public void deleteArtefactoId(@PathVariable("id") Integer id){
    artefactoService.deleteArtefactoId(id);
}

@PostMapping("/guardar")
public Artefacto guardarArtefacto(@RequestBody Artefacto ar) {
    return artefactoService.guardArtefacto(ar);
}

@PutMapping("/actualizar")
public Artefacto actualizarArtefacto(@RequestBody Artefacto ar) {
    return artefactoService.actualizarArtefacto(ar);
}

}
