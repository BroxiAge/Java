package com.mitocode.singleton;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /* Con singleton */


        //Caso en el que si no tengo constructor privado, me deja instanciar como loco

        /*
        PaisDAOImpl paisDAOEsotico = new PaisDAOImpl();
        paisDAOEsotico.getPaises().forEach( pais-> {
            System.out.println(pais.getNombre());
        });
        */

        PaisDAOImpl paisDAO1 = PaisDAOImpl.getInstance();
        paisDAO1.getPaises().forEach(x -> {
            System.out.println(x.getNombre());
        });

        PaisDAOImpl paisDAO2 = PaisDAOImpl.getInstance();
        paisDAO2.getPaises().forEach(x -> {
            System.out.println(x.getNombre());
        });

        PaisDAOImpl paisDAO3 = PaisDAOImpl.getInstance();
        paisDAO3.getPaises().forEach(x -> {
            System.out.println(x.getNombre());
        });


    }
}
