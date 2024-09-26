package tp5.farmacia.filtros;

import tp5.farmacia.*;

public class FiltroPorSintoma extends Filtro{

    private String sintoma;

    @Override
    public boolean acepta(Medicamento m) {

        if (!m.tratasSintoma(this.sintoma)){
            return false;
        }
        return true;
    }
}
