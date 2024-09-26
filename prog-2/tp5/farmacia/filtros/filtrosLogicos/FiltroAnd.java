package tp5.farmacia.filtros.filtrosLogicos;

import tp5.farmacia.*;
import tp5.farmacia.filtros.*;

public class FiltroAnd extends Filtro{

    private Filtro f1;
    private Filtro f2;

    @Override
    public boolean acepta(Medicamento m) {
        return f1.acepta(m) && f2.acepta(m);
    }
}
