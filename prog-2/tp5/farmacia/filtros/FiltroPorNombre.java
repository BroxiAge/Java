package tp5.farmacia.filtros;

import tp5.farmacia.*;

public class FiltroPorNombre extends Filtro{

    private String nombre;

    public FiltroPorNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public boolean acepta(Medicamento m) {
        if (!m.getNombre().equals(nombre)) {
            return false;
        }
        return true;
    }
}
