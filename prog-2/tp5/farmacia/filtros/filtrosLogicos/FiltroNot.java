package tp5.farmacia.filtros.filtrosLogicos;

import tp5.farmacia.*;
import tp5.farmacia.filtros.*;

public class FiltroNot extends Filtro {

    private Filtro f1;

    @Override
    public boolean acepta(Medicamento m) {
        return ! f1.acepta(m);
    }
}
