package tp8composite.ej5AcademiaVirtual;

import java.util.*;

public class UnidadEvalOptativa extends UnidadEval{


    @Override
    public double obtenerPuntaje() {
        double puntajeMayor = 0;
        for (ElemAv e : elemAvList) {
            if (e.obtenerPuntaje() > puntajeMayor) {
                puntajeMayor = e.obtenerPuntaje();
            }
        }
        return puntajeMayor;
    }

    @Override
    public double obtenerTiempoEstimado() {
        double tiempoMayor = 0;
        for (ElemAv e : elemAvList) {
            if (e.obtenerTiempoEstimado() > tiempoMayor) {
                tiempoMayor = e.obtenerTiempoEstimado();
            }
        }
        return tiempoMayor;
    }
}
