package com.mitocode.override;

public class Alumno extends Persona{

    public Alumno(long id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    public static int sumar(int numero) {
        return numero +2;
    }
}
