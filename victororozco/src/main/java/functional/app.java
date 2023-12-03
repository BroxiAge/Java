package functional;

import javafx.scene.control.cell.CheckBoxTableCell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class app {

    //Implementacion completa.
    public static void doSomethingTraditional() {
        Tux tuxInstance = new Tux();
        System.out.println(tuxInstance.doSomething("desde Traditional"));
    }

    //Implementacion con clase anonima.
    public static void doSomethingClassy(){
        MyFunctionalInterface duke = new MyFunctionalInterface() {
            @Override
            public String doSomething(String param) {
                return "Hola soy Duke, y recibí el siguiente parametro: " + param;
            }
        };
        System.out.println(duke.doSomething("parametro classy"));
    }

    //Implementacion lambda.
    public static void doSomethingFunctional() {

        //Composicion 1
        MyFunctionalInterface clippy = (String param) -> {
            return "Hola soy clippy, y recibí el siguiente parametro: " + param;
        };

        //Composicion 2
        MyFunctionalInterface wilbert = (p) ->  "Hola soy Wilbert, y recibi el siguiente parametro" + p;


        doSomethingHighOrder(clippy);
        doSomethingHighOrder(wilbert);
        doSomethingHighOrder(x -> "Hola soy anonymous y recibi :" + x);


    }

    public static void doSomethingHighOrder (MyFunctionalInterface comportamiento) {

        //Ejecuto el comportamiento que recibi como argumento de la fn hg
        String r = comportamiento.doSomething("Java 11 es genial");
        System.out.println(r);
    }

    public static void main(String[] args) {

        //doSomethingFunctional();

        List<String> jedyList = new ArrayList<>();
        jedyList.add("Anakin");
        jedyList.add("Leia");
        jedyList.add("Luke");
        jedyList.add("Rey");


        /*for (int i = 0; i < jedyList.size(); i++) {
            String jedi =jedyList.get(i);
            System.out.println(jedi);
        }*/

        /*jedyList.forEach((String jedy) -> {
            System.out.println(jedy);
        });*/

       // jedyList.forEach(j-> System.out.println(j));

        //jedyList.forEach(System.out::println);

        /*PREDICADOS*/
        //Predicate<String> isAJedy = s-> s.equals("Rey");
        //jedyList.removeIf(isAJedy);

        // Opcion mas cheta

        //jedyList.removeIf(jedy-> jedy.equals("Rey"));
        //jedyList.forEach(System.out::println);

        //USO DE STREAMS

       /* List<String> filteredJedy =
                jedyList.stream()
                        .filter(x-> !x.equals("Rey"))
                        .peek(x1 -> System.out.println(x1))
                        .map(j->j.toString().toUpperCase())
                        .peek(System.out::println)
                        .collect(Collectors.toList());

        System.out.println("El primero" + filteredJedy);*/
        //System.out.println(jedyList);
    }

    List<String> palabras = Arrays.asList("java", "stream", "api", "filter");
    List<String> palabrasFiltradas = palabras.stream()
            .filter(p -> p.length() > 3)
            .collect(Collectors.toList());


}
