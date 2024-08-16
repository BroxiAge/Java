package com.todocodeacademy.helloWorld.post.restaurante;

import com.todocodeacademy.helloWorld.post.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlatoController {

    @GetMapping("/plato")
    //@ResponseBody
    public Plato traerClientes(@RequestParam Long idPlato) {
        List<Plato> listaPlatos = new ArrayList<Plato>();

        listaPlatos.add(new Plato(1L, "Asado", 10));
        listaPlatos.add(new Plato(2L, "Polenta", 1));
        listaPlatos.add(new Plato(3L, "Pasta", 5));

        for (Plato plato : listaPlatos) {
            if ( idPlato.equals(plato.getId()) ) {
                return plato;
            }
        }
        return null;
    }

    @GetMapping("/asd")
    public int sumNumbers(@RequestParam int num1, int num2) {
        return num1 + num2;
    }
}
