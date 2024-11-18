package edu.adrian.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.entities.Artefacto;
import edu.adrian.repository.IArtefactoRepository;

@Service
public class ArtefactosService implements IArtefactosService {

    @Autowired
    IArtefactoRepository artefactoRepo;
    @Override
    public List<Artefacto> getArtefactos() {
        return artefactoRepo.findAll();
    }
    @Override
    public Artefacto getArtefacto(Long idUrl) {
        Optional<Artefacto> op = artefactoRepo.findById((long)idUrl);
        if(op.isPresent()){
            return op.get();
        }
        System.out.println("Este artefacto no existe.");
        return null;
    }
    @Override
    public void deleteArtefactoId(Integer id) {
        Artefacto artefactoBd = getArtefacto((long)id);
        if(artefactoBd!=null){
            artefactoRepo.deleteById((long)id);
            System.out.println("Se ha eliminado el artefacto." + artefactoBd);
        }
        else{
            System.out.println("El artefacto con ese id no existe en la base de datos.");
        }
    }
    @Override
    public Artefacto guardArtefacto(Artefacto ar) {
        return artefactoRepo.save(ar);
    }
    @Override
    public Artefacto actualizarArtefacto(Artefacto ar) {
        return artefactoRepo.save(ar);
    }
    

}
