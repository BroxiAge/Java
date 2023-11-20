package com.todocodeacademy.helloWorld.post.restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {

    Long id;
    String name;
    int price;

    public Plato(Long id) {
        this.id = id;
    }

    public Plato(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
