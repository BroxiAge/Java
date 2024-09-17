package tp5.e7;

public class EmpleadoPorcentaje extends Persona{

    //Asumir que se ingresa 0.05 si queres que gane el 5% de las ventas.
    private int porcentajePorVenta;
    private double montoTotalVentas;

    public EmpleadoPorcentaje(String nombre, String apellido, int dni, double sueldoMensual,
                        int porcentajeVentas) {
        super(nombre, apellido, dni, sueldoMensual);
        this.porcentajePorVenta = porcentajeVentas;
    }

    public double getSueldo() {
        return (super.getSueldo() + (montoTotalVentas * porcentajePorVenta));
    }

    public void vender(double precioArtVendido) {
        this.montoTotalVentas += precioArtVendido;
    }

}
