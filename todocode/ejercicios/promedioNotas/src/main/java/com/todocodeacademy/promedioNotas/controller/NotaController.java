package com.todocodeacademy.promedioNotas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class NotaController {

    final int cantCalificaciones = 3;

    @GetMapping("/obtenerPromedio")
    public Integer obtenerPromedio(@RequestParam int calificacion1,
                                   @RequestParam int calificacion2,
                                   @RequestParam int calificacion3) {
        int result = (calificacion1 + calificacion2 + calificacion3) / cantCalificaciones;
        //System.out.println("promedio = " + result);
        return result;

    }
}
