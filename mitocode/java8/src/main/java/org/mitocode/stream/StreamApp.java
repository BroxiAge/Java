package org.mitocode.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamApp() {
        lista = new ArrayList<>();
        lista.add("broxi");
        lista.add("gamble");
        lista.add("code");
        lista.add("nahuel");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar(){
        //filtrar todo lo que empiece con la letra M.
        lista.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);
        //lista.stream().filter(x -> x.startsWith("B")).forEach(x1 -> System.out.println(x1));
    }

    public void ordenar() {
        lista.stream().sorted().forEach(System.out::println);
    }

    public void ordenarDesc() {
        lista.stream().sorted( (x,y) -> y.compareTo(x) ).forEach(System.out::println);
    }

    public void transformar() {
       // lista.stream().map(String::toUpperCase).forEach(System.out::println);

        /*for (String numero : numeros) {
            int num = Integer.parseInt(numero) + 1;
            System.out.println(num);
        }*/

        numeros.stream().map(x -> Integer.parseInt(x) + 1)
                        .forEach(System.out::println);
    }

    public void contar() {
        long x = numeros.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamApp app = new StreamApp();
        //app.filtrar();
        // app.ordenarDesc();
        //app.transformar();
        app.contar();
    }

}
