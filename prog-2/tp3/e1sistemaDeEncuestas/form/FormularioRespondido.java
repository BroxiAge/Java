package tp3.e1sistemaDeEncuestas.form;

import tp3.e1sistemaDeEncuestas.personas.Encuestado;

import java.util.List;

public class FormularioRespondido extends Formulario{

    private Encuestado encuestado;
    private Formulario formulario;
    private List<String> preguntasRespondidas;

    public FormularioRespondido(int numeroFormulario) {
        super(numeroFormulario);
    }

    public FormularioRespondido() {
    }

    public FormularioRespondido(Encuestado encuestado, List<String> preguntasRespondidas, int numeroFormulario, Formulario formulario) {
        super(numeroFormulario);
        this.encuestado = encuestado;
        this.preguntasRespondidas = preguntasRespondidas;
        this.formulario = formulario;
    }


    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public List<String> getPreguntasRespondidas() {
        return preguntasRespondidas;
    }

    public void setPreguntasRespondidas(List<String> preguntasRespondidas) {
        this.preguntasRespondidas = preguntasRespondidas;
    }

    @Override
    public String toString() {
        return "FormularioRespondido{" +
                "encuestado=" + encuestado +
                ", formulario=" + formulario +
                ", preguntasRespondidas=" + preguntasRespondidas +
                '}';
    }
}
