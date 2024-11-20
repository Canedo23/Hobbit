package edu.adrian.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.entities.Artefacto;
import edu.adrian.entities.Personaje;
import edu.adrian.entities.Posesion;
import edu.adrian.repository.IArtefactoRepository;
import edu.adrian.repository.IPersonajesRepository;
import edu.adrian.repository.IPosesionRepository;
@Service
public class PersonajesService implements IPersonajesService{
@Autowired
IArtefactoRepository artefactoRepo;
@Autowired
IPersonajesRepository personajesRepo;
@Autowired
IPosesionRepository posesionRepository;
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

    @Override
    public Personaje guardarPersonajesPosesion(Personaje personaje) {
        for (Posesion posesion : personaje.getPosesiones()) {
            if (posesion.getArtefacto()!=null && posesion.getArtefacto().getIdArtefacto()!=null) {
                Optional<Artefacto> optArtefacto = artefactoRepo.findById(posesion.getArtefacto().getIdArtefacto());
                if (!optArtefacto.isPresent()) {
                    return null;
                }  
                posesion.setArtefacto(optArtefacto.get());
            }
            if (posesion.getArtefacto()!=null && posesion.getArtefacto().getIdArtefacto()==null) {
                Artefacto artefactoNuevo = artefactoRepo.save(posesion.getArtefacto());
                posesion.setArtefacto(artefactoNuevo);
            }
            posesion.setPersonaje(personaje);
            

        }

        return personajesRepo.save(personaje);
    }

    
    

}
