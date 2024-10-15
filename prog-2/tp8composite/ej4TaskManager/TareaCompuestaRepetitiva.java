package tp8composite.ej4TaskManager;

import java.util.*;

public class TareaCompuestaRepetitiva extends TareaCompuesta {

    private int repeticiones;

    public TareaCompuestaRepetitiva(String especialidad, int repeticiones) {
        super(especialidad);
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() * repeticiones;
    }

    @Override
    public double obtenerTiempoEstimado() {
        return super.obtenerTiempoEstimado() * repeticiones;
    }

    @Override
    public List<String> obtenerAcciones() {
        List<String> acciones = new ArrayList<>();
        List<String> accionesOriginales = super.obtenerAcciones();

        for (int i = 0; i < repeticiones; i++) {
            acciones.addAll(accionesOriginales);
        }
        return acciones;
    }

}
