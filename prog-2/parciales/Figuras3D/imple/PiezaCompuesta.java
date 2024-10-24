package parciales.tandil.imple;

import parciales.tandil.imple.filtro.*;

import java.util.*;

public class PiezaCompuesta extends Elemento3D{

    private List<Elemento3D> elemento3DList;
    private int plasticoExtra, tiempoExtra;

    //Para cubrir CompuestaRapida o compuestaPesada.
    public PiezaCompuesta(String nombre, String desc, int plasticoExtra, int tiempoExtra) {
        super(nombre, desc);
        this.plasticoExtra = plasticoExtra;
        this.tiempoExtra = tiempoExtra;
        this.elemento3DList = new ArrayList<>();
    }

    //Default.
    public PiezaCompuesta(String nombre, String desc) {
        super(nombre, desc);
        this.plasticoExtra = 1;
        this.tiempoExtra = 45;
        this.elemento3DList = new ArrayList<>();
    }

    public void add(Elemento3D e) {
        this.elemento3DList.add(e);
    }

    @Override
    public int obtenerPlasticoNecesario() {
        int cantPlastico = 0;
        for (Elemento3D e : this.elemento3DList) {
            cantPlastico += e.obtenerPlasticoNecesario();
        }
        return cantPlastico + plasticoExtra * obtenerPlasticoNecesario();
    }

    @Override
    public int obtenerCantSimples() {
        int cantSimple = 0;
        for (Elemento3D e : this.elemento3DList) {
            cantSimple += obtenerCantSimples();
        }
        return cantSimple;
    }

    // ---------------------- //

    @Override
    public int obtenerTiempoFabricacion() {
        int tiempoFabricacion = 0;
        for (Elemento3D e : this.elemento3DList) {
            tiempoFabricacion += e.obtenerTiempoFabricacion();
        }
        return tiempoFabricacion + tiempoExtra;
    }

    // ---------------------- //

    @Override
    public List<String> obtenerColor() {
        List<String> colorList = new ArrayList<>();
        for (Elemento3D listaColoresAux : this.elemento3DList) {
            for (String colorAux : listaColoresAux.obtenerColor()) {
                if(!colorList.contains(colorAux)) {
                    colorList.add(colorAux);
                }
            }
        }
        return colorList;
    }

    // Filtrobich //

    public ArrayList<Elemento3D> acepta(Filtro f){
        ArrayList<Elemento3D> salida = new ArrayList<Elemento3D>();

        for (Elemento3D listaElemento : this.elemento3DList) {
            Elemento3D elementoAux = listaElemento;
            salida.addAll(elementoAux.acepta(f));
        }
        return salida;
    }
}
