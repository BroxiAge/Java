package com.todocodeacademy.helloWorld.post;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

    Cliente(Long id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private Long id;
    private String nombre;
    private String apellido;
}
