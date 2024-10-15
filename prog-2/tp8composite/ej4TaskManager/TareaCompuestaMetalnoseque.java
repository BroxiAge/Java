package tp8composite.ej4TaskManager;

public class TareaCompuestaMetalnoseque extends TareaCompuesta {


    public TareaCompuestaMetalnoseque(String especialidad) {
        super(especialidad);
    }
    // Enunciado: El costo se calcula como la suma de los costos de sus actividades
    //Esta no iria porque es la misma implementacion que tareaCompuesta, usa la del padre.

    /*@Override
    public double obtenerCosto() {

        return super.obtenerCosto();
    }*/

    @Override
    public double obtenerTiempoEstimado() {
        double tiempoTotal = 0;
        for (ElementoAdministrador elem : elementoAdministradorList) {
            tiempoTotal += elem.obtenerTiempoEstimado();
        }
        return tiempoTotal;
    }
}
