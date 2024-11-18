package edu.adrian.servicios;

import java.util.List;

import edu.adrian.entities.Posesion;

public interface IPosesionService {

public List<Posesion> getPosesiones();
public Posesion getPosesion(Long idPos);
public Posesion guardarPosesion(Posesion po);
public Posesion actualizarPosesion(Posesion po);
public void deletePosesion(Integer idUrl);

}
