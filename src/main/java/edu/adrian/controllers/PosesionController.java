package edu.adrian.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.adrian.entities.Posesion;
import edu.adrian.repository.IPosesionRepository;
import edu.adrian.servicios.IPosesionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/posesiones")
public class PosesionController {
@Autowired
private IPosesionService posesionServ;

@GetMapping("/all")
public List<Posesion> getPosesiones() {
    return posesionServ.getPosesiones();
}

@GetMapping("/{id}")
public Posesion getPosesion(@PathVariable("id") Long idPos) {
    return posesionServ.getPosesion(idPos);
}

@PostMapping("/guardar")
public Posesion guardarPosesion(@RequestBody Posesion po) {
    return posesionServ.guardarPosesion(po);
}

@PutMapping("/actualizar")
public Posesion actualizarPosesion(@RequestBody Posesion po) {
    return posesionServ.actualizarPosesion(po);
}

@DeleteMapping("/{id}")
public void deletePosesion(@PathVariable("id") Integer idUrl){
    posesionServ.deletePosesion(idUrl);
}


}
