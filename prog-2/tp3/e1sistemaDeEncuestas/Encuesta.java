package tp3.e1sistemaDeEncuestas;

import tp3.e1sistemaDeEncuestas.form.Formulario;
import tp3.e1sistemaDeEncuestas.personas.Persona;

public class Encuesta {

    Formulario formulario;
    Persona personaEncuestada;
    Persona empleado;


    public Encuesta(Formulario formulario, Persona personaEncuestada, Persona empleado) {
        this.formulario = formulario;
        this.personaEncuestada = personaEncuestada;
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Encuesta{" +
                "formulario=" + formulario +
                ", personaEncuestada=" + personaEncuestada +
                ", empleado=" + empleado +
                '}';
    }


}
