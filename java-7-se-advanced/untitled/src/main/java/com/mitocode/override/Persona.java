package com.mitocode.override;

public class Persona {

    private long id;
    private String nombre;
    private int edad;

    public Persona(long id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
