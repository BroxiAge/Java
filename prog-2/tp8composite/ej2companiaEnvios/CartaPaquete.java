package tp8composite.ej2companiaEnvios;

public class CartaPaquete extends Envio{

    private Persona destinatario;
    private Persona remitente;
    private boolean retiraSucursal;
    private boolean enviaDomicilio;
    private int peso;

    public int getTamanio() {
        return this.peso;
    }
}
