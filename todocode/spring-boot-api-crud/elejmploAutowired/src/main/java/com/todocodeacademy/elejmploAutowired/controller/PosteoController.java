package com.todocodeacademy.elejmploAutowired.controller;

import com.todocodeacademy.elejmploAutowired.model.Posteo;
import com.todocodeacademy.elejmploAutowired.repository.IPosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PosteoController {

    @Autowired
    IPosteoRepository repository;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos() {
        return repository.traerTodos();
    }
}
