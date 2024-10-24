package parciales.SitioDeVideos.imple.filtro.logicos;

import parciales.SitioDeVideos.imple.*;
import parciales.SitioDeVideos.imple.filtro.*;

public class CondicionNot extends Condicion {

    private Condicion f1;

    @Override
    public boolean cumple(Video v) {
        return !f1.cumple(v);
    }
}
