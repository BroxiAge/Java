package tp3.e1sistemaDeEncuestas.personas;

import tp3.e1sistemaDeEncuestas.*;
import tp3.e1sistemaDeEncuestas.form.*;

public class Empleado extends Persona{

    private int cantEncuestasRealizadas;
    private Formulario form;
    private FormularioRespondido formularioRespondido;

    public Empleado(Formulario form) {
        this.form = form;
    }

    public void getCantEncuestasRealizadas() {
        System.out.println(cantEncuestasRealizadas);
    }

    public Encuesta encuestar(Encuestado encuestado) {
        this.cantEncuestasRealizadas ++;
        System.out.println("Encuestando a la persona: " + encuestado.toString());
        this.formularioRespondido = encuestado.responder(form);

        System.out.println("El formulario respondido es: " + formularioRespondido.toString());

        Encuesta encuesta = new Encuesta(form, encuestado, this);

        return encuesta;
    }
}
