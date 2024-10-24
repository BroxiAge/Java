package parciales.SitioDeVideos.imple.filtro;

import parciales.SitioDeVideos.imple.*;

public class CondicionAutor extends Condicion {

    private String autorBuscado;

    public CondicionAutor(String autorBuscado) {
        this.autorBuscado = autorBuscado;
    }

    public boolean cumple(Video v) {
        return v.getUsuario().getNombreusuario().equals(autorBuscado);
    }
}
