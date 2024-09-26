package tp3.e1sistemaDeEncuestas.personas;

import tp3.e1sistemaDeEncuestas.form.*;

import java.util.List;

public class Encuestado extends Persona{

    FormularioRespondido formularioRespondido = new FormularioRespondido();
    List<String> respuestaList;

    public Encuestado(List<String> respuestaList) {
        this.respuestaList = respuestaList;
    }

    public FormularioRespondido responder(Formulario form) {
        System.out.println("Verifico si ya conteste el form");

        if (hasResponded(form)){

            FormularioRespondido fr = new FormularioRespondido(this, respuestaList, form.getNumeroFormulario(),form);
            this.formularioRespondido = fr;
            System.out.println("Retornando el formulario respondido");
            return fr;
        }
        System.out.println("El formulario ya ha sido firmado");
        return formularioRespondido;
    }

    private boolean hasResponded(Formulario form) {
        if (formularioRespondido.getNumeroFormulario() != form.getNumeroFormulario()) {
            return true;
        }
        return false;
    }

}
