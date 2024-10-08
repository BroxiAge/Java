package tp8composite.ej2companiaEnvios;

public class CartaPaquete extends Envio{

    private String destinatario;
    private String remitente;
    private boolean retiraSucursal;
    private boolean enviaDomicilio;
    private int peso;


    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public boolean isRetiraSucursal() {
        return retiraSucursal;
    }

    public void setRetiraSucursal(boolean retiraSucursal) {
        this.retiraSucursal = retiraSucursal;
    }

    public boolean isEnviaDomicilio() {
        return enviaDomicilio;
    }

    public void setEnviaDomicilio(boolean enviaDomicilio) {
        this.enviaDomicilio = enviaDomicilio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanio() {
        return this.peso;
    }
}
