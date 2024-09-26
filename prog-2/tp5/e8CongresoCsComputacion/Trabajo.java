package tp5.e8CongresoCsComputacion;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {

    //Articulo | Resumen | Poster
    protected String categoria;
    protected List<String> palabrasClaveList;

    public Trabajo(String categoria) {
        this.categoria = categoria;
        this.palabrasClaveList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "categoria='" + categoria + '\'' +
                ", palabrasClaveList=" + palabrasClaveList +
                '}';
    }

    public void agregarPalabraClave(String pc) {
        System.out.println("Palabra clave agregada a la tarea");
        this.palabrasClaveList.add(pc);
    }

    public boolean acepta(Evaluador ev) {

        System.out.println("Trabajo: Evaluando si el evaluador es aceptado por el trabajo...");

        for (String palabraClave : palabrasClaveList) {

            if (!ev.getTemasConocidosList().contains(palabraClave)) {
                System.out.println("Evaluador no aceptado. No conoce la palabra clave: " + palabraClave);
                return false;
            }
        }

        System.out.println("Evaluador aceptado. Conoce todas las palabras clave del trabajo.");
        return true;
    }
}
