package com.todocodeacademy.crudHibernate.controller;

import com.todocodeacademy.crudHibernate.model.Mascota;
import com.todocodeacademy.crudHibernate.model.Persona;
import com.todocodeacademy.crudHibernate.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService serviceMasco;

    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota masco) {
        serviceMasco.saveMascota(masco);
        return "Mascota creada rey";
    }

}
