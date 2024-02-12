package com.mitocode.instance.of;

import com.mitocode.instance.of.entity.Chocolate;
import com.mitocode.instance.of.entity.Fruta;
import com.mitocode.instance.of.entity.Manzana;
import com.mitocode.instance.of.entity.Naranja;

import java.util.ArrayList;
import java.util.List;

public class App {

/* Se tiene una canasta dodne solo se debe permitir ingresar frutas, cualquier otra cosa debe estar reachazado,
y la app debe decir objeto no permitido
 */
private List frutaLst = new ArrayList<>(); // Corrige aquí

    public void verificar(Object o) {
        if (o instanceof Fruta) {
            frutaLst.add(o); // Corrige aquí
            System.out.println("Se agrego la fruta");
        } else {
            System.out.println("objeto " + o.toString() + " rechazado"); // Corrige aquí
        }
    }

    public static void main(String[] args) {

        Fruta m = new Manzana("Manzana verde");
        Fruta n = new Naranja("Naranja deliciosa");
        Chocolate c = new Chocolate("Milka");

        App app = new App();

        app.verificar(m);
        app.verificar(n);
        app.verificar(c);
    }
}
