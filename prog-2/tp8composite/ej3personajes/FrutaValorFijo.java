package tp8composite.ej3personajes;

public class FrutaValorFijo extends Fruta {

    private double VALOR_FIJO = 6.0;

    @Override
    public double calcularFuerza(double fuerza) {
        return VALOR_FIJO;
    }
}
