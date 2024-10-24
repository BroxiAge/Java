package parciales.SitioDeVideos.imple;

import parciales.SitioDeVideos.imple.filtro.*;

import java.time.*;
import java.util.*;

public class Video extends ElemDigital implements Comparable<Video> {

    private Usuario usuario;
    private int duracion, cantVisualizacion, meGusta, noMegusta;
    private LocalDate anoPublicacion;
    private List<String> palabrasClave;

    public Video(String titulo ,int noMegusta, int meGusta, int duracion, int cantVisualizacion, LocalDate anoPublicacion) {
        super(titulo);
        this.palabrasClave = new ArrayList<>();
        this.noMegusta = noMegusta;
        this.meGusta = meGusta;
        this.duracion = duracion;
        this.cantVisualizacion = cantVisualizacion;
        this.anoPublicacion = anoPublicacion;
    }

    public int getNoMegusta() {
        return noMegusta;
    }

    public void setNoMegusta(int noMegusta) {
        this.noMegusta = noMegusta;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantVisualizacion() {
        return cantVisualizacion;
    }

    public void setCantVisualizacion(int cantVisualizacion) {
        this.cantVisualizacion = cantVisualizacion;
    }

    public LocalDate getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(LocalDate anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void add(String palabraClave) {
        this.palabrasClave.add(palabraClave);
    }

    public boolean existePalabraClave(String palabraClave) {
        return palabrasClave.contains(palabraClave);
    }

    @Override
    public List<Video> buscar (Condicion c) {
        List<Video> salida = new ArrayList<>();

        if (c.cumple(this)){
            salida.add(this);
        }

        Collections.sort(salida);
        return salida;
    }

    @Override
    public int compareTo(Video v) {
        int comparacionNombre = this.usuario.getNombreusuario().compareTo(v.usuario.getNombreusuario());

        if (comparacionNombre == 0) {
            return this.usuario.getEmail().compareTo(v.usuario.getEmail());
        }
        return comparacionNombre;
    }

    @Override
    public List<String> buscarPorPalabraClave(String palabraClave) {
        List<String> salida = new ArrayList<>();

        salida.addAll(this.palabrasClave);
        return salida;
    }

    @Override
    public int obtenerDuracion() {
        return this.getDuracion();
    }
}
