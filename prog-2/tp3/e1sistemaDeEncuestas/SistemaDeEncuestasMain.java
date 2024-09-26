package tp3.e1sistemaDeEncuestas;

import tp3.e1sistemaDeEncuestas.form.Formulario;
import tp3.e1sistemaDeEncuestas.personas.Empleado;
import tp3.e1sistemaDeEncuestas.personas.Encuestado;

import java.util.List;

public class SistemaDeEncuestasMain {

    public static void main(String[] args) {

        Consultora c1 = new Consultora();

        Formulario form = new Formulario(1);
        Empleado empleado = new Empleado(form);

        List<String> respuestasList = List.of("Me encanta el producto", "El precio ta caro");
        Encuestado encuestado = new Encuestado(respuestasList);

        c1.addEncuesta(empleado.encuestar(encuestado));
        c1.addEncuesta(empleado.encuestar(encuestado));

    }
}


