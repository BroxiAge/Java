package org.globalmentoring.excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador)
                               throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("No se puede dividir por 0 rey");
        }
        return numerador / denominador;
    }
}
