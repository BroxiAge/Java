package com.todocodeacademy.crudHibernate.service;

import com.todocodeacademy.crudHibernate.model.Mascota;
import com.todocodeacademy.crudHibernate.model.Persona;

import java.util.List;

public interface IMascotaService {


    public List<Mascota> getMascotas();

    public void saveMascota(Mascota masco);

    public void deleteMascota(Long id);

    public Mascota findMascota(Long id);

    public void editPMascota(Long Original,
                             String nombre,
                             String especie,
                             String raza,
                             String color);
}
