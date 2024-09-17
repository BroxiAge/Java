package tp5.e8CongresoCsComputacion;

import java.util.*;

public class Trabajo {

    public Trabajo() {
        this.palabrasClaveList = new ArrayList<>();
    }

    //Articulo | Resumen | Poster
    private String categoria;
    private List<String> palabrasClaveList;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<String> getPalabrasClaveList() {
        //Asumir que le estoy pasando otro arreglo... no este
        return palabrasClaveList;
    }

    public void agregarPalabraClave(String pc) {
        System.out.println("Palabra clave agregada a la tarea");
        this.palabrasClaveList.add(pc);
    }
}
