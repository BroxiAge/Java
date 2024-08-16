package com.todocodeacademy.helloWorld.get.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hola como va " + name;
    }

    @GetMapping("/sayHelloParam")
    public String sayHelloParam(@RequestParam String name) {
        return "hola como va " + name;
    }

    @GetMapping("/goodBye/{name}/{date}/{job}")
    public String saygoodBye(@PathVariable String name,
                             @PathVariable String date,
                             @PathVariable String job) {
        return  "good bye: "
                + "Name: " + name
                + " Date: " + date
                + "Job: " + job;
    }
}

