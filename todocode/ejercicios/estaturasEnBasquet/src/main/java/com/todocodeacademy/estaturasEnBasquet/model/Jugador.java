package com.todocodeacademy.estaturasEnBasquet.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jugador {

    private Long id;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Double peso;
    private Double estatura;

    public Jugador() {}

    public Jugador(Long id, int dni, String nombre, String apellido, int edad, Double peso, Double estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
}
