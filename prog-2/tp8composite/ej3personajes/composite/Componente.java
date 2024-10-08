package tp8composite.ej3personajes.composite;

public abstract class Componente {

    private String nombre;

    public abstract int getPeso();
    public abstract int getEdad();
    public abstract int getCantidadPersonajes();
    public abstract double getFuerza();

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
