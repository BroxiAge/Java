package org.mitocode.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {

    public void sintaxis() {

        /*
        IOperacion operacion = new IOperacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };
        */

        //IOperacion operacion = (double x, double y) -> (x+y)/2;

        //IOperacion operacion = (double x, double y) -> {return  (x+y)/2;};

        /*IOperacion operacion = (double x, double y) -> {
            double a = 2.0;
            System.out.println(a);
            return (x+y) + a;
        };*/

        IOperacion operacion = (x,y) -> (x+y)/2;

        //IOperacion operacion = () -> 2;
        //System.out.println(operacion.calcular());
    }

    public void ordenar() {

        List<String> lista = new ArrayList<>();
        lista.add("Mitocode");
        lista.add("Code");
        lista.add("Mito");


        /*Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String per1, String per2) {
                return per1.compareTo(per2);
            }
        });
        */

        //
        Collections.sort(lista,(String p1, String p2) -> p1.compareTo(p2));

        for (String nombre: lista) {
            System.out.println(nombre);
        }
    }

    public static void main(String[] args) {
        LambdaApp lambdaApp = new LambdaApp();
        //lambdaApp.ordenar();
        lambdaApp.sintaxis();
    }
}
