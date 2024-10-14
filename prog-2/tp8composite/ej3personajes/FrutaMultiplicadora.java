package tp8composite.ej3personajes;

public class FrutaMultiplicadora extends Fruta{

    private int VALOR_MULTIPLICADOR = 10;

    @Override
    public double calcularFuerza(double fuerza) {
        return fuerza * VALOR_MULTIPLICADOR;
    }


}
