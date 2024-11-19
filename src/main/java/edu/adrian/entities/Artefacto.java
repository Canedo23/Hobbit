package edu.adrian.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.adrian.entities.enumerados.Tipo;
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
@Table(name = "artefactos")
public class Artefacto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idArtefacto;
@Column(length = 50, nullable = false)
private String nombre;
@Column(nullable = false)
@Enumerated(EnumType.STRING)
private Tipo tipo;
@OneToMany(fetch = FetchType.EAGER, mappedBy = "artefacto")
@JsonIgnore
private List<Posesion> posesiones;

public Artefacto(){}



public Artefacto(String nombre, Tipo tipo, List<Posesion> posesiones) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.posesiones = posesiones;
}



public Artefacto(Long idArtefacto, String nombre, Tipo tipo, List<Posesion> posesiones) {
    this.idArtefacto = idArtefacto;
    this.nombre = nombre;
    this.tipo = tipo;
    this.posesiones = posesiones;
}


public Long getIdArtefacto() {
    return idArtefacto;
    
}
public void setIdArtefacto(Long idArtefacto) {
    this.idArtefacto = idArtefacto;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Tipo getTipo() {
    return tipo;
}
public void setTipo(Tipo tipo) {
    this.tipo = tipo;
}
@Override
public String toString() {
    return "Artefacto [idArtefacto=" + idArtefacto + ", nombre=" + nombre + ", tipo=" + tipo + ", Posesiones="
            + posesiones + "]";
}





}
