package com.todocodeacademy.helloWorld.get.ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumNumbers {



    @GetMapping("/sumNumbers")
    public int sumNumbers(@RequestParam int num1, int num2) {
        return num1 + num2;
    }

}
