package parciales.tandil.imple;

public class PiezaExclusiva extends Pieza {

    private int costoExclusividad;

    public PiezaExclusiva(String nombre, String desc, int cantPla, int cantTiempo, String color, int costoExclusividad) {
        super(nombre, desc, cantPla, cantTiempo, color);
        this.costoExclusividad = costoExclusividad;
    }

    public int getCosto() {
        super.getCosto() + costoExclusividad;
    }

}
