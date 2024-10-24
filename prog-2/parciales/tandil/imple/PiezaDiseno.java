package parciales.tandil.imple.filtro;

import parciales.tandil.imple.*;

public class PiezaDiseno extends PiezaCompuesta {

    private Filtro filtro;

    public PiezaDiseno(String nombre, String desc, Filtro filtro) {
        super(nombre, desc);
        this.filtro = filtro;
    }

    public PiezaDiseno(String nombre, String desc, int plasticoExtra, int tiempoExtra, Filtro filtro) {
        super(nombre, desc, plasticoExtra, tiempoExtra);
        this.filtro = filtro;
    }

    public void addElemento(Elemento3D elemento3D) {
        if (filtro.acepta(elemento3D)) {
            super.add(elemento3D);
        }
    }


}
