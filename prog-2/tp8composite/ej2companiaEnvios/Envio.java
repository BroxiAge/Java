package tp8composite.ej2companiaEnvios;

public abstract class Envio {

    protected Persona remitente;
    protected Persona destinatario;

    protected int nroTracking;

    public int getNroTracking() {
        return nroTracking;
    }

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }

    public abstract int getTamanio();

}
