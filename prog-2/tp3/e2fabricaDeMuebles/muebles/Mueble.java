package tp3.e2fabricaDeMuebles.muebles;

public class Mueble {

    private String nombreMueble;
    private double peso;
    private double costoDeFabricacion;
    private double valorDeVenta;
    private String tipoMadera;
    private String color;

    public Mueble(double peso, double costoDeFabricacion, double valorDeVenta, String tipoMadera, String color, String nombreMueble) {
        this.peso = peso;
        this.costoDeFabricacion = costoDeFabricacion;
        this.valorDeVenta = valorDeVenta;
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.nombreMueble = nombreMueble;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCostoDeFabricacion() {
        return costoDeFabricacion;
    }

    public void setCostoDeFabricacion(double costoDeFabricacion) {
        this.costoDeFabricacion = costoDeFabricacion;
    }

    public double getValorDeVenta() {
        return valorDeVenta;
    }

    public void setValorDeVenta(double valorDeVenta) {
        this.valorDeVenta = valorDeVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreMueble() {
        return nombreMueble;
    }

    public void setNombreMueble(String nombreMueble) {
        this.nombreMueble = nombreMueble;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "peso=" + peso +
                ", costoDeFabricacion=" + costoDeFabricacion +
                ", valorDeVenta=" + valorDeVenta +
                ", tipoMadera='" + tipoMadera + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
