package com.mitocode.instance.of.entity;

public abstract class Fruta {

    private String tipoFruta;

    public Fruta(String fruta) {
        this.tipoFruta = fruta;
    }

    public void queSoy(){
        System.out.println(this.tipoFruta);
    }
}
