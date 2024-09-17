package tp5.e8CongresoCsComputacion;

import java.util.*;

public class Evaluador {

    protected List<String> temasConocidosList;

    public Evaluador() {
        this.temasConocidosList = new ArrayList<>();
    }

    public void agregarTema(String tema) {
        System.out.println("Tema: " + tema + " agregado exitosamente");
        this.temasConocidosList.add(tema);
    }

    public boolean soyIdoneo(Trabajo t) {

        for (String tema : t.getPalabrasClaveList()) {
            if (!conozcoElTema(tema)) {
                System.out.println("No soy Idoneo porque no conozco el tema: " + tema);
                return false;
            }
        }
        System.out.println("Soy idoneo, conozco todos los temas: " + t.getPalabrasClaveList().toString());
        return true;
    }

    protected boolean conozcoElTema(String tema) {
        return temasConocidosList.contains(tema);
    }

}
