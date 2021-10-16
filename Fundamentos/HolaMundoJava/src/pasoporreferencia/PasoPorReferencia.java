package pasoporreferencia;

import clases.Persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        System.out.println("p1 = " + p1.nombre);
        p1 = cambiarValor(p1);
        System.out.println("p1 = " + p1.nombre);
    }

public static Persona cambiarValor(Persona persona){
    if (persona == null) {
        return null;
    }
    persona.nombre = "Carla";
    return persona;
}
}
