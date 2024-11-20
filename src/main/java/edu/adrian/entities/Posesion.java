package edu.adrian.entities;

import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posesiones")
public class Posesion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_posesion")
private Long idPosesion;
@ManyToOne
@JsonIgnore
@JoinColumn(name = "id_personaje", nullable = true, referencedColumnName = "idPersonaje")
private Personaje personaje;
@ManyToOne
@JoinColumn(name = "id_artefacto", nullable = true, referencedColumnName = "idArtefacto")
private Artefacto artefacto;
@Column(name = "fecha_inicio", nullable = false)
private LocalDate fechaInicio;
@Column(name = "fecha_fin", nullable = true)
private LocalDate fechaFin;


public Posesion(){}


public Long getIdPosesion() {
    return idPosesion;
}


public void setIdPosesion(Long idPosesion) {
    this.idPosesion = idPosesion;
}


public Personaje getPersonaje() {
    return personaje;
}


public void setPersonaje(Personaje personaje) {
    this.personaje = personaje;
}


public Artefacto getArtefacto() {
    return artefacto;
}


public void setArtefacto(Artefacto artefacto) {
    this.artefacto = artefacto;
}


public LocalDate getFechaInicio() {
    return fechaInicio;
}


public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
}


public LocalDate getFechaFin() {
    return fechaFin;
}


public void setFechaFin(LocalDate fechaFin) {
    this.fechaFin = fechaFin;
}



}
