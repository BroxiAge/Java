package tp5.e8CongresoCsComputacion;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {

    private List<String> temasConocidosList;
    private List<Trabajo> trabajosAsignadosList;

    public Evaluador() {
        this.temasConocidosList = new ArrayList<>();
        this.trabajosAsignadosList = new ArrayList<>();
    }

    public void agregarTema(String tema) {
        System.out.println("Tema: " + tema + " agregado exitosamente");
        this.temasConocidosList.add(tema);
    }

    public void agregarTrabajo(Trabajo trabajo) {
        System.out.println("Trabajo: " + trabajo + " agregado exitosa");
        this.trabajosAsignadosList.add(trabajo);
    }

    public void verListaDeTrabajos() {

        for (Trabajo t : this.trabajosAsignadosList) {
            System.out.println(t.toString());
        }

        System.out.println("La cantidad de trabajos que tengo que hacer son: " + this.trabajosAsignadosList.size());
    }

    public List<String> getTemasConocidosList() {
        return new ArrayList<String>(temasConocidosList);
    }
}
