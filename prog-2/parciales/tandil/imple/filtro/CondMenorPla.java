package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

public class CondPla extends Filtro {

    private int cantPla;

    public CondPla(int cantPla) {
        this.cantPla = cantPla;
    }

    @Override
    public boolean acepta(Elemento3D elemento) {
        return elemento.obtenerPlasticoNecesario()
    }
}
