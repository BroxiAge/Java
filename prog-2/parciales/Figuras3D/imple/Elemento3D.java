package parciales.tandil.imple;

import parciales.tandil.imple.filtro.*;

import java.util.*;

public abstract class Elemento3D {

    private String nombre, desc;

    public Elemento3D(String desc, String nombre) {
        this.desc = desc;
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int obtenerPlasticoNecesario ();
    public abstract int obtenerCantSimples();

    public abstract int obtenerTiempoFabricacion();

    public abstract List<String> obtenerColor();

    //Filtros
    public abstract List<Elemento3D> acepta(Filtro f);
}
