package edu.adrian.entities;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posesiones")
public class Posesion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_posesion")
private Long idPosesion;
@Column(name = "id_personaje", nullable = false)
private Long idPersonaje;
@Column(name = "id_artefacto", nullable = false)
private Long idArtefacto;
@Column(name = "fecha_inicio", nullable = false)
private LocalDate fechaInicio;
@Column(name = "fecha_fin", nullable = true)
private LocalDate fechaFin;

public Posesion(Long idPosesion, Long idPersonaje, Long idArtefacto, LocalDate fechaInicio, LocalDate fechaFin) {
    this.idPosesion = idPosesion;
    this.idPersonaje = idPersonaje;
    this.idArtefacto = idArtefacto;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
}

public Posesion(){}

public Long getIdPosesion() {
    return idPosesion;
}

public void setIdPosesion(Long idPosesion) {
    this.idPosesion = idPosesion;
}

public Long getIdPersonaje() {
    return idPersonaje;
}

public void setIdPersonaje(Long idPersonaje) {
    this.idPersonaje = idPersonaje;
}

public Long getIdArtefacto() {
    return idArtefacto;
}

public void setIdArtefacto(Long idArtefacto) {
    this.idArtefacto = idArtefacto;
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

@Override
public String toString() {
    return "Posesion [idPosesion=" + idPosesion + ", idPersonaje=" + idPersonaje + ", idArtefacto=" + idArtefacto
            + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
}



}
