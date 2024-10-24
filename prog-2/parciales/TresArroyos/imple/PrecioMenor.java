package parciales.TresArroyos.imple;

public class PrecioMenor extends Filtro{

    private double precio;

    public PrecioMenor(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean acepta(Figurita f) {
        return f.getPrecio() < this.getPrecio();
    }
}
