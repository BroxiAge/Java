package libreria;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String dirección;
    private ArrayList<String> autoresFavoritos;
    protected ArrayList<String> generosFavoritos;
    private ArrayList<Publicacion> compras;
    private int porcentajeDescuento;

    public Cliente(String nombre, String apellido, String dni, String dirección) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.dirección = dirección;
        this.autoresFavoritos = new ArrayList<>();
        this.generosFavoritos = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.porcentajeDescuento = 10;
    }

    public boolean leGusta(Publicacion pub){
        return this.autoresFavoritos.contains(pub.getAutor());
    }

    public boolean legustaGenero(String genero){
        return this.generosFavoritos.contains(genero);
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void agregarAutorFavorito(String autor){
        this.autoresFavoritos.add(autor);
    }

    public void agregarGeneroFavorito(String genero){
        this.generosFavoritos.add(genero);
    }

    public void comprar(Publicacion pub){
        this.compras.add(pub);
    }

    public boolean compro(Publicacion pub){
        return compras.contains(pub);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
}
