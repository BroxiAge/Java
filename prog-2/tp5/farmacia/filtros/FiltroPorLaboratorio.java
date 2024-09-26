package tp5.farmacia.filtros;

import tp5.farmacia.Medicamento;

public class FiltroPorLaboratorio extends Filtro{

    private String laboratorio;

    public FiltroPorLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public boolean acepta(Medicamento m) {

        if (!m.getLaboratorio().equals(laboratorio)) {
            return true;
        }
        return false;
    }
}
