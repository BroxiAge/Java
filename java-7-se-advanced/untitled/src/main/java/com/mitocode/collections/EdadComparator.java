package com.mitocode.collections;

import com.mitocode.override.Persona;

import java.util.Comparator;

public class EdadComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        int rta;

        if (p1.getEdad() > p2.getEdad()){
            rta = 1;
        } else if (p1.getEdad() < p2.getEdad()) {
            rta = -1;
        } else {
            rta = 0;
        }

        return rta;
    }
}
