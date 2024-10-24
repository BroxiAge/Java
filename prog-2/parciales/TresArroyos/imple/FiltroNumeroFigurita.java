package parciales.TresArroyos.imple;

public class FiltroNumeroFigurita extends Filtro{

    private int numero;

    public FiltroNumeroFigurita(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean acepta(Figurita f) {
        return f.getNumero() == numero;
    }
}
