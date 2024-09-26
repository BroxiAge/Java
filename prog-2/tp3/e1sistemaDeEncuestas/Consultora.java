package tp3.e1sistemaDeEncuestas;

import java.util.ArrayList;
import java.util.List;

public class Consultora {

    private List<Encuesta> encuestaList = new ArrayList<>();

    public List<Encuesta> getEncuestaList() {
        return encuestaList;
    }

    public void addEncuesta(Encuesta e1) {
        this.encuestaList.add(e1);
        this.describeEncuestas();
    }

    public void describeEncuestas() {
        System.out.println(this.encuestaList.toString());
    }

    @Override
    public String toString() {
        return "Consultora{" +
                "encuestaList=" + encuestaList +
                '}';
    }
}
