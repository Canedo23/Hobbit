package edu.adrian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.adrian.entities.Personaje;

public interface IPersonajesRepository extends JpaRepository<Personaje, Long>{

}
