package com.todocodeacademy.crudHibernate.service;

import com.todocodeacademy.crudHibernate.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();

    public void savePersona(Persona perso);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);

    public void editPersona (Long idOriginal,
                             String nuevoNombre, String nuevoApellido,
                             int nuevaEdad);

}
