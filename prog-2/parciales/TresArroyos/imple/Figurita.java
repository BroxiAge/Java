package parciales.TresArroyos.imple;

import java.util.*;

public class Figurita extends ElementoColeccionable{

    private String album;
    private int numero;
    private double precio;

    public Figurita(String album, int numero, double precio) {
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return this.getPrecio();
    }

    public List<Figurita> buscarFigurita(Filtro f) {
        List<Figurita> salida = new ArrayList<Figurita>();
        if (f.acepta(this)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public int compareTo(Figurita f) {
        double resultado = this.getPrecio() - f.getPrecio();

        if (resultado == 0){
            return  this.getNombre().compareTo(f.getNombre());
        }

        if (resultado > 0){
            return 1;
        }else
            return -1;

    }

   /* @Override
    public int compareTo(Figurita f) {
        int resultado = Double.compare(this.getPrecio(), f.getPrecio());

        if (resultado == 0) {
            return this.getNombre().compareTo(f.getNombre());
        }

        return resultado;
    }*/

}
