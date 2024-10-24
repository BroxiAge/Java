package parciales.TresArroyos.imple;

public class FiguritaEdicionLimitada extends Figurita{

    private int unidadDispEnElMundo;
    Calculador formaPrecio;

    public FiguritaEdicionLimitada(String album, int numero, double precio, Calculador formaPrecio, int unidadDispEnElMundo) {
        super(album, numero, precio);
        this.formaPrecio = formaPrecio;
        this.unidadDispEnElMundo = unidadDispEnElMundo;
    }

    @Override
    public double obtenerPrecio(){

        double precio = super.obtenerPrecio();
        double precioEspecial = formaPrecio.calcular(this);

        if (precioEspecial >= precio) {
            return precio;
        }

       return precioEspecial;
    }

}
