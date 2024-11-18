package edu.adrian.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.entities.Personaje;
import edu.adrian.repository.IPersonajesRepository;
@Service
public class PersonajesService implements IPersonajesService{
@Autowired
IPersonajesRepository personajesRepo;
    @Override
    public List<Personaje> conseguirPersonajes() {
       return personajesRepo.findAll();
    }

    @Override
    public Personaje conseguirPersonaje(Integer id) {
        Optional<Personaje> pe = personajesRepo.findById((long) id);
        if(pe.isPresent()){
            return pe.get();
        }
        return null;
    }

    @Override
    public void borrarPersonaje(Integer id) {
        personajesRepo.deleteById((long) id);
        System.out.println("Personaje eliminado.");
    }

    @Override
    public Personaje guardarPersonaje(Personaje per) {
       return personajesRepo.save(per);
    }

    
    

}
