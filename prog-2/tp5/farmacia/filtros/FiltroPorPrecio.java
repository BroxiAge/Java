package tp5.farmacia.filtros;

import tp5.farmacia.*;

public class FiltroPorPrecio extends Filtro {

    private int precio;

    @Override
    public boolean acepta(Medicamento m) {
        if (m.getPrecio() < precio) {
            return true;
        }
        return false;
    }
}
