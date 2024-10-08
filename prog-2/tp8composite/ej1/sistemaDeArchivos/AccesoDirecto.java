package tp8composite.ej1.sistemaDeArchivos;

public class AccesoDirecto extends ElementoSA{

    private static final String PREFIJO = "Acceso directo a ";
    private static final double TAMANIO = 1.0;
    private ElementoSA referencia;

    public AccesoDirecto(String nombre) {
        super(PREFIJO + nombre);
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public int cantidadElementos() {
        return 0;
    }

    public ElementoSA getReferencia() {
        return referencia;
    }

    public void setReferencia(ElementoSA referencia) {
        this.referencia = referencia;
    }
}
