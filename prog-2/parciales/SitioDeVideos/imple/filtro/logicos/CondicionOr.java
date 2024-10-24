package parciales.SitioDeVideos.imple.filtro.logicos;

import parciales.SitioDeVideos.imple.*;
import parciales.SitioDeVideos.imple.filtro.*;

public class CondicionOr extends Condicion {

    private Condicion f1, f2;

    public CondicionOr(Condicion f1, Condicion f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Video v) {
        return f1.cumple(v) || f2.cumple(v);
    }
}
