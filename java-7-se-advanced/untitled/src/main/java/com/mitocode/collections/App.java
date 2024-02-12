package com.mitocode.collections;

import com.mitocode.override.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {


    public static void main(String[] args) {

        List<Integer> integerLst = new ArrayList<>();

        integerLst.add(10);
        integerLst.add(1);
        integerLst.add(10000);

        Persona p1 = new Persona(1L, "B",40 );
        Persona p2 = new Persona(2L, "A",25 );
        Persona p3 = new Persona(2L, "c",10 );
        Persona p4 = new Persona(2L, "c",1 );

        List<Persona> personaList = new ArrayList<>();

        personaList.add(p1);
        personaList.add(p2);
        personaList.add(p3);
        personaList.add(p4);

        //personaList.sort(new NombreComparator());
        personaList.sort(new EdadComparator());

        personaList.forEach(x -> {
            System.out.println(x.getEdad());
        });


    }
}
