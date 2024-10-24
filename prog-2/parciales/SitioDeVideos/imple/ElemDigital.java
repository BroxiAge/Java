package parciales.SitioDeVideos.imple;

import parciales.SitioDeVideos.imple.filtro.*;

import java.util.*;

public abstract class ElemDigital {

    private String titulo;

    public ElemDigital(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract List<Video> buscar(Condicion c);

    public abstract int obtenerDuracion();

}
