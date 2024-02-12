package com.mitocode.generics;

public class Clase<T>{

    private T objeto;

    public Clase(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo() {
        System.out.println("El tipo del objeto es: " + objeto.getClass().getName());
    }
}
