package parciales.TresArroyos.imple;

import java.util.*;

public abstract class ElementoColeccionable {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double obtenerPrecio();

    public abstract List<Figurita> buscarFigurita(Filtro filtro);
}
