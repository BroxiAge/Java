package parciales.TresArroyos.imple;

public class CalculadorProducto extends Calculador{

    Calculador c1, c2;

    public CalculadorProducto(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Calculador getC1() {
        return c1;
    }

    public void setC1(Calculador c1) {
        this.c1 = c1;
    }

    public Calculador getC2() {
        return c2;
    }

    public void setC2(Calculador c2) {
        this.c2 = c2;
    }

    @Override
    public double calcular(FiguritaEdicionLimitada fel) {
        return c1.calcular(fel) * c2.calcular(fel);
    }
}
