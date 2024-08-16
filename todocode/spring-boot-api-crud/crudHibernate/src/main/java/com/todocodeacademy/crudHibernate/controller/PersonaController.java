package com.todocodeacademy.crudHibernate.controller;

import com.todocodeacademy.crudHibernate.model.Persona;
import com.todocodeacademy.crudHibernate.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    IPersonaService interPersona;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return interPersona.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String createStudent(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        return "El alumno se ha creado con esito";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        interPersona.deletePersona(id);
        return "LA persona fue ripeada";
    }

    @PutMapping("personas/editar/{idOriginal}")
    public Persona editPersona(@PathVariable Long idOriginal,
                               @RequestParam(required = false, name = "nombre") String nuevoNombre,
                               @RequestParam(required = false, name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad) {

        interPersona.editPersona(idOriginal, nuevoNombre, nuevoApellido, nuevaEdad);

        Persona perso = interPersona.findPersona(idOriginal);

        return perso;
    }

    @PutMapping("personas/editar")
    public Persona editPersona(@RequestBody Persona per) {
        interPersona.editPersona(per);
        return interPersona.findPersona(per.getId());
    }



}
