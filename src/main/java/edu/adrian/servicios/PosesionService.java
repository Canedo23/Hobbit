package edu.adrian.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.entities.Posesion;
import edu.adrian.repository.IPosesionRepository;

@Service
public class PosesionService implements IPosesionService{
@Autowired
private IPosesionRepository posesionRepo;

@Override
public List<Posesion> getPosesiones() {
    return posesionRepo.findAll();
}

@Override
public Posesion getPosesion(Long idPos) {
    Optional<Posesion> po = posesionRepo.findById(idPos);
    if(po.isPresent()){
        return po.get();
    }
    System.out.println("No se ha encontrado esta posesión.");
    return null;
    
}

@Override
public Posesion guardarPosesion(Posesion po) {
    return posesionRepo.save(po);
}

@Override
public Posesion actualizarPosesion(Posesion po) {
    return posesionRepo.save(po);
}

@Override
public void deletePosesion(Integer idUrl) {
    Optional<Posesion> op = posesionRepo.findById((long)idUrl);
    if(op.isPresent()){
    posesionRepo.delete(op.get());
    System.out.println("Hemos borrado el objeto" + op.get());
    }
    else{
        System.out.println("El objeto posesion no existe.");
    }
}

}
