package parciales.tandil.imple;

import parciales.tandil.imple.filtro.*;

import java.util.*;

public class Pieza extends Elemento3D{

    private String color;
    private int cantPla, cantTiempo;

    public Pieza(String nombre, String desc, int cantPla, int cantTiempo, String color) {
        super(nombre, desc);
        this.cantPla = cantPla;
        this.cantTiempo = cantTiempo;
        this.color = color;
    }

    public int getCantPla() {
        return cantPla;
    }

    public void setCantPla(int cantPla) {
        this.cantPla = cantPla;
    }

    public int getCantTiempo() {
        return cantTiempo;
    }

    public void setCantTiempo(int cantTiempo) {
        this.cantTiempo = cantTiempo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int obtenerPlasticoNecesario() {
        return this.getCantPla();
    }

    @Override
    public int obtenerCantSimples(){
        return 1;
    }

    @Override
    public int obtenerTiempoFabricacion() {
        return this.getCantTiempo();
    }

    @Override
    public List<String> obtenerColor() {
        List<String> colorList = new ArrayList<>();
        colorList.add(this.color);
        return colorList;
    }

    @Override
    public List<Elemento3D> acepta(Filtro f) {

        List<Elemento3D> salida = new ArrayList<>();
        if (f.acepta(this))
            salida.add(this);
        return salida;
    }
}
