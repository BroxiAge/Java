package tp8composite.ej1.sistemaDeArchivos;

public class Archivo extends ElementoSA{

    private double tamanio;
    private String extension;

    public Archivo(String nombre) {
        super(nombre);
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return this.tamanio;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }
}
