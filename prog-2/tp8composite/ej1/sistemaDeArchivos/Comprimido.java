package tp8composite.ej1.sistemaDeArchivos;

import java.util.*;

public class Comprimido extends Carpeta{

    private double tasaCompresion;
    List<ElementoSA> elementos;

    public Comprimido(String nombre, double tasa) {
        super(nombre);
        this.tasaCompresion = tasa;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * tasaCompresion;
    }

}
