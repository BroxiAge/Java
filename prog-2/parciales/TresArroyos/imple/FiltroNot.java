package parciales.TresArroyos.imple;

public class FiltroNot extends Filtro {

    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    public Filtro getF1() {
        return f1;
    }

    public void setF1(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean acepta(Figurita f) {
        return !f1.acepta(f);
    }
}
