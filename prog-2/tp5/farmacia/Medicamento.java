package tp5.farmacia;

import java.util.*;

public class Medicamento {

    private String nombre;
    private String laboratorio;
    private int precio;
    private List<String> sintomaList;

    public Medicamento(String nombre, String laboratorio, int precio) {
        this.sintomaList = new ArrayList<>();

        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void addSintoma (String s) {
        this.sintomaList.add(s.toLowerCase());
        System.out.println("Sintoma: " + s + " agregado");
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", precio=" + precio +
                ", sintomaList=" + sintomaList +
                '}';
    }

    public boolean tratasSintoma(String sintoma) {
        if (!sintomaList.contains(sintoma)){
            return false;
        }
        return true;
    }
}
