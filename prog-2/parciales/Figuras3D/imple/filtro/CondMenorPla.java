package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

public class CondMenorPla extends Filtro {

    private int cantPla;

    public CondMenorPla(int cantPla) {
        this.cantPla = cantPla;
    }

    @Override
    public boolean acepta(Elemento3D elemento) {
        return elemento.obtenerPlasticoNecesario() < cantPla;
    }
}
