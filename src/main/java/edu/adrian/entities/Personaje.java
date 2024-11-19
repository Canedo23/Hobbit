package edu.adrian.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.adrian.entities.enumerados.Alianza;
import edu.adrian.entities.enumerados.Raza;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "personajes")
public class Personaje {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idPersonaje;
@Column(length = 50, nullable = false, unique = true)
private String nombre;
@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Raza raza;
@Column(nullable = false)
@Enumerated(EnumType.STRING)
private Alianza alianza;
@OneToMany(fetch = FetchType.EAGER, mappedBy = "personaje")
private List<Posesion> posesiones;

public Personaje(){}




public Personaje(String nombre, Raza raza, Alianza alianza, List<Posesion> posesiones) {
    this.nombre = nombre;
    this.raza = raza;
    this.alianza = alianza;
    this.posesiones = posesiones;
}




public Personaje(Long idPersonaje, String nombre, Raza raza, Alianza alianza, List<Posesion> posesiones) {
    this.idPersonaje = idPersonaje;
    this.nombre = nombre;
    this.raza = raza;
    this.alianza = alianza;
    this.posesiones = posesiones;
}




public Long getIdPersonaje() {
    return idPersonaje;
}




public void setIdPersonaje(Long idPersonaje) {
    this.idPersonaje = idPersonaje;
}




public String getNombre() {
    return nombre;
}




public void setNombre(String nombre) {
    this.nombre = nombre;
}




public Raza getRaza() {
    return raza;
}




public void setRaza(Raza raza) {
    this.raza = raza;
}




public Alianza getAlianza() {
    return alianza;
}




public void setAlianza(Alianza alianza) {
    this.alianza = alianza;
}




public List<Posesion> getPosesiones() {
    return posesiones;
}




public void setPosesiones(List<Posesion> posesiones) {
    this.posesiones = posesiones;
}




@Override
public String toString() {
    return "Personaje [idPersonaje=" + idPersonaje + ", nombre=" + nombre + ", raza=" + raza + ", alianza=" + alianza
            + ", Posesiones=" + posesiones + "]";
}



}
