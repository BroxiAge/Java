package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

import java.util.logging.*;

public class CondNot extends Filtro {

    private Filtro f;
    public CondNot(Filter f) {}

    @Override
    public boolean acepta(Elemento3D elemento) {
        return !f.acepta(elemento);
    }
}
