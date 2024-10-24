package org.mitocode.colecciones;

import java.util.*;

public class ColeccionApp {

    private List<String>lista = new ArrayList<>();

    public void llenarLista() {
        lista.add("Broxi");
        lista.add("Nahuel");
        lista.add("Code");
    }

    public void usarForEach() {

        /*for (String nombre : lista) {
            System.out.println("nombre: " + nombre);
        }*/

        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);

    }
    public void usarRemoveIf() {
        /*Iterator<String> it = lista.iterator();
            while (it.hasNext()) {
                if(it.next().equalsIgnoreCase("Code")){
                    it.remove();
                }
            }*/
        lista.removeIf(x -> x.equalsIgnoreCase("Code"));
    }
    public void usarSort() {
        //Collections.sort(lista);
        lista.sort(String::compareTo);
        lista.sort( (x,y)-> x.compareTo(y) );
    }

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();

        app.llenarLista();
        //app.usarForEach();
        app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();
    }
}
