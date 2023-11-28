package org.mitocode.anotaciones;

public class Anotaciones {

    public  @interface Lenguajes {
        Lenguaje[] value() default {};
    }

    public @interface Lenguaje{
        String value();
    }

    public interface LenguajeProgramacion {

    }
    public static void main(String[] args) {

    }
}
