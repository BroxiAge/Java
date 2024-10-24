package com.todocodeacademy.crudHibernate.repository;

import com.todocodeacademy.crudHibernate.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {

}
