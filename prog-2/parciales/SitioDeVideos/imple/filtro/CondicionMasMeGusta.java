package parciales.SitioDeVideos.imple.filtro;

import parciales.SitioDeVideos.imple.*;

public class CondicionMasMeGusta extends Condicion {

    private int cantMinMeGusta;

    public CondicionMasMeGusta(int cantMinMeGusta) {
        this.cantMinMeGusta = cantMinMeGusta;
    }

    public boolean cumple (Video v) {
        return v.getMeGusta() >= cantMinMeGusta;
    }
}
