package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

public class CondColor extends Filtro{

    String color;

    public CondColor(String color) {
        this.color = color;
    }

    @Override
    public boolean acepta(Elemento3D elemento) {
        return elemento.obtenerColor().contains(color);
    }
}
