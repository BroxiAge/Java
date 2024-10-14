package tp8composite.ej3personajes;

public class FrutaFuerzaFijaMasPeso extends Fruta {

    private double VALOR_FIJO = 6.0;

    @Override
    public double calcularFuerza(double peso) {
        return VALOR_FIJO + peso * 7;
    }
}
