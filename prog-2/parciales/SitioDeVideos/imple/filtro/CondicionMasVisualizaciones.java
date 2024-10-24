package parciales.SitioDeVideos.imple.filtro;

import parciales.SitioDeVideos.imple.*;

public class CondicionMasVisualizaciones extends Condicion {

    //Devolver un listado con los videos con más de 1000 visualizaciones

    private int minCantVisualizaciones;

    public CondicionMasVisualizaciones(int minCantVisualizaciones) {
        this.minCantVisualizaciones = minCantVisualizaciones;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getCantVisualizacion() > minCantVisualizaciones;
    }
}
