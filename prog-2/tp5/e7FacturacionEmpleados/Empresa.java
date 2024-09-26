package tp5.e7FacturacionEmpleados;

import java.util.*;

public class Empresa {

    private String nombre;
    private List<Persona> personas = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSumaTotalSueldos() {

        double sueldoTotal = 0;

        for (Persona persona : personas) {
            sueldoTotal = sueldoTotal + persona.getSueldo();
        }

        return sueldoTotal;
    }
}
