package parciales.TresArroyos.imple;

import java.util.*;

public class ColeccionTematica extends ElementoColeccionable{

    private List<ElementoColeccionable> elementoColeccionableList;
    private int descuento;
    private final int DESCUENTO_DEFAULT = 5;

    public ColeccionTematica(int descuento) {
        this.elementoColeccionableList = new ArrayList<>();
        this.descuento = descuento;
    }

    public ColeccionTematica() {
        this.descuento = DESCUENTO_DEFAULT;
        this.elementoColeccionableList = new ArrayList<>();
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public List<ElementoColeccionable> getElementoColeccionableList() {
        return elementoColeccionableList;
    }

    public void setElementoColeccionableList(List<ElementoColeccionable> elementoColeccionableList) {
        this.elementoColeccionableList = elementoColeccionableList;
    }

    @Override
    public double obtenerPrecio() {
        double precioTotal = 0;

        for (ElementoColeccionable elemento : elementoColeccionableList) {
            precioTotal += elemento.obtenerPrecio();
        }
        return precioTotal -  precioTotal * descuento / 100;
    }

    @Override
    public List<Figurita> buscarFigurita(Filtro f) {
        List<Figurita> salida = new ArrayList<>();

        for (ElementoColeccionable elemento : elementoColeccionableList) {
            ElementoColeccionable aux = elemento;
            salida.addAll(aux.buscarFigurita(f));
        }
        salida.sort(salida);
        return salida;
    }


}
