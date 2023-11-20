package com.todocodeacademy.helloWorld.get.ejercicioIntegradorUno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuelEquivalence {

    @GetMapping("/getEquivalence")
    public String getEquivalence(@RequestParam Double galones) {
        Double liter = 3.78541;
        return "Tenes que pedir: " + galones * liter + "Litros de nafta";
    }
}
