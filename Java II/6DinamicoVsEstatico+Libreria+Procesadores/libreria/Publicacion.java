package libreria;

import java.util.ArrayList;

public class Publicacion {
    private String nombre;
    private String autor;
    private double precio;
    private int cantPaginas;
    private String resumen;
    private ArrayList<String> generos;

    public Publicacion(String nombre, String autor, double precio, int cantPaginas, String resumen) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantPaginas = cantPaginas;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
    }

    public void addGenero(String genero){
        this.generos.add(genero);
    }

    public boolean tieneGenero(String genero){
        return this.generos.contains(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public boolean equals(Object obj) {
        try{
            Publicacion pub = (Publicacion) obj;
            return this.getNombre().equals(pub.getNombre());
        } catch (Exception e){
            return false;
        }
    }
}
