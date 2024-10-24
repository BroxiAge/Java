package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

public class CondMayorTiempo extends Filtro {

    private int tiempo;

    public CondMayorTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean acepta(Elemento3D elemento) {
        return elemento.obtenerTiempoFabricacion() > tiempo;
    }
}
