package com.mitocode.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

    /*  E -> ELEMENTOS
        K -> KEY VALUE
        N -> NUMBER
        T -> TYPE
        V -> VALUE

     */

    public static void main(String[] args) {
        Clase<Integer> c = new Clase(1);
        c.mostrarTipo();
    }

}
