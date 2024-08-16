package com.todocodeacademy.estaturasEnBasquet.controller;

import com.todocodeacademy.estaturasEnBasquet.model.Jugador;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JugadorController {

    @PostMapping("/agregarJugador")
    public String agregarJugador(@RequestBody List<Jugador> listJugadores) {

        Double sumaEstatura = 0.0;
        Double promedioEstatura = 0.0;

        for (Jugador jug: listJugadores) {
           sumaEstatura = sumaEstatura + jug.getEstatura();
        }

        promedioEstatura = sumaEstatura / listJugadores.size();

        return "El promedio de todas las estaturas es: " + promedioEstatura;
    }

}
