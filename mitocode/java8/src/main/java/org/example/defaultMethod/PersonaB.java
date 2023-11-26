package org.example.defaultMethod;

public interface PersonaB {
    default public void hablar(){
        System.out.println("saludos coders. Desde Persona B");
    }
}
