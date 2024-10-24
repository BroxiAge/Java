package parciales.SitioDeVideos.imple.filtro;

import parciales.SitioDeVideos.imple.*;

import java.time.*;

public class CondicionAno extends Condicion {

    private LocalDate anoABuscar;

    public CondicionAno(LocalDate anoABuscar) {
        this.anoABuscar = anoABuscar;
    }

    public boolean cumple(Video v) {
        return v.getAnoPublicacion().getYear() == anoABuscar.getYear();
    }
}
