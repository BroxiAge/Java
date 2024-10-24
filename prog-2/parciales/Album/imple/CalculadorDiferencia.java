package parciales.TresArroyos.imple;

public class CalculadorDiferencia extends Calculador {

    private double valorInicial;

    public CalculadorDiferencia(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    public double calcular(FiguritaEdicionLimitada fel) {
        return valorInicial - fel.getPrecio();
    }
}
