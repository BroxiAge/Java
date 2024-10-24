package parciales.TresArroyos.imple;

public class CalculadorFijo extends Calculador{

    private double valorFijo;

    public CalculadorFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    public double calcular(FiguritaEdicionLimitada f) {
        return this.valorFijo;
    }
}
