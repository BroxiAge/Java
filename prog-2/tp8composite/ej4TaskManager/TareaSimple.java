package tp8composite.ej4TaskManager;

import java.util.*;

public class TareaSimple extends ElementoAdministrador{

    private String accionARealizar;
    private double costoAsociado;
    private double tiempoEstimado;
    private final double TIEMPO_ADICIONAL = 10;

    public TareaSimple(String accionARealizar, double costoAsociado, double tiempoEstimado) {
        this.accionARealizar = accionARealizar;
        this.costoAsociado = costoAsociado;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getAccionARealizar() {
        return accionARealizar;
    }

    public void setAccionARealizar(String accionARealizar) {
        this.accionARealizar = accionARealizar;
    }

    public double getCostoAsociado() {
        return costoAsociado;
    }

    public void setCostoAsociado(double costoAsociado) {
        this.costoAsociado = costoAsociado;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado + TIEMPO_ADICIONAL;
    }

    @Override
    public double obtenerCosto() {
        return costoAsociado;
    }

    @Override
    public double obtenerTiempoEstimado() {
        return tiempoEstimado;
    }

    @Override
    public List<String> obtenerAcciones() {

        List<String> acciones = new ArrayList<>();
        acciones.add(accionARealizar);
        return acciones;
    }
}
