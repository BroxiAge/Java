package tp8composite.ej3personajes.composite;

import java.util.ArrayList;
import java.util.List;

public class Tripulacion extends Componente {

    private List<Componente> componentes;

    public Tripulacion(String nombre) {
        super(nombre);
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public int getPeso() {
        if (componentes.isEmpty()) {
            return 0;
        }
        return componentes.get(0).getPeso();
    }

    @Override
    public int getEdad() {
        int maxEdad = 0;
        for (Componente componente : componentes) {
            if (componente.getEdad() > maxEdad) {
                maxEdad = componente.getEdad();
            }
        }
        return maxEdad;
    }

    @Override
    public int getCantidadPersonajes() {
        int cantidad = 0;
        for (Componente componente : componentes) {
            cantidad += componente.getCantidadPersonajes();
        }
        return cantidad;
    }

    @Override
    public double getFuerza() {
        int fuerzaTotal = 0;
        for (Componente componente : componentes) {
            fuerzaTotal += componente.getFuerza();
        }
        return fuerzaTotal;
    }
}
