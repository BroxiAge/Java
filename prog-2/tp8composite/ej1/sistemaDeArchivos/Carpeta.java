package tp8composite.ej1.sistemaDeArchivos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends ElementoSA{

    private List<ElementoSA> elementosList;

    public Carpeta(String nombre) {
        super(nombre);
        this.elementosList = new ArrayList<>();
    }

    public void agregarElemento(ElementoSA elem) {
        this.elementosList.add(elem);
    }

    public int cantidadElementos() {

        int cantTotal = 0;
        for (ElementoSA elem : elementosList) {
            cantTotal += elem.cantidadElementos();
        }
        return 1+cantTotal; //El uno es porque se tiene que devovler a ella misma, mas las subcarpetas.
    }

    @Override
    public double getTamanio() {

        int tamanio = 0;
        for (ElementoSA elem : elementosList) {
            tamanio += elem.getTamanio();
        }
        return tamanio; //El uno es porque se tiene que devovler a ella misma, mas las subcarpetas.
    }
}
