package com.todocodeacademy.elejmploAutowired.repository;

import com.todocodeacademy.elejmploAutowired.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IPosteoRepository {

    public List<Posteo> traerTodos()   {

        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L, "¿Como formatear pc?", "Luisina"));
        listaPosteos.add(new Posteo(2L, "¿Como mantener la seguridad??", "Nahuel"));
        return listaPosteos;
    }
}
