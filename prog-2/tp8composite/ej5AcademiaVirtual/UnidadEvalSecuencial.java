package tp8composite.ej5AcademiaVirtual;

import java.util.List;

public class UnidadEvalSecuencial extends UnidadEval{

    @Override
    public double obtenerPuntaje() {
        double puntajeTotal = 0;
        for (ElemAv elem: elemAvList) {
            puntajeTotal += elem.obtenerPuntaje();
        }
        return puntajeTotal;
    }

    @Override
    public double obtenerTiempoEstimado() {
        double tiempoEstimado = 0;
        for (ElemAv elem: elemAvList) {
            tiempoEstimado += elem.obtenerTiempoEstimado();
        }
        return tiempoEstimado;
    }
}
