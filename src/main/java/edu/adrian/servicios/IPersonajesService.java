package edu.adrian.servicios;

import java.util.List;

import edu.adrian.entities.Personaje;

public interface IPersonajesService {

public List<Personaje> conseguirPersonajes();
public Personaje conseguirPersonaje(Integer id);
public void borrarPersonaje(Integer id);
public Personaje guardarPersonaje(Personaje per);
public Personaje guardarPersonajesPosesion(Personaje personaje);
}
