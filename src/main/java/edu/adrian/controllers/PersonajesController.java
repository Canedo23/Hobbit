package edu.adrian.controllers;

import org.springframework.web.bind.annotation.RestController;

import edu.adrian.entities.Personaje;
import edu.adrian.servicios.IPersonajesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/personajes")
public class PersonajesController {
@Autowired
IPersonajesService personajeServ;
@GetMapping("/all")
public List<Personaje> getPersonajes() {
    return personajeServ.conseguirPersonajes();
}

@GetMapping("/{id}")
public Personaje getPersonajeId(@PathVariable("id") Integer idUrl) {
    return personajeServ.conseguirPersonaje(idUrl);
}

@DeleteMapping("/{id}")
public String deletePersonajeId(@PathVariable("id") Integer idUrl) {
    personajeServ.borrarPersonaje(idUrl);
    return "AGENTE BORRADO";
}

@PostMapping("/guardar")
public Personaje guardarPersonaje(@RequestBody Personaje per) {
    
    return personajeServ.guardarPersonaje(per);
}

@PutMapping("/actualizar")
public Personaje actualizarPersonaje(@RequestBody Personaje per) {
    
    return personajeServ.guardarPersonaje(per);
}

@PostMapping("/refresh")
public Personaje guardarPersonajesPosesion(@RequestBody Personaje personaje) {
    return personajeServ.guardarPersonajesPosesion(personaje);
}


}
