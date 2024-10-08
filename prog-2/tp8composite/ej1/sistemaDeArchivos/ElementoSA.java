package tp8composite.ej1.sistemaDeArchivos;

public abstract class ElementoSA {

    protected String nombre;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getTamanio();
    public abstract int cantidadElementos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
