package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

public class CondOr extends Filtro {

    private Filtro f1;
    private Filtro f2;

    public CondOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean acepta(Elemento3D elemento) {
        return f1.acepta(elemento) || f2.acepta(elemento);
    }
}
