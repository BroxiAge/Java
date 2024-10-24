package parciales.SitioDeVideos.imple.filtro;

import parciales.SitioDeVideos.imple.*;

public class CondicionPalabraClave extends Condicion {

    private String palabraClaveBuscada;

    public CondicionPalabraClave(String palabraClaveBuscada) {
        this.palabraClaveBuscada = palabraClaveBuscada;
    }

    @Override
    public boolean cumple(Video v) {
        return v.existePalabraClave(palabraClaveBuscada);
    }
}
