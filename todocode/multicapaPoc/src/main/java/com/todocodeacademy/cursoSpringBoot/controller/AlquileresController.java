package com.todocodeacademy.cursoSpringBoot.controller;


import com.todocodeacademy.cursoSpringBoot.dto.PropiedadDTO;
import com.todocodeacademy.cursoSpringBoot.model.Inquilino;
import com.todocodeacademy.cursoSpringBoot.model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable long id) {

        Inquilino inqui = new Inquilino(1l, "12345678", "Walter", "White", "Profesor");
        Propiedad prop = new Propiedad(152365L, "Casa", "308 Negra Arroyo Lane", 200.0,4000.0);

        PropiedadDTO propDTO = new PropiedadDTO();
        propDTO.setIdPropiedad(prop.getIdPropiedad());
        propDTO.setTipo(prop.getTipoPropiedad());
        propDTO.setDireccion(prop.getDireccion());
        propDTO.setValorAlquiler(prop.getValorAlquiler());
        propDTO.setNombreInquilino(inqui.getNombre());
        propDTO.setApellidoInquilino(inqui.getApellido());

        return propDTO;
    }

}
