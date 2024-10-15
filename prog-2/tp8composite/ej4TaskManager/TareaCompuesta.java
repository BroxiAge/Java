package tp8composite.ej4TaskManager;

import java.util.*;

public class TareaCompuesta extends ElementoAdministrador{

    protected List<ElementoAdministrador> elementoAdministradorList;
    private String especialidad;

    public TareaCompuesta(String especialidad) {
        this.elementoAdministradorList = new ArrayList<>();
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void add (ElementoAdministrador elem) {
        this.elementoAdministradorList.add(elem);
    }

    @Override
    public double obtenerCosto() {
        double costoTotal = 0;
        for (ElementoAdministrador elem : elementoAdministradorList) {
            costoTotal += elem.obtenerCosto();
        }
        return costoTotal;
    }

    @Override
    public double obtenerTiempoEstimado() {
        double tiempoTotal = 0;
        for (ElementoAdministrador elem : elementoAdministradorList) {
            tiempoTotal += elem.obtenerTiempoEstimado();
        }
        return tiempoTotal;
    }

    @Override
    public List<String> obtenerAcciones() {
        List<String> acciones = new ArrayList<>();
        for (ElementoAdministrador elem : elementoAdministradorList) {
            acciones.addAll(elem.obtenerAcciones());
        }
        return acciones;
    }
}
