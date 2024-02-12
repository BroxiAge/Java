package com.mitocode.instance.of.entity;

public class Chocolate {

    String marca;

    public Chocolate(String marca){
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
