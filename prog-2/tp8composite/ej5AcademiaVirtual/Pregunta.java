package tp8composite.ej5AcademiaVirtual;

import java.util.*;

public class Pregunta extends ElemAv{

    private String enunciado;
    private double puntaje;
    private double tiempoEstimado;
    private List<String> conceptosEvaluados;

    public Pregunta(String enunciado, double puntaje, double tiempoEstimado) {
        this.conceptosEvaluados = new ArrayList<>();
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void addConcepto(String concepto){
        conceptosEvaluados.add(concepto);
    }

    @Override
    public double obtenerPuntaje() {
        return this.getPuntaje();
    }

    @Override
    public double obtenerTiempoEstimado() {
        return this.getTiempoEstimado();
    }

    @Override
    public List<String> obtenerListadoConcepto() {
        List<String> listaRetorno = new ArrayList<>();
        listaRetorno.add(String.valueOf(conceptosEvaluados));
        return listaRetorno;
    }
}
